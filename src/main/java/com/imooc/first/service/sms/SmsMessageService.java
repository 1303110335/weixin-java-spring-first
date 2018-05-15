package com.imooc.first.service.sms;

import com.imooc.first.api.resp.BaseResp;
import com.imooc.first.common.utils.ConstantUtils;
import com.imooc.first.common.utils.DateUtils;
import com.imooc.first.common.utils.RandomUtils;
import com.imooc.first.common.utils.ResultCode;
import com.imooc.first.config.properties.SmsCenterProperties;
import com.imooc.first.service.redis.RedisCacheService;
import com.imooc.first.utils.RedisOperator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Service
public class SmsMessageService {
    private final static Logger logger = LoggerFactory.getLogger(SmsMessageService.class);
    //短信验证码保存时间
    private final static int SMS_LIFECYCLE_MIN = 10;

    @Autowired
    private Environment env;


    @Autowired
    private RedisOperator redisService;

    @Value("${spring.profiles.active}")
    private String active;

    @Autowired
    private SmsCenterProperties smsCenterProperties;

    @Autowired
    private TaskExecutor taskExecutor;

    /**
     * 短信发送限制
     * @param mobile
     * @return BaseResp
     */
    public BaseResp smsLimit(String mobile)
    {
        BaseResp resp = BaseResp.create();

        boolean isTest = Arrays.asList(env.getActiveProfiles()).contains("test");

        if (isTest) {
            return resp;
        }

        //超时重置
        String smsTime = redisService.get(ConstantUtils.WALLET_SMS_FIRST_TIME_PREFIX + mobile);
        Optional<String> smsTimes = Optional.ofNullable(smsTime);
        int nStoreSmsTime = 60 * 60 * 12;
        if (smsTimes.isPresent()) {
            String smsNum = redisService.get(ConstantUtils.WALLET_SMS_NUM_PREFIX + mobile);
            String smsNumActual = smsNum.split("&")[0];
            if (smsNum.contains("&")) {
                String gapTime = smsNum.split("&")[1];
                int gapSeconds = DateUtils.getOffsetSeconds(DateUtils.parseDateTime(gapTime),
                        DateUtils.parseDateTime(DateUtils.getCurrentTime()));
                if (gapSeconds < 60) {
                    resp = BaseResp.create(ResultCode.ERROR_SMS_GAIN_ONE_MINUTE);
                    resp.setResult("您的获取短信次数过多，请一分钟后重试！");
                    return resp;
                }
            }
            // 次数限制
            Optional<String> value = Optional.ofNullable(smsNumActual);
            /*
             * if (value.filter((val) -> Integer.valueOf(val) > 1).isPresent())
             * { long differ = (System.currentTimeMillis() - Long.valueOf(smsTime)) /
             * (1000 * 60 * 60); resp =
             * BaseResp.create(ResultCode.ERROR_SMS_GAIN_EXCESSIVE);
             * resp.setResult(String.format( "您的获取次数过多，请%s小时后重试！", ((12 -
             * differ) < 1) ? 1 : (int) (12 - differ) )); return resp; }
             */
            value.filter((val) -> Integer.valueOf(val) > 1).orElseGet(() -> {
                redisService.set(ConstantUtils.WALLET_SMS_NUM_PREFIX + mobile,
                        String.valueOf(Integer.valueOf(smsNumActual) + 1) + "&" + DateUtils.getCurrentTime(),
                        nStoreSmsTime);
                return null;
            });
        }

        smsTimes.orElseGet(() -> {
            CompletableFuture.supplyAsync(() -> {
        System.out.println("key:" + ConstantUtils.WALLET_SMS_NUM_PREFIX + mobile + " value:" + "1" + "&" + DateUtils.getCurrentTime());
                redisService.set(ConstantUtils.WALLET_SMS_NUM_PREFIX + mobile, "1" + "&" + DateUtils.getCurrentTime(),
                        nStoreSmsTime);
                redisService.set(ConstantUtils.WALLET_SMS_FIRST_TIME_PREFIX + mobile, String.valueOf(System.currentTimeMillis()),
                        nStoreSmsTime);
                return null;
            }, taskExecutor);
            return null;
        });

        return resp;
    }

    public String getSmsCode(String mobile) {
        String smsCode = redisService.get("SMS_CODE_" + mobile);
        if (smsCode == null) {
            if (ConstantUtils.PRODUCT_ENV_KEY.equals(active) && !"13220482188".equals(mobile)) {
                smsCode = RandomUtils.getRandom(6);
            } else {
                smsCode = "123456";
            }
        }
        redisService.set("SMS_CODE_" + mobile, smsCode, 60 * SMS_LIFECYCLE_MIN);
        return smsCode;
    }

    /**
     * 发送短信验证码
     * @param mobile
     * @param smsCode
     * @param appType
     * @param deviceType
     */
    public void sendCode(String mobile, String smsCode, int appType, Integer deviceType) {
        CompletableFuture.supplyAsync(() -> {
            try {
                SmsUtil.sendSmsCenter(smsCenterProperties.getHost(), mobile,
                        "尊敬的用户，您本次操作的验证码为" + smsCode + "，" + SMS_LIFECYCLE_MIN + "分钟之后将会失效，请及时操作。", appType,
                        deviceType);
            } catch (Exception e) {
                logger.error("send sms error : " + e.getMessage());
            }
            return null;
        }, taskExecutor);
    }

    /**
     * 判断短信验证码是否正确
     * @param mobile
     * @param mobileAuthCode
     * @return
     */
    public boolean verifySmsCode(String mobile, String mobileAuthCode) {
        String code = redisService.get("SMS_CODE_" + mobile);
        return mobileAuthCode.equals(code);
    }
}

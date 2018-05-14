package com.imooc.first.service.sms;

import com.imooc.first.api.resp.BaseResp;
import com.imooc.first.common.utils.ConstantUtils;
import com.imooc.first.common.utils.DateUtils;
import com.imooc.first.common.utils.ResultCode;
import com.imooc.first.service.redis.RedisCacheService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Service
public class SmsMessageService {
    private final static Logger logger = LoggerFactory.getLogger(SmsMessageService.class);

    @Autowired
    private Environment env;


    @Autowired
    private RedisCacheService redisService;

//    @Autowired
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
                redisService.put(ConstantUtils.WALLET_SMS_NUM_PREFIX + mobile,
                        String.valueOf(Integer.valueOf(smsNumActual) + 1) + "&" + DateUtils.getCurrentTime(),
                        nStoreSmsTime);
                return null;
            });
        }

        smsTimes.orElseGet(() -> {
            CompletableFuture.supplyAsync(() -> {
                redisService.put(ConstantUtils.WALLET_SMS_NUM_PREFIX + mobile, "1" + "&" + DateUtils.getCurrentTime(),
                        nStoreSmsTime);
                redisService.put(ConstantUtils.WALLET_SMS_FIRST_TIME_PREFIX + mobile, String.valueOf(System.currentTimeMillis()),
                        nStoreSmsTime);
                return null;
            }, taskExecutor);
            return null;
        });

        return resp;
    }
}

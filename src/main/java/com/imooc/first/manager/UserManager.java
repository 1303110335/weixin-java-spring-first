package com.imooc.first.manager;

import com.imooc.first.api.req.user.GetSmsCodeReq;
import com.imooc.first.api.resp.BaseResp;
import com.imooc.first.common.utils.ConstantUtils;
import com.imooc.first.common.utils.ResultCode;
import com.imooc.first.common.utils.VerifyUtils;
import com.imooc.first.model.SUser;
import com.imooc.first.service.core.SUserService;
import com.imooc.first.service.redis.RedisCacheService;
import com.imooc.first.service.sms.SmsMessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager {

    private static final Logger logger = LoggerFactory.getLogger(UserManager.class);

    @Autowired
    private SUserService sUserService;

    @Autowired
    private SmsMessageService smsMessageService;


    public BaseResp getSmsCode(final GetSmsCodeReq getSmsCodeReq) {
        BaseResp resp = null;

        if (!VerifyUtils.verifyMobile(getSmsCodeReq.getMobile())) {
            return BaseResp.create(ResultCode.ERROR_APP_USER_MOBILE_FORMAT);
        }

        SUser sUser = sUserService.getByUsername(getSmsCodeReq.getMobile());
        logger.info("----------ym_ip地址--ymsmscode--" + getSmsCodeReq.getMobile() + "-----------"
                    + getSmsCodeReq.getIp());
        if (sUser == null || sUser.getStatus() == 0) {
            return BaseResp.create(ResultCode.ERROR_USER_UNLOGIN);
        }

        //短信发送限制
        resp = smsMessageService.smsLimit(getSmsCodeReq.getMobile());
        if (!resp.getCode().equals(ResultCode.NORMAL.getCode())) {
            return resp;
        }



        return BaseResp.create(ResultCode.NORMAL);
    }
}

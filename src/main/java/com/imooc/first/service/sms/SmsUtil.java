package com.imooc.first.service.sms;

import com.alibaba.fastjson.JSONObject;
import com.imooc.first.common.utils.HttpUtils;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SmsUtil {
    private static Logger logger = LoggerFactory.getLogger(SmsUtil.class);

    /**
     *
     * @param url
     * @param mobile
     * @param msg
     * @param appType
     * @param deviceType
     */
    public static String sendSmsCenter(String url, String mobile, String msg, int appType, Integer deviceType) {
        List<Header> headers = new ArrayList<>();
        headers.add(new BasicHeader("Content-type", "application/json"));

        SmsModel smsModel = new SmsModel();
        smsModel.setMobile(mobile);
        smsModel.setAppType(appType);
        smsModel.setDeviceType(deviceType);
        smsModel.setMsg(msg);
        String parameter = JSONObject.toJSONString(smsModel);

        try {
            logger.warn(String.format("Sms request host is %s, mobile(%s), msg(%s)", url, mobile, msg));
            logger.warn(HttpUtils.post(url, headers, parameter));
        } catch (IOException e) {
            logger.error(String.format("Send sms exception: mobile(%s), msg(%s)", mobile, msg));
        }

        return "";
    }
}

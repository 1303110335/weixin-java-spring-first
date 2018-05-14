package com.imooc.first.api.req;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class BaseReq implements Serializable {
    private String token;
    private Long userId;
    private String ip;

    @NotNull(message = "sign不能为空")
    private String sign;
    @NotNull(message = "timestamp不能为空")
    private Long timestamp;
    @NotNull(message = "deviceSerialId不能为空")
    private String deviceSerialId;
    @NotNull(message = "version不能为空")
    private String version;
    @NotNull(message = "appType不能为空")
    private Integer appType;
    @NotNull(message = "deviceType不能为空")
    private Integer deviceType;
    @NotNull(message = "phoneSystemVersion不能为空")
    private String phoneSystemVersion;
    @NotNull(message = "channel不能为空")
    private String channel;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getDeviceSerialId() {
        return deviceSerialId;
    }

    public void setDeviceSerialId(String deviceSerialId) {
        this.deviceSerialId = deviceSerialId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public String getPhoneSystemVersion() {
        return phoneSystemVersion;
    }

    public void setPhoneSystemVersion(String phoneSystemVersion) {
        this.phoneSystemVersion = phoneSystemVersion;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}

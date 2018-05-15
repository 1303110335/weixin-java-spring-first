package com.imooc.first.api.resp;

import com.imooc.first.common.utils.DesensitizationUtils;

public class LoginResp {
    private Integer loginType = 1;
    private String loginTypeTip = "登录成功！";
    private String token;
    private String username;
    private Long userId;
    private String avatar;
    private Integer personMessageCount;
    private Integer systemMessageCount;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getLoginType() {
        return loginType;
    }

    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }

    public String getLoginTypeTip() {
        return loginTypeTip;
    }

    public void setLoginTypeTip(String loginTypeTip) {
        this.loginTypeTip = loginTypeTip;
    }

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = DesensitizationUtils.getMobile(username);
    }

    public Integer getPersonMessageCount() {
        return personMessageCount;
    }

    public void setPersonMessageCount(Integer personMessageCount) {
        this.personMessageCount = personMessageCount;
    }

    public Integer getSystemMessageCount() {
        return systemMessageCount;
    }

    public void setSystemMessageCount(Integer systemMessageCount) {
        this.systemMessageCount = systemMessageCount;
    }
}

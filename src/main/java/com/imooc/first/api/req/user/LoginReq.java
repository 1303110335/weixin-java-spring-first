package com.imooc.first.api.req.user;

import com.imooc.first.api.req.BaseReq;

import javax.validation.constraints.NotEmpty;

/**
 * Created by zzqana on 7/27/2016.
 */
public class LoginReq extends BaseReq {

    @NotEmpty(message = "mobile不能为空")
    private String mobile;
    @NotEmpty(message = "请输入验证码")
    private String mobileAuthCode;
    private String registrationId;
    private String supperUserId;
    private String invitation_code;

    public String getInvitation_code() {
        return invitation_code;
    }

    public void setInvitation_code(String invitation_code) {
        this.invitation_code = invitation_code;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobileAuthCode() {
        return mobileAuthCode;
    }

    public void setMobileAuthCode(String mobileAuthCode) {
        this.mobileAuthCode = mobileAuthCode;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public String getSupperUserId() {
        return supperUserId;
    }

    public void setSupperUserId(String supperUserId) {
        this.supperUserId = supperUserId;
    }
}


package com.imooc.first.model;

import java.util.Date;

public class SUser {
    private Long id;
    /**
     * 用户手机号
     */
    private String username;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 用户支付密码
     */
    private String payPassword;
    private String realName;
    private Integer realNameAuth;
    private Integer cardType;
    private String cardNo;
    private Integer cardNoAuth;
    private String mobile;
    private Integer mobileAuth;
    private String email;
    private Integer emailAuth;
    private String qqNo;
    private String wxNo;
    private String openId;
    private Integer sex;
    private String birthday;
    private String avatar;
    private Integer type;
    private Integer level;
    private Integer status;
    private Long supperUserId;
    private String deviceSerialId;
    private String deviceId;
    private String phoneSystemVersion;
    private Integer deviceType;
    private String channel;
    private Integer channelId;
    private String salt;
    private String registrationId;
    private Integer toWallet;
    private Integer newmoney;
    private Date addTime;
    private Long addUserId;
    private Date modifyTime;
    private Long modifyUserId;
    private String province;
    private Long inviterId;
    /**
     * 邀请人手机号
     */
    private String inviterMobile;
    private String inviterCode;

    public String getInviterCode() {
        return inviterCode;
    }

    public void setInviterCode(String inviterCode) {
        this.inviterCode = inviterCode;
    }

    private Integer isDeleted;
    public String rechargeNo;
    private Integer appType;
    private String token;
    private Integer payWay;

    public String getInviterMobile() {
        return inviterMobile;
    }

    public void setInviterMobile(String inviterMobile) {
        this.inviterMobile = inviterMobile;
    }

    public Integer getPayWay() {
        return payWay;
    }

    public void setPayWay(Integer payWay) {
        this.payWay = payWay;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRechargeNo() {
        return rechargeNo;
    }

    public void setRechargeNo(String rechargeNo) {
        this.rechargeNo = rechargeNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getRealNameAuth() {
        return realNameAuth;
    }

    public void setRealNameAuth(Integer realNameAuth) {
        this.realNameAuth = realNameAuth;
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Integer getCardNoAuth() {
        return cardNoAuth;
    }

    public void setCardNoAuth(Integer cardNoAuth) {
        this.cardNoAuth = cardNoAuth;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getMobileAuth() {
        return mobileAuth;
    }

    public void setMobileAuth(Integer mobileAuth) {
        this.mobileAuth = mobileAuth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEmailAuth() {
        return emailAuth;
    }

    public void setEmailAuth(Integer emailAuth) {
        this.emailAuth = emailAuth;
    }

    public String getQqNo() {
        return qqNo;
    }

    public void setQqNo(String qqNo) {
        this.qqNo = qqNo;
    }

    public String getWxNo() {
        return wxNo;
    }

    public void setWxNo(String wxNo) {
        this.wxNo = wxNo;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getSupperUserId() {
        return supperUserId;
    }

    public void setSupperUserId(Long supperUserId) {
        this.supperUserId = supperUserId;
    }

    public String getDeviceSerialId() {
        return deviceSerialId;
    }

    public void setDeviceSerialId(String deviceSerialId) {
        this.deviceSerialId = deviceSerialId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getPhoneSystemVersion() {
        return phoneSystemVersion;
    }

    public void setPhoneSystemVersion(String phoneSystemVersion) {
        this.phoneSystemVersion = phoneSystemVersion;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public Integer getToWallet() {
        return toWallet;
    }

    public void setToWallet(Integer toWallet) {
        this.toWallet = toWallet;
    }

    public Integer getNewmoney() {
        return newmoney;
    }

    public void setNewmoney(Integer newmoney) {
        this.newmoney = newmoney;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Long getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(Long addUserId) {
        this.addUserId = addUserId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(Long modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Long getInviterId() {
        return inviterId;
    }

    public void setInviterId(Long inviterId) {
        this.inviterId = inviterId;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
    }
}
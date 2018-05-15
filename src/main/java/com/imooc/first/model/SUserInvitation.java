package com.imooc.first.model;

import java.util.Date;

public class SUserInvitation {

    private Integer id;
    private Integer type;
    private Integer appType;
    private Long userId;
    private Long invitedUserId;
    private String invitedPhone;
    private String invitedCardno;
    private Integer invitedSuccess;
    private Date successTime;
    private Date addTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getInvitedUserId() {
        return invitedUserId;
    }

    public void setInvitedUserId(Long invitedUserId) {
        this.invitedUserId = invitedUserId;
    }

    public String getInvitedPhone() {
        return invitedPhone;
    }

    public void setInvitedPhone(String invitedPhone) {
        this.invitedPhone = invitedPhone;
    }

    public String getInvitedCardno() {
        return invitedCardno;
    }

    public void setInvitedCardno(String invitedCardno) {
        this.invitedCardno = invitedCardno;
    }

    public Integer getInvitedSuccess() {
        return invitedSuccess;
    }

    public void setInvitedSuccess(Integer invitedSuccess) {
        this.invitedSuccess = invitedSuccess;
    }

    public Date getSuccessTime() {
        return successTime;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    public Date getAddTime(Date date) {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
    }
}

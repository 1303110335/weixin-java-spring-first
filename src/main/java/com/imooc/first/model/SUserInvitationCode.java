package com.imooc.first.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author xuleyan
 * @Time 2018/05/15
 */
public class SUserInvitationCode {

    private Integer id;
    private String invitationCode;
    private Long userId;
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

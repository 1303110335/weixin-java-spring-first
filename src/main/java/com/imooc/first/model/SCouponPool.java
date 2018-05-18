package com.imooc.first.model;

import java.math.BigDecimal;
import java.util.Date;

public class SCouponPool {
    private Integer id;
    private Integer appType;
    private String title;
    private Integer type;
    private String label;
    private String desc;
    private Integer lotterySceneType;
    private Date finalStartTime;
    private Date finalEndTime;
    private Date addTime;
    private Long addUserId;
    private Date modifyTime;
    private Long modifyUserId;
    private Integer isDeleted;
    private BigDecimal budgetAmount;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getLotterySceneType() {
        return lotterySceneType;
    }

    public void setLotterySceneType(Integer lotterySceneType) {
        this.lotterySceneType = lotterySceneType;
    }

    public Date getFinalStartTime() {
        return finalStartTime;
    }

    public void setFinalStartTime(Date finalStartTime) {
        this.finalStartTime = finalStartTime;
    }

    public Date getFinalEndTime() {
        return finalEndTime;
    }

    public void setFinalEndTime(Date finalEndTime) {
        this.finalEndTime = finalEndTime;
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

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public BigDecimal getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(BigDecimal budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
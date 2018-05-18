package com.imooc.first.model;

import java.math.BigDecimal;
import java.util.Date;

public class SUserCoupon {
    private Integer id;
    private Long userId;
    private Integer couponId;
    private Long investDetailId;
    private String rechargeNo;
    private String fromRechargeNo;
    private Integer finalDay;
    private BigDecimal finalAmount;
    private String redemptionCode;
    private Date gainTime;
    private Date expireTime;
    private Integer lotterySceneType;
    private Integer status;
    private Integer sourceType;
    private Date addTime;
    private Long addUserId;
    private Date modifyTime;
    private Long modifyUserId;
    private Integer isDeleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Long getInvestDetailId() {
        return investDetailId;
    }

    public void setInvestDetailId(Long investDetailId) {
        this.investDetailId = investDetailId;
    }

    public String getRechargeNo() {
        return rechargeNo;
    }

    public void setRechargeNo(String rechargeNo) {
        this.rechargeNo = rechargeNo;
    }

    public String getFromRechargeNo() {
        return fromRechargeNo;
    }

    public void setFromRechargeNo(String fromRechargeNo) {
        this.fromRechargeNo = fromRechargeNo;
    }

    public Integer getFinalDay() {
        return finalDay;
    }

    public void setFinalDay(Integer finalDay) {
        this.finalDay = finalDay;
    }

    public BigDecimal getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(BigDecimal finalAmount) {
        this.finalAmount = finalAmount;
    }

    public String getRedemptionCode() {
        return redemptionCode;
    }

    public void setRedemptionCode(String redemptionCode) {
        this.redemptionCode = redemptionCode;
    }

    public Date getGainTime() {
        return gainTime;
    }

    public void setGainTime(Date gainTime) {
        this.gainTime = gainTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getLotterySceneType() {
        return lotterySceneType;
    }

    public void setLotterySceneType(Integer lotterySceneType) {
        this.lotterySceneType = lotterySceneType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
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
}
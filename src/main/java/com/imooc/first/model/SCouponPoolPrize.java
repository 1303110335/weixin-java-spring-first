package com.imooc.first.model;

import java.math.BigDecimal;
import java.util.Date;

public class SCouponPoolPrize {
    private Integer id;
    private Integer poolId;
    private Integer couponId;
    private Integer prizeMustScene;
    private Integer prizeOrder;
    private Integer prizeStatus;
    private BigDecimal prizeChance;
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

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getPrizeMustScene() {
        return prizeMustScene;
    }

    public void setPrizeMustScene(Integer prizeMustScene) {
        this.prizeMustScene = prizeMustScene;
    }

    public Integer getPrizeOrder() {
        return prizeOrder;
    }

    public void setPrizeOrder(Integer prizeOrder) {
        this.prizeOrder = prizeOrder;
    }

    public Integer getPrizeStatus() {
        return prizeStatus;
    }

    public void setPrizeStatus(Integer prizeStatus) {
        this.prizeStatus = prizeStatus;
    }

    public BigDecimal getPrizeChance() {
        return prizeChance;
    }

    public void setPrizeChance(BigDecimal prizeChance) {
        this.prizeChance = prizeChance;
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
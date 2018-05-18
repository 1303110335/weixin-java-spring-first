package com.imooc.first.model;

import java.math.BigDecimal;
import java.util.Date;

public class SUserAccount {
    private Long id;
    private Long userId;
    private BigDecimal totalInvestCapital;
    private BigDecimal totalInvestInterest;
    private BigDecimal accountTotal;
    private BigDecimal accountAble;
    private BigDecimal accountFreeze;
    private BigDecimal waitAmount;
    private BigDecimal waitCapital;
    private BigDecimal waitInterest;
    private Integer integration;
    private BigDecimal stoneMoney;
    private BigDecimal walletTotle;
    private BigDecimal walletEnableInterest;
    private BigDecimal walletInterest;
    private BigDecimal walletInterestTotle;
    private BigDecimal walletProductInterest;
    private Date walletLastInterestTime;
    private Integer bkChance;
    private Integer toWallet;
    private Date addTime;
    private Long addUserId;
    private Date modifyTime;
    private Long modifyUserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getTotalInvestCapital() {
        return totalInvestCapital;
    }

    public void setTotalInvestCapital(BigDecimal totalInvestCapital) {
        this.totalInvestCapital = totalInvestCapital;
    }

    public BigDecimal getTotalInvestInterest() {
        return totalInvestInterest;
    }

    public void setTotalInvestInterest(BigDecimal totalInvestInterest) {
        this.totalInvestInterest = totalInvestInterest;
    }

    public BigDecimal getAccountTotal() {
        return accountTotal;
    }

    public void setAccountTotal(BigDecimal accountTotal) {
        this.accountTotal = accountTotal;
    }

    public BigDecimal getAccountAble() {
        return accountAble;
    }

    public void setAccountAble(BigDecimal accountAble) {
        this.accountAble = accountAble;
    }

    public BigDecimal getAccountFreeze() {
        return accountFreeze;
    }

    public void setAccountFreeze(BigDecimal accountFreeze) {
        this.accountFreeze = accountFreeze;
    }

    public BigDecimal getWaitAmount() {
        return waitAmount;
    }

    public void setWaitAmount(BigDecimal waitAmount) {
        this.waitAmount = waitAmount;
    }

    public BigDecimal getWaitCapital() {
        return waitCapital;
    }

    public void setWaitCapital(BigDecimal waitCapital) {
        this.waitCapital = waitCapital;
    }

    public BigDecimal getWaitInterest() {
        return waitInterest;
    }

    public void setWaitInterest(BigDecimal waitInterest) {
        this.waitInterest = waitInterest;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public BigDecimal getStoneMoney() {
        return stoneMoney;
    }

    public void setStoneMoney(BigDecimal stoneMoney) {
        this.stoneMoney = stoneMoney;
    }

    public BigDecimal getWalletTotle() {
        return walletTotle;
    }

    public void setWalletTotle(BigDecimal walletTotle) {
        this.walletTotle = walletTotle;
    }

    public BigDecimal getWalletEnableInterest() {
        return walletEnableInterest;
    }

    public void setWalletEnableInterest(BigDecimal walletEnableInterest) {
        this.walletEnableInterest = walletEnableInterest;
    }

    public BigDecimal getWalletInterest() {
        return walletInterest;
    }

    public void setWalletInterest(BigDecimal walletInterest) {
        this.walletInterest = walletInterest;
    }

    public BigDecimal getWalletInterestTotle() {
        return walletInterestTotle;
    }

    public void setWalletInterestTotle(BigDecimal walletInterestTotle) {
        this.walletInterestTotle = walletInterestTotle;
    }

    public BigDecimal getWalletProductInterest() {
        return walletProductInterest;
    }

    public void setWalletProductInterest(BigDecimal walletProductInterest) {
        this.walletProductInterest = walletProductInterest;
    }

    public Date getWalletLastInterestTime() {
        return walletLastInterestTime;
    }

    public void setWalletLastInterestTime(Date walletLastInterestTime) {
        this.walletLastInterestTime = walletLastInterestTime;
    }

    public Integer getBkChance() {
        return bkChance;
    }

    public void setBkChance(Integer bkChance) {
        this.bkChance = bkChance;
    }

    public Integer getToWallet() {
        return toWallet;
    }

    public void setToWallet(Integer toWallet) {
        this.toWallet = toWallet;
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
}
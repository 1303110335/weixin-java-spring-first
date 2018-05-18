package com.imooc.first.model;

import java.math.BigDecimal;

/**
 * Created by lilyx on 2016/11/23.
 */
public class YdjrUserAccount {
    private int number;
    private String userName;
    private String realName;
    private Long userId;
    private BigDecimal walletTotal;
    private BigDecimal walletEnableInterest;
    private BigDecimal walletInterest;

    public BigDecimal getWalletTotal() {
        return walletTotal;
    }

    public void setWalletTotal(BigDecimal walletTotal) {
        this.walletTotal = walletTotal;
    }

    public BigDecimal getWalletInterest() {
        return walletInterest;
    }

    public void setWalletInterest(BigDecimal walletInterest) {
        this.walletInterest = walletInterest;
    }

    public BigDecimal getWalletEnableInterest() {
        return walletEnableInterest;
    }

    public void setWalletEnableInterest(BigDecimal walletEnableInterest) {
        this.walletEnableInterest = walletEnableInterest;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

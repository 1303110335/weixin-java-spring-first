package com.imooc.first.api.resp.account;

import java.math.BigDecimal;

/**
 * Created by zzqana on 8/16/2016.
 */
public class AccountAssetsResp {
    private String walletTotle;
    private String yesterdayInterest;
    private String accumulationTotle;
    private String experienceYesterdayInterest; //体验金昨日收益
    private String experienceAccumulationTotle; //体验金累计收益
    private String experienceTotle; //体验金总额
    private int remainDays; //体验金剩余天数

    public int getRemainDays() {
        return remainDays;
    }

    public void setRemainDays(int remainDays) {
        this.remainDays = remainDays;
    }

    public String getExperienceTotle() {
        return experienceTotle;
    }

    public void setExperienceTotle(BigDecimal experienceTotle) {
        this.experienceTotle = experienceTotle.toPlainString();
    }

    public String getWalletTotle() {
        return walletTotle;
    }

    public void setWalletTotle(BigDecimal walletTotle) {
        this.walletTotle = walletTotle.toPlainString();
    }

    public String getYesterdayInterest() {
        return yesterdayInterest;
    }

    public void setYesterdayInterest(BigDecimal yesterdayInterest) {
        if (yesterdayInterest == null) {
            this.yesterdayInterest = new BigDecimal("0.0000").toPlainString();
        } else {
            this.yesterdayInterest = yesterdayInterest.toPlainString();
        }
    }

    public String getAccumulationTotle() {
        return accumulationTotle;
    }

    public void setAccumulationTotle(BigDecimal accumulationTotle) {
        this.accumulationTotle = accumulationTotle.toPlainString();
    }

    public String getExperienceAccumulationTotle() {
        return experienceAccumulationTotle;
    }

    public void setExperienceAccumulationTotle(BigDecimal experienceAccumulationTotle) {
        this.experienceAccumulationTotle = experienceAccumulationTotle.toPlainString();
    }

    public String getExperienceYesterdayInterest() {
        return experienceYesterdayInterest;
    }

    public void setExperienceYesterdayInterest(BigDecimal experienceYesterdayInterest) {
        if (experienceYesterdayInterest == null) {
            this.experienceYesterdayInterest = new BigDecimal("0.0000").toPlainString();
        } else {
            this.experienceYesterdayInterest = experienceYesterdayInterest.toPlainString();
        }
    }
}

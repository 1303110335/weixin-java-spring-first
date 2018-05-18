package com.imooc.first.api.resp.platform;

import com.imooc.first.common.utils.DesensitizationUtils;
import com.imooc.first.common.utils.StringUtils;

import java.text.DecimalFormat;

/**
 * Created by zzqana on 8/31/2016.
 */
public class PlatformWalletLeagueData {
    private Integer top;
    private String mobile;
    private String amount;

    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = DesensitizationUtils.getMobile(mobile);
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        DecimalFormat df = new DecimalFormat("#0.0000");
        this.amount = df.format(amount);
    }

    public void setInvestAmount(Double amount) {
        this.amount = StringUtils.getDoubleFormatString2(amount);
    }

    public void setInterestAmount(Double amount) {
        this.amount = StringUtils.getDoubleFormatString4(amount);
    }

}

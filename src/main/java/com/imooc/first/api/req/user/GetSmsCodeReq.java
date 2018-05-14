package com.imooc.first.api.req.user;

import com.imooc.first.api.req.BaseReq;

import javax.validation.constraints.NotNull;

public class GetSmsCodeReq extends BaseReq {
    @NotNull(message = "mobile不能为空")
    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}

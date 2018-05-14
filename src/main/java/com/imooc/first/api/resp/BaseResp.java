package com.imooc.first.api.resp;

import com.imooc.first.common.utils.ResultCode;
import com.imooc.first.common.utils.StringUtils;

import java.io.Serializable;

public class BaseResp<T> implements Serializable {
    private String code;

    private T result;

    private Integer errorType;

    private String errorMsg;

    private boolean isSuccess = true;

    private BaseResp() {
        this.code = ResultCode.NORMAL.getCode();
        this.errorMsg = ResultCode.NORMAL.getMsg();
    }

    private BaseResp(T result) {
        this.code = ResultCode.NORMAL.getCode();
        this.errorMsg = ResultCode.NORMAL.getMsg();
        this.result = result;
    }

    private BaseResp(ResultCode resultCode) {
        if (resultCode == null) {
            this.code = ResultCode.ERROR_SYSTEM.getCode();
            this.errorMsg = ResultCode.ERROR_SYSTEM.getMsg();
        } else {
            this.code = resultCode.getCode();
            this.errorMsg = resultCode.getMsg();
        }
        if (resultCode != null && resultCode.getCode().equals(ResultCode.NORMAL.getCode())) {
            this.isSuccess = true;
        } else {
            this.isSuccess = false;
        }
        this.result = null;
    }

    public static BaseResp create(ResultCode resultCode) {
        return new BaseResp(resultCode);
    }

    public static BaseResp create(ResultCode resultCode, String errorMsg) {
        BaseResp baseResp = new BaseResp(resultCode);
        baseResp.setErrorMsg(errorMsg);
        return baseResp;
    }

    public static BaseResp create(ResultCode resultCode, String errorCode, String errorMsg) {
        BaseResp baseResp = new BaseResp(resultCode);
        if (!StringUtils.isEmpty(errorCode)) {
            baseResp.setCode(errorCode);
        }
        if (!StringUtils.isEmpty(errorMsg)) {
            baseResp.setErrorMsg(errorMsg);
        }
        return baseResp;
    }


    public static BaseResp create() {
        return new BaseResp();
    }

    public static BaseResp create(Object result) {
        return new BaseResp(result);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public Integer getErrorType() {
        return errorType;
    }

    public void setErrorType(Integer errorType) {
        this.errorType = errorType;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }
}

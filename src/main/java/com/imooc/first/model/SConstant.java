package com.imooc.first.model;

import java.util.Date;

public class SConstant {
    private Integer id;
    private Integer parentId;
    private String consKey;
    private String consValue;
    private String consDesc;
    private Date addTime;
    private Long addUserId;
    private Date modifyTime;
    private Long modifyUserId;
    private Integer isFloat;
    private String packageName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getConsKey() {
        return consKey;
    }

    public void setConsKey(String consKey) {
        this.consKey = consKey;
    }

    public String getConsValue() {
        return consValue;
    }

    public void setConsValue(String consValue) {
        this.consValue = consValue;
    }

    public String getConsDesc() {
        return consDesc;
    }

    public void setConsDesc(String consDesc) {
        this.consDesc = consDesc;
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

    public Integer getIsFloat() {
        return isFloat;
    }

    public void setIsFloat(Integer isFloat) {
        this.isFloat = isFloat;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
}
package com.imooc.first.model;

public class SChannelPromotion {
    private Integer id;
    private String storgeKey;
    private String storgeData;
    private String source;
    private String flat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStorgeKey() {
        return storgeKey;
    }

    public void setStorgeKey(String storgeKey) {
        this.storgeKey = storgeKey;
    }

    public String getStorgeData() {
        return storgeData;
    }

    public void setStorgeData(String storgeData) {
        this.storgeData = storgeData;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }
}
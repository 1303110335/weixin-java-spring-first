package com.imooc.first.helper.lottery;

/**
 * Created by zzqana on 3/29/2016.
 */
public class Gift {
    /**
     * 索引
     */
    private int index;
    /**
     * 礼物ID
     */
    private Integer gitfId;
    /**
     * 礼物必中场景
     */
    private Integer giftMustScene;
    /**
     * 礼物概率
     */
    private double probability;

    public Gift(int index, Integer gitfId, Integer giftMustScene, double probability) {
        this.index = index;
        this.gitfId = gitfId;
        this.giftMustScene = giftMustScene;
        this.probability = probability;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Integer getGitfId() {
        return gitfId;
    }

    public void setGitfId(Integer gitfId) {
        this.gitfId = gitfId;
    }

    public Integer getGiftMustScene() {
        return giftMustScene;
    }

    public void setGiftMustScene(Integer giftMustScene) {
        this.giftMustScene = giftMustScene;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    @Override
    public String toString() {
        return "Gift{" +
               "index=" + index +
               ", gitfId='" + gitfId + '\'' +
               ", giftMustScene='" + giftMustScene + '\'' +
               ", probability=" + probability +
               '}';
    }
}

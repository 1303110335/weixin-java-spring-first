package com.imooc.first.api.resp.message;

import java.util.Date;

/**
 * Created by zzqana on 8/26/2016.
 */
public class PersonMessageResp {
    private Long id;
    private String title;
    private Integer isRead;
    private Date addTime;
    private Integer contentId;
    private Integer action;
    private String summary;
    private String content;
    private String ext;
    private String url;

    /**发送消息者ID(0则为系统发送)**/
    private Long senderUid;

    /**'接受者ID'**/
    private Long recipientUid;

    /**是否已删除(0:未删除/1:已删除)**/
    private Integer isDelete;

    /**APP类型**/
    private Integer appType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getSenderUid() {
        return senderUid;
    }

    public void setSenderUid(Long senderUid) {
        this.senderUid = senderUid;
    }

    public Long getRecipientUid() {
        return recipientUid;
    }

    public void setRecipientUid(Long recipientUid) {
        this.recipientUid = recipientUid;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
    }
}

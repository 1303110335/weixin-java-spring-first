package com.imooc.first.service.core;

import com.imooc.first.api.resp.message.PersonMessageResp;

import java.util.List;

public interface SMessagePersonalService {
    public List<PersonMessageResp> getMessageByUserId(Long userId, Integer pageNo, Integer limit);

    public Integer readPersonMessage(Long userId, Integer id);

    public Integer getUnreadCount(Long userId);

    /**
     * 插入个人消息
     *
     * @param personMessage
     */
    public void insertPersonMessage(PersonMessageResp personMessage);

}
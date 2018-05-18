package com.imooc.first.dao;

import com.imooc.first.api.resp.message.PersonMessageResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SMessagePersonalDao {
    public List<PersonMessageResp> getMessageByUserId(
            @Param("recipientUid") Long userId,
            @Param("pageNo") Integer pageNo,
            @Param("limit") Integer limit
    );

    public Integer readPersonMessage(@Param("recipientUid") Long userId, @Param("id") Integer id);

    public Integer getUnreadCount(@Param("recipientUid") Long userId);

    /**
     * 插入个人消息
     *
     * @param personMessage
     */
    public void insertPersonMessage(PersonMessageResp personMessage);

    /**
     * 插入个人消息内容
     *
     * @param personMessage
     */
    public Integer insertPersonMessageContent(PersonMessageResp personMessage);
}
package com.imooc.first.service.core.impl;

import com.imooc.first.api.resp.message.PersonMessageResp;
import com.imooc.first.dao.SMessagePersonalDao;
import com.imooc.first.service.core.SMessagePersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SMessagePersonalServiceImpl implements SMessagePersonalService {
    @Autowired
    private SMessagePersonalDao sMessagePersonalDao;

    @Override
    public List<PersonMessageResp> getMessageByUserId(Long userId, Integer pageNo, Integer limit) {
        return sMessagePersonalDao.getMessageByUserId(userId, pageNo, limit);
    }

    @Override
    public Integer readPersonMessage(Long userId, Integer id) {
        return sMessagePersonalDao.readPersonMessage(userId, id);
    }

    @Override
    public Integer getUnreadCount(Long userId) {
        if (userId == null) {
            return 0;
        }
        return sMessagePersonalDao.getUnreadCount(userId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insertPersonMessage(PersonMessageResp personMessage) {
        int insertFlag = sMessagePersonalDao.insertPersonMessageContent(personMessage);
        if (insertFlag > 0) {
            personMessage.setContentId(personMessage.getId().intValue());
            sMessagePersonalDao.insertPersonMessage(personMessage);
        }
    }

}
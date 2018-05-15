package com.imooc.first.service.core.impl;

import com.imooc.first.api.resp.BaseResp;
import com.imooc.first.dao.SUserInvitationCodeDao;
import com.imooc.first.model.SUserInvitation;
import com.imooc.first.model.SUserInvitationCode;
import com.imooc.first.model.SUserInvitationReward;
import com.imooc.first.service.core.SUserInvitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("sUserInvitationService")
public class SUserInvitationServiceImpl implements SUserInvitationService {

    @Autowired
    private SUserInvitationCodeDao sUserInvitationCodeDao;

    @Override
    public List<SUserInvitation> selectByMap(Map<String, Object> params) {
        return null;
    }

    @Override
    public int insertSelective(SUserInvitation record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(SUserInvitation record) {
        return 0;
    }

    @Override
    public SUserInvitation inviteUserSuccess(Integer type, Integer appType, Long userId, Long invitedUserId, String invitedPhone) {
        return null;
    }

    @Override
    public SUserInvitation invitedUserPaySuccess(Long invitedUserId, String invitedCardno) {
        return null;
    }

    @Override
    public SUserInvitationCode selectByCode(String code) {
        return sUserInvitationCodeDao.selectByCode(code);
    }

    @Override
    public int addSUserInvitation(SUserInvitation sUserInvitation) {
        return 0;
    }

    @Override
    public List<SUserInvitationReward> rewardList(Map<String, Object> param) {
        return null;
    }

    @Override
    public BaseResp inviteLimit(String inviteCode) {
        return null;
    }
}

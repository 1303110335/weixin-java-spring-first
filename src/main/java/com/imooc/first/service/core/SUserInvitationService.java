package com.imooc.first.service.core;

import com.imooc.first.api.resp.BaseResp;
import com.imooc.first.model.SUserInvitationReward;
import com.imooc.first.model.SUserInvitation;
import com.imooc.first.model.SUserInvitationCode;

import java.util.List;
import java.util.Map;

public interface SUserInvitationService {
    public List<SUserInvitation> selectByMap(Map<String, Object> params);

    int insertSelective(SUserInvitation record);

    int updateByPrimaryKeySelective(SUserInvitation record);

    SUserInvitation inviteUserSuccess(
            Integer type, Integer appType, Long userId,
            Long invitedUserId, String invitedPhone
    );

    SUserInvitation invitedUserPaySuccess(Long invitedUserId, String invitedCardno);

    SUserInvitationCode selectByCode(String code);

    int addSUserInvitation(SUserInvitation sUserInvitation);

    List<SUserInvitationReward> rewardList(Map<String, Object> param);

    BaseResp inviteLimit(String inviteCode);

}

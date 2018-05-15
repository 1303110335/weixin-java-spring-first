package com.imooc.first.dao;

import com.imooc.first.model.SUserInvitationCode;

public interface SUserInvitationCodeDao {
    int insertSUserInvitationCode(SUserInvitationCode code);

    SUserInvitationCode selectByUserId(Long userId);

    SUserInvitationCode selectByCode(String code);
}

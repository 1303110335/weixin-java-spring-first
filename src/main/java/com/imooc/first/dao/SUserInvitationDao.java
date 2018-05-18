package com.imooc.first.dao;

import com.imooc.first.model.SUserInvitation;

import java.util.List;
import java.util.Map;

public interface SUserInvitationDao {

    SUserInvitation selectByPrimaryKey(Integer id);

    int insertSelective(SUserInvitation record);

    int updateByPrimaryKeySelective(SUserInvitation record);

    public List<SUserInvitation> selectByMap(Map<String, Object> params);

}
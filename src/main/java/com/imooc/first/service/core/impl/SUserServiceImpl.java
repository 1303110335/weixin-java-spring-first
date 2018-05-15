package com.imooc.first.service.core.impl;

import com.imooc.first.api.req.BaseReq;
import com.imooc.first.common.utils.RandomUtils;
import com.imooc.first.common.utils.encrypt.MD5;
import com.imooc.first.dao.SUserDao;
import com.imooc.first.model.SUser;
import com.imooc.first.service.core.SUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SUserServiceImpl implements SUserService {

    @Autowired
    private SUserDao sUserDao;

    @Override
    public SUser getByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public void create(SUser sUser) {

    }

    @Override
    public void update(SUser sUser) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public int count(Map<String, Object> params) {
        return 0;
    }

    @Override
    public SUser get(Map<String, Object> params) {
        return null;
    }

    @Override
    public List<SUser> getList(Map<String, Object> params) {
        return null;
    }

    @Override
    public SUser register(BaseReq loginReq, Long supperUserId, String registrationId, String mobile) {
        String salt = RandomUtils.getRandom(6);
        SUser sUser = new SUser();
        sUser.setUsername(mobile);
        sUser.setMobile(mobile);
        sUser.setPassword(MD5.encode(salt, "UTF-8"));
        sUser.setType(1);
        sUser.setLevel(1);
        sUser.setStatus(2);
        sUser.setSupperUserId(supperUserId);
        sUser.setInviterId(supperUserId);
        sUser.setDeviceSerialId(loginReq.getDeviceSerialId());
        sUser.setPhoneSystemVersion(loginReq.getPhoneSystemVersion());
        sUser.setDeviceType(Integer.valueOf(loginReq.getDeviceType()));
        sUser.setRealNameAuth(0);
        sUser.setChannel(loginReq.getChannel());
        sUser.setAppType(loginReq.getAppType());

        if (loginReq.getChannel() != null && !"".equals(loginReq.getChannel())) {

        }

        return new SUser();
    }

    @Override
    public SUser login(SUser sUser, BaseReq loginReq, String registrationId) {
        return null;
    }

    @Override
    public SUser getByUsername(String username) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("username", username);
        params.put("realNameAuth", "1");
        SUser sUser = get(params);
        return sUser;
    }

    @Override
    public boolean canLoginLottery(Long userId) {
        return false;
    }

    @Override
    public void registerJPush(Long userId, BaseReq loginReq, String registrationId) {

    }

    @Override
    public List<SUser> getByCardNo(String cardNo) {
        return null;
    }

    @Override
    public SUser getByMobile(String mobile, Integer realNameAuth) {
        return null;
    }

    @Override
    public void registerSendPersonMessage(Long userId) {

    }

    @Override
    public BigDecimal calculateUserTotalBalance(Long userId) {
        return null;
    }

    @Override
    public String getUserActivityLevel(Long userId) {
        return null;
    }

    @Override
    public Integer getCurrentValidPayChannelSwith(Integer status, String bankCode) {
        return null;
    }

    @Override
    public Integer getCurrentValidPayChannelSwith(Integer status) {
        return null;
    }

    @Override
    public String selectUserCount(Map<String, Object> params) {
        return null;
    }

    private SUser get(HashMap<String,Object> params) {
        return sUserDao.get(params);
    }
}

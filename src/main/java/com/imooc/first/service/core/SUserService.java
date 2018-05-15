package com.imooc.first.service.core;

import com.imooc.first.api.req.BaseReq;
import com.imooc.first.model.SUser;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface SUserService {
    public SUser getByPrimaryKey(Long id);

    public void create(SUser sUser);

    public void update(SUser sUser);

    public void delete(Long id);

    public int count(Map<String, Object> params);

    public SUser get(Map<String, Object> params);

    public List<SUser> getList(Map<String, Object> params);

    public SUser register(BaseReq loginReq, Long supperUserId, String registrationId, String mobile);

    public SUser login(SUser sUser, BaseReq loginReq, String registrationId);

    public SUser getByUsername(String username);

    public boolean canLoginLottery(Long userId);

    public void registerJPush(Long userId, BaseReq loginReq, String registrationId);

    List<SUser> getByCardNo(String cardNo);

    SUser getByMobile(String mobile, Integer realNameAuth);

/*    public List<SActivationDevice> getSActivitationDeviceByMap(Map<String, Object> params);

    public void addSActivitationDevic(SActivationDevice sActivationDevice);

    void updateStepRateByUserId(Long userId);

    List<SUserOpeLog> getSUserOpeLog(Map<String, Object> map);

    void addSUserOpeLog(SUserOpeLog log);

    void addSUserType(SUserType sUserType);

    SUserType getSUserTypeByParamMap(Map<String, Object> paramMap);*/

    /**
     * 注册成功后发送个人消息
     *
     * @param userId
     */
    public void registerSendPersonMessage(Long userId);

    /**
     * 计算用户理论总余额
     *
     * @param userId
     * @return
     */
    public BigDecimal calculateUserTotalBalance(Long userId);

    /**
     * 判断用户属于私人订制活动中的档次
     */
    public String getUserActivityLevel(Long userId);

    /**
     * 获得当前有效的支付渠道，对单个银行的开关
     */
    public Integer getCurrentValidPayChannelSwith(Integer status,String bankCode);
    /**
     * 获得当前有效的支付渠道，大开关
     */
    public Integer getCurrentValidPayChannelSwith(Integer status);

    /**
     * 统计总用户数
     */
    String selectUserCount(Map<String, Object> params);

}
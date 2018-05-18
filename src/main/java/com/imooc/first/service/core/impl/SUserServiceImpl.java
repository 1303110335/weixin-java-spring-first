package com.imooc.first.service.core.impl;

import com.imooc.first.api.req.BaseReq;
import com.imooc.first.api.resp.message.PersonMessageResp;
import com.imooc.first.common.utils.RandomUtils;
import com.imooc.first.common.utils.encrypt.MD5;
import com.imooc.first.dao.SUserAccountDao;
import com.imooc.first.dao.SUserDao;
import com.imooc.first.dao.SUserInvitationCodeDao;
import com.imooc.first.dao.SUserInvitationDao;
import com.imooc.first.helper.lottery.Gift;
import com.imooc.first.model.*;
import com.imooc.first.service.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class SUserServiceImpl implements SUserService {

    @Autowired
    private SUserDao sUserDao;

    @Autowired
    private SConstantService sConstantService;

    @Autowired
    private SCouponPoolService sCouponPoolService;

    @Autowired
    private SCouponPoolPrizeService sCouponPoolPrizeService;

    @Autowired
    private SUserCouponService sUserCouponService;

    @Autowired
    private SCouponService sCouponService;

    @Autowired
    private SUserAccountDao sUserAccountDao;

    @Autowired
    private SUserInvitationCodeDao sUserInvitationCodeDao;

    @Autowired
    private SUserInvitationDao sUserInvitationDao;

    @Override
    public SUser getByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public void create(SUser sUser) {
        sUserDao.createUser(sUser);
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
    @Transactional
    public SUser register(BaseReq loginReq, Long supperUserId, String registrationId, String mobile) {

        SUser sUser = createSUser(loginReq, supperUserId, registrationId, mobile);
        Long userId = sUser.getId();
        //注册加券
        SCouponPool sCouponPool = addCoupon(userId);
        //初始化创建userAccount
        createUserAccount(userId);
        // 添加用户邀请码信息
        addUserInvitationCode(userId);
        //判断是否被邀请用户（若是则增加一条记录到userInvitation）
        addUserInvitation(supperUserId, sUser);
        // 注册成功后发送个人消息
        registerSendPersonMessage(sUser.getId(), sCouponPool);
        return sUser;
    }




    private void addUserInvitation(Long supperUserId, SUser sUser)
    {
        if (supperUserId != null && supperUserId != 0) {
            SUserInvitation sui = new SUserInvitation();
            sui.setUserId(supperUserId);
            sui.setInvitedUserId(sUser.getId());
            sui.setType(2);
            sui.setInvitedPhone(sUser.getMobile());
            sui.setSuccessTime(new Date());
            sui.setInvitedSuccess(1);
            sui.setAddTime(new Date());
            sUserInvitationDao.insertSelective(sui);
        }
    }

    /**
     * 添加用户邀请码信息
     * @param userId
     */
    private void addUserInvitationCode(Long userId)
    {
        SUserInvitationCode sUserInvitationCode = new SUserInvitationCode();
        String invitationCode = RandomUtils.genSerialCode(userId);
        sUserInvitationCode.setInvitationCode(invitationCode);
        sUserInvitationCode.setCreateTime(new Date());
        sUserInvitationCode.setUserId(userId);
        sUserInvitationCodeDao.insertSUserInvitationCode(sUserInvitationCode);
    }

    /**
     * 插入记录到SUser表
     * @param loginReq
     * @param supperUserId
     * @param registrationId
     * @param mobile
     * @return
     */
    private SUser createSUser(BaseReq loginReq, Long supperUserId, String registrationId, String mobile)
    {
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
            Map<String, Object> params = new HashMap<String, Object>();
            params.clear();
            params.put("consKey", loginReq.getChannel());
            SConstant sConstant = sConstantService.get(params);
            if (sConstant != null) {
                sUser.setChannelId(sConstant.getId());
                sUser.setChannel(sConstant.getConsValue());
            }
        }
        sUser.setSalt(salt);
        sUser.setAddTime(new Date());
        sUser.setRegistrationId(registrationId);
        this.create(sUser);
        return sUser;
    }

    /**
     * 初始化创建userAccount
     * @param userId
     */
    private void createUserAccount(Long userId)
    {
        SUserAccount sUserAccount = new SUserAccount();
        sUserAccount.setUserId(userId);
        sUserAccount.setAccountTotal(BigDecimal.ZERO);
        sUserAccount.setAccountAble(BigDecimal.ZERO);
        sUserAccount.setAccountFreeze(BigDecimal.ZERO);
        sUserAccount.setWaitAmount(BigDecimal.ZERO);
        sUserAccount.setWaitCapital(BigDecimal.ZERO);
        sUserAccount.setWaitInterest(BigDecimal.ZERO);
        sUserAccount.setIntegration(0);
        sUserAccount.setAddTime(new Date());
        sUserAccount.setAddUserId(userId);
        sUserAccount.setWalletLastInterestTime(new Date());
        sUserAccount.setModifyTime(new Date());
        sUserAccount.setModifyUserId(userId);
        sUserAccountDao.create(sUserAccount);
    }

    /**
     * 添加优惠券
     * @param userId
     */
    private SCouponPool addCoupon(Long userId) {
        Map<String, Object> params = new HashMap<String, Object>();
        SCouponPool sCouponPool = null;
        //查询是否存在注册送礼这个活动，存在就送券
        params.put("status", 2);
        params.put("label", "RegCoupon");
        List<SCouponPool> sCouponPoolList = sCouponPoolService.getList(params);
        if (sCouponPoolList.size() != 0) {
            sCouponPool = sCouponPoolList.get(0);
        }

        if (sCouponPool != null) {
            Date now = new Date();
            if (now.getTime() < sCouponPool.getFinalStartTime().getTime()) {
                return sCouponPool;
            }
            if (now.getTime() > sCouponPool.getFinalEndTime().getTime()) {
                return sCouponPool;
            }
            //获取该活动的奖品列表
            List<SCouponPoolPrize> sCouponPoolPrizeList = new ArrayList<>();
            sCouponPoolPrizeList.addAll(sCouponPoolPrizeService.getPutawayPoolPrize(sCouponPool.getId()));

            if (sCouponPoolPrizeList.isEmpty()) {
                return sCouponPool;
            }

            // 过滤抽完的奖
            List<Integer> integerList = sCouponPoolPrizeList.stream().map(SCouponPoolPrize::getCouponId).collect(Collectors.toList());
            //莫名出错，直接跳到InvocationTargetException
            final List<Integer> idsTemp = sCouponService.getCanLotteryCoupons(integerList, now);

            if (idsTemp.isEmpty()) {
                return sCouponPool;
            }

            List<Gift> gifts = new ArrayList<Gift>();
            sCouponPoolPrizeList.stream().filter(sCouponPoolPrize -> idsTemp.contains(sCouponPoolPrize.getCouponId()))
                    .peek(sCouponPoolPrize -> {
                        gifts.add(new Gift(gifts.size(), sCouponPoolPrize.getCouponId(),
                                sCouponPoolPrize.getPrizeMustScene(), sCouponPoolPrize.getPrizeChance().doubleValue()));
                    }).collect(Collectors.toList());

            for (Gift tuple : gifts) {
                sUserCouponService.updateLotteryAwardCouponNew(tuple.getGitfId(), userId, now, sCouponPool.getFinalEndTime(),
                        1, sCouponPool.getLotterySceneType(), sCouponPool.getType(), null);
            }
            return sCouponPool;
        }
        return sCouponPool;
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

    /**
     * 注册成功之后发送消息
     * @param userId
     * @param sCouponPool 奖池
     */
    @Override
    public void registerSendPersonMessage(Long userId, SCouponPool sCouponPool) {
        try {
            if (sCouponPool != null) {
                // 如果有换行加&&标识
                String msgContent = "亲爱的茂茂用户：您有一个" + sCouponPool.getTitle() + "已发放到账户，请到“资产”页面“我的优惠券”中查看哦！";
                PersonMessageResp personMessageResp = new PersonMessageResp();
                personMessageResp.setSenderUid(0l);
                personMessageResp.setAction(0);
                personMessageResp.setRecipientUid(userId);
                personMessageResp.setTitle("注册优惠券");
                personMessageResp.setContent(msgContent);
                personMessageResp.setAppType(2001);
                sMessagePersonalService.insertPersonMessage(personMessageResp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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

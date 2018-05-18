package com.imooc.first.service.core;

import com.imooc.first.api.resp.activity.UserCouponBean;
import com.imooc.first.model.SUserCoupon;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SUserCouponService {
	public SUserCoupon getByPrimaryKey(Integer id);

	public void create(SUserCoupon sUserCoupon);

	public void update(SUserCoupon sUserCoupon);

	public void delete(Integer id);

	public int count(Map<String, Object> params);

	public SUserCoupon get(Map<String, Object> params);

	public List<SUserCoupon> getList(Map<String, Object> params);

	public UserCouponBean queryUserCouponDetail(Integer userCouponId);

	List<SUserCoupon> getUsedCouponList(String userId);

	/*public UserCouponBean updateLotteryAwardCoupon(Integer couponId, Long userId, Date now, Date finalEndTime,
                                                   Integer status, Integer lotterySceneType, Integer poolType, String fromRechargeNo);*/

	public UserCouponBean updateLotteryAwardCouponNew(Integer couponId, Long userId, Date now, Date finalEndTime,
                                                      Integer status, Integer lotterySceneType, Integer poolType, String fromRechargeNo);

	List<UserCouponBean> getUserCouponList(HashMap<String, Object> params);

	public List<UserCouponBean> getToBeInvestedUserCoupon(HashMap<String, Object> params);

	public SUserCoupon updateUserCouponFinishStatus(long userId, String rechargeNo, Integer status);

	public SUserCoupon updateUserCouponFinishStatus(String userCouponId, String rechargeNo);

	public void createUserCoupon(SUserCoupon sUserCoupon);
}
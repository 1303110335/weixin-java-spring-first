package com.imooc.first.service.core.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.first.api.resp.activity.UserCouponBean;
import com.imooc.first.common.utils.StringTools;
import com.imooc.first.dao.SUserCouponDao;
import com.imooc.first.model.SCoupon;
import com.imooc.first.model.SUserCoupon;
import com.imooc.first.service.core.SCouponService;
import com.imooc.first.service.core.SUserCouponService;

@Service
public class SUserCouponServiceImpl implements SUserCouponService {
	@Autowired
	private SUserCouponDao sUserCouponDao;
	@Autowired
	private SCouponService sCouponService;

	public SUserCoupon getByPrimaryKey(Integer id) {
		return sUserCouponDao.getByPrimaryKey(id);
	}

	public void createUserCoupon(SUserCoupon sUserCoupon) {
		sUserCouponDao.createUserCoupon(sUserCoupon);
	}

	public void create(SUserCoupon sUserCoupon) {
		sUserCouponDao.create(sUserCoupon);
	}

	public void update(SUserCoupon sUserCoupon) {
		sUserCouponDao.update(sUserCoupon);
	}

	public void delete(Integer id) {
		sUserCouponDao.delete(id);
	}

	public int count(Map<String, Object> params) {
		return sUserCouponDao.count(params);
	}

	public SUserCoupon get(Map<String, Object> params) {
		return sUserCouponDao.get(params);
	}

	public List<SUserCoupon> getList(Map<String, Object> params) {
		return sUserCouponDao.getList(params);
	}

	public List<SUserCoupon> getUsedCouponList(String userId) {
		return sUserCouponDao.getUsedCouponList(userId);
	}

	@Override
	public UserCouponBean queryUserCouponDetail(Integer userCouponId) {
		return sUserCouponDao.queryUserCouponDetail(userCouponId);
	}

	@Override
	public UserCouponBean updateLotteryAwardCouponNew(Integer couponId, Long userId, Date now, Date finalEndTime,
			Integer status, Integer lotterySceneType, Integer poolType, String fromRechargeNo) {
		UserCouponBean userCouponBean = null;
		//1.获得对应的券
		SCoupon sCoupon = sCouponService.getByPrimaryKey(couponId);
		//2.判断券的可用数量是否大于0
		if (sCoupon.getAbleNumber() > 0) {
			//3.判断券每个人的最大可获取数量
			Integer couponMaxAcquire = sCoupon.getMaxAcquire();
			if (couponMaxAcquire != null && couponMaxAcquire > 0) {
				Map<String, Object> params = new HashMap<String, Object>();
				params.put("userId", userId);
				params.put("couponId", couponId);
				List<SUserCoupon> userCouponList = this.getList(params);
				if (userCouponList.size() >= couponMaxAcquire) {
					return null;
				}
			}

			//获取这个人获取该券的过期时间(有效期，用户获得时间+有效期=用户优惠券过期时间)
			Calendar expireTimeCalendar = Calendar.getInstance();
			if (sCoupon.getExpire() == 0) {
				expireTimeCalendar.setTime(sCoupon.getEndTime());
			} else {
				if (now.getTime() < sCoupon.getStartTime().getTime()) {
					expireTimeCalendar.setTime(sCoupon.getStartTime());
				} else {
					expireTimeCalendar.setTime(now);
				}
				expireTimeCalendar.add(Calendar.HOUR, sCoupon.getExpire());
			}

			// 最大不过活动时间
			if (expireTimeCalendar.getTime().getTime() > sCoupon.getEndTime().getTime()) {
				expireTimeCalendar.setTime(sCoupon.getEndTime());
			}

			SUserCoupon sUserCoupon = new SUserCoupon();
			sUserCoupon.setUserId(userId);
			sUserCoupon.setCouponId(couponId);
			if (fromRechargeNo != null) {
				sUserCoupon.setFromRechargeNo(fromRechargeNo);
			}
			sUserCoupon.setGainTime(now);
			sUserCoupon.setStatus(status);
			sUserCoupon.setAddUserId(userId);
			sUserCoupon.setModifyTime(now);
			sUserCoupon.setModifyUserId(userId);
			sUserCoupon.setSourceType(poolType);
			sUserCoupon.setLotterySceneType(lotterySceneType);
			sUserCoupon.setAddTime(now);
			sUserCoupon.setExpireTime(expireTimeCalendar.getTime());
			//派发券给这个人
			this.create(sUserCoupon);
			userCouponBean = this.queryUserCouponDetail(sUserCoupon.getCouponId());
		}
		return userCouponBean;
	}

	@Override
	public List<UserCouponBean> getUserCouponList(HashMap<String, Object> params) {
		return sUserCouponDao.queryUserCouponList(params);
	}

	@Override
	public List<UserCouponBean> getToBeInvestedUserCoupon(HashMap<String, Object> params) {
		return sUserCouponDao.queryToBeInvestedUserCoupon(params);
	}

	@Override
	public SUserCoupon updateUserCouponFinishStatus(long userId, String rechargeNo, Integer status) {
		Map<String, Object> params = new HashMap<>();
		params.put("userId", userId);
		if (!StringTools.isEmpty(rechargeNo)) {
			params.put("rechargeNo", rechargeNo);
		}
		params.put("status", status);
		SUserCoupon sUserCouponTemp = null;
		List<SUserCoupon> sUserCouponList = sUserCouponDao.getSUserCouponList(params);
		// 一次投资对应一个券
		if (sUserCouponList.size() != 0) {
			sUserCouponTemp = sUserCouponList.get(0);
			sUserCouponTemp.setStatus(2);
			sUserCouponDao.update(sUserCouponTemp);
			return sUserCouponTemp;
		}
		return null;
	}

	@Override
	public SUserCoupon updateUserCouponFinishStatus(String userCouponId, String rechargeNo) {
		Map<String, Object> params = new HashMap<>();
		params.put("id", userCouponId);
		SUserCoupon sUserCouponTemp = null;
		List<SUserCoupon> sUserCouponList = sUserCouponDao.getSUserCouponList(params);
		// 一次投资对应一个券
		if (sUserCouponList.size() != 0) {
			sUserCouponTemp = sUserCouponList.get(0);
			sUserCouponTemp.setStatus(2);
			sUserCouponTemp.setRechargeNo(rechargeNo);
			sUserCouponDao.update(sUserCouponTemp);
			return sUserCouponTemp;
		}
		return null;
	}
}
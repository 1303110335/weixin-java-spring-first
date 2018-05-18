package com.imooc.first.dao;

import com.imooc.first.api.resp.activity.UserCouponBean;
import com.imooc.first.model.SUserCoupon;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SUserCouponDao {
	public SUserCoupon getByPrimaryKey(Integer id);

	public void create(SUserCoupon sUserCoupon);

	public void update(SUserCoupon sUserCoupon);

	public void delete(Integer id);

	public int count(Map<String, Object> params);

	public SUserCoupon get(Map<String, Object> params);

	public List<SUserCoupon> getList(Map<String, Object> params);

	public UserCouponBean queryUserCouponDetail(@Param("userCouponId") Integer userCouponId);

	public List<SUserCoupon> getUsedCouponList(@Param("userId") String userId);

	public List<UserCouponBean> queryUserCouponList(Map<String, Object> params);

	public List<UserCouponBean> queryToBeInvestedUserCoupon(Map<String, Object> params);

	public List<SUserCoupon> getSUserCouponList(Map<String, Object> params);

	public void createUserCoupon(SUserCoupon sUserCoupon);
}
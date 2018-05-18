package com.imooc.first.service.core;

import com.imooc.first.model.SCoupon;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface SCouponService {
    public SCoupon getByPrimaryKey(Integer id);

    public void create(SCoupon sCoupon);

    public void update(SCoupon sCoupon);

    public void delete(Integer id);

    public int count(Map<String, Object> params);

    public SCoupon get(Map<String, Object> params);

    public List<SCoupon> getList(Map<String, Object> params);

    public String updateCouponNumAndRedemptionCodeToGain(Integer couponId, Long userId, Date now);

    public List<Integer> getCanLotteryCoupons(List<Integer> ids, Date now);
}
package com.imooc.first.dao;

import com.imooc.first.model.SCouponPoolPrize;

import java.util.List;
import java.util.Map;

public interface SCouponPoolPrizeDao {
    public SCouponPoolPrize getByPrimaryKey(Integer id);

    public void create(SCouponPoolPrize sCouponPoolPrize);

    public void update(SCouponPoolPrize sCouponPoolPrize);

    public void delete(Integer id);

    public int count(Map<String, Object> params);

    public SCouponPoolPrize get(Map<String, Object> params);

    public List<SCouponPoolPrize> getList(Map<String, Object> params);
}
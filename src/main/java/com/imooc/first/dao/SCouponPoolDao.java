package com.imooc.first.dao;

import com.imooc.first.model.SCouponPool;

import java.util.List;
import java.util.Map;

public interface SCouponPoolDao {
	public SCouponPool getByPrimaryKey(Integer id);

	public void create(SCouponPool sCouponPool);

	public void update(SCouponPool sCouponPool);

	public void delete(Integer id);

	public int count(Map<String, Object> params);

	public SCouponPool get(Map<String, Object> params);

	public List<SCouponPool> getList(Map<String, Object> params);

	public SCouponPool getCouponPool(Map<String, Object> params);
}
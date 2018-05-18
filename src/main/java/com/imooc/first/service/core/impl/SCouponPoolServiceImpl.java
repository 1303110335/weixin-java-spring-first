package com.imooc.first.service.core.impl;

import com.imooc.first.dao.SCouponDao;
import com.imooc.first.dao.SCouponPoolDao;
import com.imooc.first.dao.SCouponPoolPrizeDao;
import com.imooc.first.model.SCouponPool;
import com.imooc.first.model.SCouponPoolPrize;
import com.imooc.first.service.core.SCouponPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SCouponPoolServiceImpl implements SCouponPoolService {
	@Autowired
	private SCouponPoolDao sCouponPoolDao;
	@Autowired
	private SCouponPoolPrizeDao sCouponPoolPrizeDao;
	@Autowired
	private SCouponDao sCouponDao;

	public SCouponPool getByPrimaryKey(Integer id) {
		return sCouponPoolDao.getByPrimaryKey(id);
	}

	public void create(SCouponPool sCouponPool) {
		sCouponPoolDao.create(sCouponPool);
	}

	public void update(SCouponPool sCouponPool) {
		sCouponPoolDao.update(sCouponPool);
	}

	public void delete(Integer id) {
		sCouponPoolDao.delete(id);
	}

	public int count(Map<String, Object> params) {
		return sCouponPoolDao.count(params);
	}

	public SCouponPool get(Map<String, Object> params) {
		return sCouponPoolDao.get(params);
	}

	public List<SCouponPool> getList(Map<String, Object> params) {
		return sCouponPoolDao.getList(params);
	}

	public SCouponPool getCouponPool(Map<String, Object> params) {
		return sCouponPoolDao.getCouponPool(params);
	}

	@Override
	public void shelvesCouponPool(Integer couponId) {
		Map<String, Object> params = new HashMap<>();
		params.put("couponId", couponId);
		List<SCouponPoolPrize> sCouponPoolPrizeListTemp = sCouponPoolPrizeDao.getList(params);
		if (sCouponPoolPrizeListTemp.isEmpty()) {
			return;
		}

		Boolean shelvesFlag = true;
		Integer poolId = sCouponPoolPrizeListTemp.get(0).getPoolId();
		params.clear();
		params.put("poolId", poolId);
		List<SCouponPoolPrize> sCouponPoolPrizeList = sCouponPoolPrizeDao.getList(params);
		for (SCouponPoolPrize sCouponPoolPrize : sCouponPoolPrizeList) {
			if (sCouponDao.getByPrimaryKey(sCouponPoolPrize.getCouponId()).getAbleNumber() != 0) {
				shelvesFlag = false;
			}
		}

		if (shelvesFlag) {
			SCouponPool sCouponPool = getByPrimaryKey(poolId);
			sCouponPool.setStatus(3);
			update(sCouponPool);
		}
	}
}
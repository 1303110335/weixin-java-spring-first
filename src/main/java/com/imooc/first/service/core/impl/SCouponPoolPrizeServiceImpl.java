package com.imooc.first.service.core.impl;

import com.imooc.first.dao.SCouponPoolPrizeDao;
import com.imooc.first.model.SCouponPoolPrize;
import com.imooc.first.service.core.SCouponPoolPrizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SCouponPoolPrizeServiceImpl implements SCouponPoolPrizeService {
    @Autowired
    private SCouponPoolPrizeDao sCouponPoolPrizeDao;

    public SCouponPoolPrize getByPrimaryKey(Integer id) {
        return sCouponPoolPrizeDao.getByPrimaryKey(id);
    }

    public void create(SCouponPoolPrize sCouponPoolPrize) {
        sCouponPoolPrizeDao.create(sCouponPoolPrize);
    }

    public void update(SCouponPoolPrize sCouponPoolPrize) {
        sCouponPoolPrizeDao.update(sCouponPoolPrize);
    }

    public void delete(Integer id) {
        sCouponPoolPrizeDao.delete(id);
    }

    public int count(Map<String, Object> params) {
        return sCouponPoolPrizeDao.count(params);
    }

    public SCouponPoolPrize get(Map<String, Object> params) {
        return sCouponPoolPrizeDao.get(params);
    }

    public List<SCouponPoolPrize> getList(Map<String, Object> params) {
        return sCouponPoolPrizeDao.getList(params);
    }

    @Override
    public List<SCouponPoolPrize> getPutawayPoolPrize(Integer poolId) {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("poolId", poolId);
        params.put("prizeStatus", 1);
        return getList(params);
    }

    @Override
    public void shelvesCouponPoolPrize(Integer couponId) {
        Map<String, Object> params = new HashMap<>();
        params.put("couponId", couponId);
        params.put("prizeStatus", 1);
        SCouponPoolPrize sCouponPoolPrize = get(params);
        if (sCouponPoolPrize == null) {
            return;
        }

        SCouponPoolPrize sCouponPoolPrizeTemp = new SCouponPoolPrize();
        sCouponPoolPrizeTemp.setId(sCouponPoolPrize.getId());
        sCouponPoolPrizeTemp.setPrizeStatus(2);
        update(sCouponPoolPrizeTemp);
    }
}
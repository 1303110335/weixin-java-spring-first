package com.imooc.first.service.core.impl;

import com.imooc.first.dao.SCouponDao;
import com.imooc.first.model.SCoupon;
import com.imooc.first.service.core.SCouponPoolPrizeService;
import com.imooc.first.service.core.SCouponPoolService;
import com.imooc.first.service.core.SCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SCouponServiceImpl implements SCouponService {
    @Autowired
    private SCouponDao sCouponDao;
    @Autowired
    private SCouponPoolService sCouponPoolService;
    @Autowired
    private SCouponPoolPrizeService sCouponPoolPrizeService;

    public SCoupon getByPrimaryKey(Integer id) {
        return sCouponDao.getByPrimaryKey(id);
    }

    public void create(SCoupon sCoupon) {
        sCouponDao.create(sCoupon);
    }

    public void update(SCoupon sCoupon) {
        sCouponDao.update(sCoupon);
    }

    public void delete(Integer id) {
        sCouponDao.delete(id);
    }

    public int count(Map<String, Object> params) {
        return sCouponDao.count(params);
    }

    public SCoupon get(Map<String, Object> params) {
        return sCouponDao.get(params);
    }

    public List<SCoupon> getList(Map<String, Object> params) {
        return sCouponDao.getList(params);
    }

    @Override
    @Transactional
    public String updateCouponNumAndRedemptionCodeToGain(Integer couponId, Long userId, Date now) {
        String redemptionCode = null;
        SCoupon sCoupon = getByPrimaryKey(couponId);
        if (sCoupon.getAbleNumber() > 0) {
            SCoupon sCouponTemp = new SCoupon();
            if (sCoupon.getType() == 4) {
/*				HashMap<String, Object> params = new HashMap<>();
                params.put("couponId", sCoupon.getId());
				params.put("redemptionStatus", 0);
				SCouponRedemption sCouponRedemption = sCouponRedemptionMapper.getSCouponRedemptionList(params).get(0);
				sCouponRedemption.setRedemptionStatus(1);
				sCouponRedemptionMapper.updateSCouponRedemption(sCouponRedemption);

				redemptionCode = sCouponRedemption.getRedemptionCode();*/
                redemptionCode = "Waiting";
            }
            sCouponTemp.setId(sCoupon.getId());
            sCouponTemp.setAbleNumber(sCoupon.getAbleNumber() - 1);
            sCouponTemp.setModifyTime(now);
            sCouponTemp.setModifyUserId(userId);
            update(sCouponTemp);

            //下架券池
            if (sCouponTemp.getAbleNumber() == 0) {
                sCouponPoolPrizeService.shelvesCouponPoolPrize(couponId);
                sCouponPoolService.shelvesCouponPool(couponId);
            }
        }

        return redemptionCode;
    }

    @Override
    public List<Integer> getCanLotteryCoupons(List<Integer> ids, Date now) {
        Map<String, Object> params = new HashMap<>();
        params.put("ids", ids);
        params.put("ableNumber", 0);
        params.put("now", now);
        return getList(params).stream().map(SCoupon::getId).collect(Collectors.toList());
    }
}
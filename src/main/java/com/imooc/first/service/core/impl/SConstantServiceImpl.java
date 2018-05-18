package com.imooc.first.service.core.impl;

import com.imooc.first.dao.SConstantDao;
import com.imooc.first.model.SConstant;
import com.imooc.first.service.core.SConstantService;
import com.imooc.first.service.redis.RedisCacheService;
import com.imooc.first.utils.RedisOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SConstantServiceImpl implements SConstantService {

    @Autowired
    private SConstantDao sConstantDao;

    @Autowired
    private RedisOperator redisCacheService;

    @Override
    public SConstant getByPrimaryKey(Integer id) {
        return sConstantDao.getByPrimaryKey(id);
    }

    @Override
    public SConstant get(Map<String, Object> params) {
        return sConstantDao.get(params);
    }

    @Override
    public List<SConstant> getList(Map<String, Object> params) {
        return sConstantDao.getList(params);
    }

    @Override
    public SConstant queryByKey(String consKey) {
        SConstant sConstant = null;
        String constantsVal = redisCacheService.get(consKey);
        if("coupon_switch".equals(consKey) || "personInviteSwitchFlag".equals(consKey)
                || "inviteActivitySwitchFlag".equals(consKey)
                || "inviteActivityId".equals(consKey)
                || "withdraw_up_minute".equals(consKey)){
            constantsVal = null;
        }
        if (constantsVal != null) {

        } else {
            //无则从数据库查找，并存入缓存中
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("cons_key", consKey);
            List<SConstant> consList = sConstantDao.getList(params);
            if (consList != null && consList.size() != 0) {
                sConstant = consList.get(0);
                redisCacheService.set(
                        consKey,
                        sConstant.getId() + ":" + sConstant.getConsValue() + "=.=" + sConstant.getConsDesc()
                );
            }
        }
        return sConstant;
    }
}

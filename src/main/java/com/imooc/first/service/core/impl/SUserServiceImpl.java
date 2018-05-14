package com.imooc.first.service.core.impl;

import com.imooc.first.dao.SUserDao;
import com.imooc.first.model.SUser;
import com.imooc.first.service.core.SUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class SUserServiceImpl implements SUserService {

    @Autowired
    private SUserDao sUserDao;

    @Override
    public SUser getByUsername(String username) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("username", username);
        params.put("realNameAuth", "1");
        SUser sUser = get(params);
        return sUser;
    }

    private SUser get(HashMap<String,Object> params) {
        return sUserDao.get(params);
    }
}

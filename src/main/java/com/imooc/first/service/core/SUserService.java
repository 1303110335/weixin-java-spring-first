package com.imooc.first.service.core;

import com.imooc.first.model.SUser;

public interface SUserService {
    public SUser getByUsername(String username);
}
package com.imooc.first.web;

import com.imooc.first.api.req.user.GetSmsCodeReq;
import com.imooc.first.api.req.user.LoginReq;
import com.imooc.first.api.resp.BaseResp;
import com.imooc.first.api.resp.LoginResp;
import com.imooc.first.common.utils.ResultCode;
import com.imooc.first.common.utils.VerifyUtils;
//import com.imooc.first.manager.UserManager;
import com.imooc.first.manager.UserManager;
import com.imooc.first.model.Area;
import com.imooc.first.model.SUser;
import com.imooc.first.service.core.AreaService;
import com.imooc.first.service.core.SUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello()
    {
        return "hello user";
    }

    @Autowired
    UserManager userManager;


    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private SUserService sUserService;

    @RequestMapping(value = "/smsCode", method = RequestMethod.GET)
    public BaseResp getSmsCode(@Valid GetSmsCodeReq req)
    {
        return userManager.getSmsCode(req);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BaseResp<LoginResp> login(@Valid LoginReq loginReq)
    {
        return userManager.login(loginReq);
    }

}

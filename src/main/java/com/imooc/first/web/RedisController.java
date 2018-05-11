package com.imooc.first.web;

import com.imooc.first.entity.SysUser;
import com.imooc.first.utils.IMoocJSONResult;
import com.imooc.first.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate strRedis;

    @RequestMapping(value = "/test")
    public IMoocJSONResult test() {
        strRedis.opsForValue().set("imooc-cache", "hello 慕课网~~~");

        SysUser user = new SysUser();
        user.setId("10011");
        user.setUsername("imooc");;
        user.setPassword("abc123");;
        user.setIsDelete(0);
        user.setRegistTime(new Date());
        strRedis.opsForValue().set("json:user", JsonUtils.objectToJson(user));
        SysUser jsonUser = JsonUtils.jsonToPojo(strRedis.opsForValue().get("json:user"), SysUser.class);
        return IMoocJSONResult.ok(jsonUser);
    }
}

package com.imooc.first.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("/error")
    public String error()
    {
        Integer num = 1 / 0;
        return "123";
    }
}

package com.imooc.first;

import com.imooc.first.dao.AreaDao;
import com.imooc.first.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Hello {
    @Autowired
    private AreaDao areaDao;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        //返回Hello SpringBoot!
//        return "Hello SpringBoot!";
        List<Area> areaList = areaDao.queryArea();
        System.out.println(areaList);
        return "123";
    }
}

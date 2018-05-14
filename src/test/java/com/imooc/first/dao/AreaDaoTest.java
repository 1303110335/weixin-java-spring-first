package com.imooc.first.dao;

import com.imooc.first.model.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {

    //通过spring容器注入Dao的实现类
    @Autowired
    private AreaDao areaDao;

    @Test
    @Ignore
    public void queryArea() {
        List<Area> areaList = areaDao.queryArea();
        // 验证预期值和实际值是否相符
        assertEquals(2, areaList.size());
    }

    @Test
    @Ignore
    public void queryAreaById() {
        Area area = areaDao.queryAreaById(1);
        assertEquals("杭州", area.getAreaName());
    }

    @Test
    @Ignore
    public void insertArea() {
        Area area = new Area();
        area.setAreaName("慈溪");
        area.setPriority(1);
        int effectedNum = areaDao.insertArea(area);
        assertEquals(1, effectedNum);
    }

    @Test
    @Ignore
    public void updateArea() {
        Area area = new Area();
        area.setAreaName("温州2");
        area.setAreaId(2);
        area.setLastEditTime(new Date());
        int effectNum = areaDao.updateArea(area);
        assertEquals(1, effectNum);
    }

    @Test
    public void deleteArea() {
        int effectNum = areaDao.deleteArea(3);
        assertEquals(1, effectNum);
    }
}
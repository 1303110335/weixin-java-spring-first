package com.imooc.first.service.core.impl;

import com.imooc.first.dao.AreaDao;
import com.imooc.first.model.Area;
import com.imooc.first.service.core.AreaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao areaDao;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }

    @Override
    public Area getAreaById(int areaId) {
        return areaDao.queryAreaById(areaId);
    }

    @Transactional
    @Override
    public boolean addArea(Area area) {
        logger.info(area.toString());
        if(area.getAreaName() != null && !"".equals(area.getAreaName())) {
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            try {
                int effectNum = areaDao.insertArea(area);
                if (effectNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("插入区域信息失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("插入区域信息失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("区域信息不能为空!");
        }
    }

    @Override
    public boolean modifyArea(Area area) {
        if(area.getAreaName() != null && !"".equals(area.getAreaName())) {
            area.setLastEditTime(new Date());
            try {
                int effectNum = areaDao.updateArea(area);
                if (effectNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("更新区域信息失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("更新区域信息失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("区域信息不能为空!");
        }
    }

    @Override
    public boolean deleteArea(int areaId) {
        if(areaId > 0) {
            try {
                int effectNum = areaDao.deleteArea(areaId);
                if (effectNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除区域信息失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除区域信息失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("区域Id不能为空!");
        }
    }
}

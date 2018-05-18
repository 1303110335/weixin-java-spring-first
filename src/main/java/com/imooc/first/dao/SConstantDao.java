package com.imooc.first.dao;

import com.imooc.first.model.SConstant;

import java.util.List;
import java.util.Map;

public interface SConstantDao {
    public SConstant getByPrimaryKey(Integer id);

    public SConstant get(Map<String, Object> params);

    public List<SConstant> getList(Map<String, Object> params);
}

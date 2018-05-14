package com.imooc.first.dao;

import java.util.List;
import java.util.Map;

import com.imooc.first.model.SUser;
import org.apache.ibatis.annotations.Param;

public interface SUserDao {
    SUser getUserByPrimaryKey(Long id);

    void createUser(SUser sUser);

    void updateUser(SUser sUser);

    void updateUserByName(SUser sUser);

    void delete(Long id);

    int count(Map<String, Object> params);

    SUser get(Map<String, Object> params);

    List<SUser> getList(Map<String, Object> params);

    List<SUser> getByCardNo(@Param("cardNo") String cardNo);

    SUser getByMobileAuth(@Param("mobile") String mobile, @Param("realNameAuth") Integer realNameAuth);

    SUser getByUserName(@Param("username") String username);

    /**
     * 统计数据
     *
     * @param params
     * @return
     */
    List<Map<String, Object>> statisUserDueData(Map<String, Object> params);

    /**
     * 统计用户数
     *
     * @param params
     * @return
     */
    String selectUserCount(Map<String, Object> params);
}

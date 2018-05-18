package com.imooc.first.dao;

import com.imooc.first.api.resp.account.AccountAssetsResp;
import com.imooc.first.api.resp.platform.PlatformWalletLeagueData;
import com.imooc.first.model.SUserAccount;
import com.imooc.first.model.YdjrUserAccount;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface SUserAccountDao {
    public SUserAccount getByPrimaryKey(Long id);

    public void create(SUserAccount sUserAccount);

    public void update(SUserAccount sUserAccount);

    public int count(Map<String, Object> params);

    public SUserAccount get(Map<String, Object> params);

    public List<SUserAccount> getList(Map<String, Object> params);

    SUserAccount getByUserId(@Param("userId") Long userId);
    public SUserAccount getByUserIdForLock(@Param("userId") Long userId);
    public AccountAssetsResp accountAssets(@Param("userId") Long userId);

    List<PlatformWalletLeagueData> getWalletLeagueCurrentInvest(@Param("pageNo") Integer pageNo, @Param("limit") Integer limit);

    List<YdjrUserAccount> getWalletAccountRankList(@Param("pageNo") Integer pageNo, @Param("limit") Integer limit);

    BigDecimal stock();

    int registerTotal();

    int realAuthUsers();

    /**
     * 锁定用户账户
     *
     * @param id
     * @return
     */
    public SUserAccount getByPrimaryKeyForLock(Long id);

}
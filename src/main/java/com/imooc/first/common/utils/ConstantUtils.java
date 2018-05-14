package com.imooc.first.common.utils;

public class ConstantUtils {
    // 同账号登录频繁限制
    public static final String LOGIN_TIME_LIMIT = "login_time_limit";
    // 将用户对应的websocket服务ip,和用户id写入redis的key
    public static final String WEBSOCKET_RECHARGE_NO_IP_KEY = "websocket_recharge_no_ip_key";
    public static final String RECHARGE_NO_TO_USER_ID_PREFIX = "recharge_no_to_user_id_";
    public static final String USER_WALLET_WITHDRAWAL_COUNT_KEY = "user_wallet_withdrawal_count_";
    public static final String BANK_CODE_MAP = "bank_code_map";
    public static final String BANK_CODE_MAP_NAME = "bank_code_name_map";
    public static final String USER_WALLET_LOCK_PREFIX = "user_wallet_lock_for_";
    public static final String PRODUCT_ENV_KEY = "product";
    public static final String NUMBER_GEN_LOCK_PREFIX = "number_gen_lock_";
    public static final String CURRENT_NUMBER_PREFIX = "current_number_for_";
    public static final String WALLET_SMS_FIRST_TIME_PREFIX = "wallet_sms_first_time_";
    public static final String INVITE_SMS_FIRST_TIME_PREFIX = "invite_sms_first_time_";
    public static final String WALLET_SMS_NUM_PREFIX = "wallet_sms_num_";
    public static final String INVITE_SMS_NUM_PREFIX = "invite_sms_num_";
    public static final String SIGN_PREFIX = "wallet_sign_";
    public static final String NEWCOMER_FLAG_PREFIX = "newcomer_flag_";
    public static final String NEWCOMER_TOTAL_RECHARGE_PREFIX = "newcomer_total_recharge_";

    // 当前开启的支付渠道key
    public static final String CURRENT_PAY_CHANNEL = "CurrentPayChannel";

    // 默认个人账户基本利率
    public static final String BASEWALLETRATE = "0";
    // 默认个人账户加息利率，不加活动利率
    public static final String BASEADDWALLETRATE = "0";
    // 平台最高利息阀值
    public static final String LASTWALLETRATE = "0";
    // 体验金额度
    public static final String EXPERIENCEAMOUNT = "8888";
    // 体验有效时间
    public static final int EXPERIENCEDAY = 3;
    // 忠诚奖励开始时间
    public static final String LOYALSTARTTIME = "2016-11-06 00:00:00";
    // 邀请好友累计奖励最高总额
    public static final String INVITTOTALRATE = "3.00";
    // 平台最低提现额度
    public static final Double DRAWMINAMOUNT = 100d;
    // 同一个终端最高登录用户数
    public static final Integer DEVICEMAXAMOUNT = 3;
    // 邀请好友加息0.1
    public static final String INVITEADDRATE = "0";
    // 平台最高利息阀值（2017-1-1 开始）
    public static final String LASTWALLETRATENEW = "0";
    // 邀请好友累计奖励最高总额（2017-1-1 开始）
    public static final String INVITTOTALRATENEW = "0";

    /**
     * 私人订制活动标的类型
     **/
    public static final String[] PERSON_INVITEACTIVITY_PROJECTTYPE = {"10", "11", "12"};

    /**
     * 私人订制活动有效好友购买限额
     **/
    public static final Double PERSON_INVITEACTIVITY_MIN_AMOUNT = 10000d;

    /**
     * 宝付测试环境支付成功结果绑卡ID
     **/
    public static final String SUCESS_BIND_ID = "201604271949318660";

    /**
     * 宝付测试环境支付未知结果绑卡ID
     **/
    public static final String NOKNOWN_BIND_ID = "201604271946051306";

    /**
     * 融宝测试环境支付成功结果绑卡ID
     **/
    public static final String SUCESS_BIND_ID_RB = "343545";

    /**
     * 融宝测试环境支付未知结果绑卡ID
     **/
    public static final String NOKNOWN_BIND_ID_RB = "111111";

}


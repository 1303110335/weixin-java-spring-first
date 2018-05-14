package com.imooc.first.common.utils;

public enum ResultCode {
    /**
     * 正常
     */
    NORMAL(0, "NORMAL", "正常", 0),

    WAITING(10000, "WAITING", "等待", 0),
    AMOUNT_LIMIT(10099, "WAITING", "等待", 0),
    PROCESSING(100100, "WAITING", "处理中", 0),
    /** ========== 系统错误码 ========== **/

    /**
     * 系统错误
     */
    ERROR_SYSTEM(10001, "ERROR_SYSTEM", "系统错误！", 1),

    BLANK(-1, "NORMAL", "", -1),

    /**
     * 接口请求参数编码错误
     */
    ERROR_SYSTEM_REQUEST_PARAM_DECODE(10002, "ERROR_SYSTEM_REQUEST_PARAM_DECODE", "接口请求参数解码错误！", 1),

    /**
     * 接口请求参数编码错误
     */
    ERROR_SYSTEM_REQUEST_IPADDRESS_NOT_FOUND(10003, "ERROR_SYSTEM_REQUEST_PARAM_DECODE", "接口请求地址不存在！", 1),

    /**
     * 接口请求方法错误
     */
    ERROR_SYSTEM_REQUEST_METHOD_NOT_SUPPORTED(10004, "ERROR_SYSTEM_REQUEST_METHOD_NOT_SUPPORTED", "接口请求方法不支持！", 1),

    /**
     * 数据库存储失败
     */
    ERROR_SYSTEM_DATABASE_INSERT(10004, "ERROR_SYSTEM_DATABASE_INSERT", "数据库存储失败！", 1),

    /**
     * 数据库更新失败
     */
    ERROR_SYSTEM_DATABASE_UPDATE(10005, "ERROR_SYSTEM_DATABASE_UPDATE", "数据库更新失败！", 1),

    /**
     * 数据库事务执行失败
     */
    ERROR_SYSTEM_DATABASE_TRANSACTION(10006, "ERROR_SYSTEM_DATABASE_TRANSACTION", "数据库事务执行失败！", 1),

    /**
     * 数据对象转换失败
     */
    ERROR_SYSTEM_DATAOBJECT_TRANSFORM(10007, "ERROR_SYSTEM_DATAOBJECT_TRANSFORM", "数据对象转换失败！", 1),

    /**
     * 参数不能为空
     */
    ERROR_SYSTEM_PARAM_CANNOT_EMPTY(10008, "ERROR_SYSTEM_PARAM_CANNOT_EMPTY", "参数不能为空！", 1),

    /**
     * 参数不能全为数字
     */
    ERROR_SYSTEM_PARAM_CANNOT_BE_NUMBER(10009, "ERROR_SYSTEM_PARAM_CANNOT_BE_NUMBER", "参数不能全为数字！", 1),

    /**
     * 参数不能小于给定参数
     */
    ERROR_SYSTEM_PARAM_CANNOT_LESS_THAN_ANOTHER(10010, "ERROR_SYSTEM_PARAM_CANNOT_LESS_THAN_ANOTHER", "参数不能小于给定参数！", 1),

    /**
     * 参数长度过长
     */
    ERROR_SYSTEM_PARAM_TOO_LONG(10011, "ERROR_SYSTEM_PARAM_TOO_LONG", "参数长度过长！", 1),

    /**
     * 参数长度过短
     */
    ERROR_SYSTEM_PARAM_TOO_SHORT(10012, "ERROR_SYSTEM_PARAM_TOO_SHORT", "参数长度过短！", 1),

    /**
     * 系统参数错误
     */
    ERROR_SYSTEM_PARAM(10013, "ERROR_SYSTEM_PARAM", "系统参数错误！", 1),

    /**
     * 请求出错，请检查您传入的参数格式是否正确
     */
    ERROR_SYSTEM_PARAM_FORMAT(10014, "ERROR_SYSTEM_PARAM_FORMAT", "请求出错，请检查您传入的参数格式是否正确", 1),

    /**
     * 时间格式不正确
     */
    ERROR_SYSTEM_DATETIME_PARAM_FORMAT(10015, "ERROR_SYSTEM_DATETIME_PARAM_FORMAT", "时间格式不正确！", 1),

    /**
     * 数据库查询失败
     */
    ERROR_SYSTEM_DATABASE_QUERY_NULL(10016, "ERROR_SYSTEM_DATABASE_QUERY", "数据库查询值为空！", 1),

    /**
     * redis中取值为null
     */
    ERROR_SYSTEM_REDIS_VALUE_NULL(10017, "ERROR_SYSTEM_REDIS_VALUE_NULL", "redis中取值为null！", 1),
    /**
     * redis中值格式不正确
     */
    ERROR_SYSTEM_REDIS_VALUE_FORMAT_ERROR(10018, "ERROR_SYSTEM_REDIS_VALUE_FORMAT_ERROR", "redis中值格式不正确！", 1),

    /** ========== 应用错误码 ========== **/

    /**
     * 用户模块 20000-20099
     */

    /**
     * 用户名已经被注册
     */
    ERROR_APP_USER_USERNAME_DUPLICATE(20001, "ERROR_APP_USER_USERNAME_DUPLICATE", "用户名已经被注册！", 2),

    /**
     * 该手机号已经被注册
     */
    ERROR_APP_USER_MOBILE_DUPLICATE(20002, "ERROR_APP_USER_USERNAME_DUPLICATE", "该手机号已经被注册！", 2),

    /**
     * 用户推荐标识生成失败
     */
    ERROR_APP_USER_SHORT_URL_GENERATE(20002, "ERROR_APP_USER_SHORT_URL_GENERATE", "用户推荐标识生成失败！", 2),

    /**
     * 用户不存在
     */
    ERROR_APP_USER_NOTEXIST(20003, "ERROR_APP_USER_NOTEXIST", "用户不存在！", 2),

    /**
     * 用户名或密码不正确
     */
    ERROR_APP_USER_USERNAME_OR_PASS_WRONG(20004, "ERROR_APP_USER_USERNAME_OR_PASS_WRONG", "用户名或密码不正确！", 2),

    /**
     * 用户名不能为空
     */
    ERROR_APP_USER_USERNAME_CANNOT_EMPTY(20005, "ERROR_APP_USER_USERNAME_CANNOT_EMPTY", "用户名不能为空！", 2),

    /**
     * 用户姓名不能为空
     */
    ERROR_APP_USER_NAME_CANNOT_EMPTY(20006, "ERROR_APP_USER_NAME_CANNOT_EMPTY", "用户姓名不能为空！", 2),

    /**
     * 用户名字过长
     */
    ERROR_APP_USER_NAME_TOO_LONG(20007, "ERROR_APP_USER_NAME_TOO_LONG", "用户名字过长！", 2),

    /**
     * 用户id校验失败
     */
    ERROR_APP_USER_ID(20008, "ERROR_APP_USER_ID", "用户id校验失败！", 2),

    /**
     * 用户id不能为字符或为空
     */
    ERROR_APP_USER_ID_CANNOT_EMPTY(20009, "ERROR_APP_USER_ID_CANNOT_EMPTY", "用户id不能为字符或为空！", 2),

    /**
     * 管理员id不能为字符或为空
     */
    ERROR_APP_USER_ADMIN_ID_CANNOT_EMPTY(20010, "ERROR_APP_USER_ADMIN_ID_CANNOT_EMPTY", "管理员id不能为字符或为空！", 2),

    /**
     * 输入的密码不能为空
     */
    ERROR_APP_USER_PASSWORD_CANNOT_EMPTY(20011, "ERROR_APP_USER_PASSWORD_CANNOT_EMPTY", "输入的密码不能为空", 2),

    /**
     * 原密码不能为空
     */
    ERROR_APP_USER_OLD_PASSWORD_CANNOT_EMPTY(20012, "ERROR_APP_USER_OLD_PASSWORD_CANNOT_EMPTY", "原密码不能为空！", 2),

    /**
     * 新密码不能为空
     */
    ERROR_APP_USER_NEW_PASSWORD_CANNOT_EMPTY(20013, "ERROR_APP_USER_NEW_PASSWORD_CANNOT_EMPTY", "新密码不能为空！", 2),

    /**
     * 支付密码不正确
     */
    ERROR_APP_USER_PAY_PASSWORD_WRONG(20014, "ERROR_APP_USER_PAY_PASSWORD_WRONG", "支付密码不正确！", 2),

    /**
     * 支付密码不能与登录密码相同
     */
    ERROR_APP_USER_NEW_PASSWORD_CANNOT_SAME_AS_PAYPASSWORD(20015,
            "ERROR_APP_USER_NEW_PASSWORD_CANNOT_SAME_AS_PAYPASSWORD",
            "支付密码不能与登录密码相同！",
            2
    ),

    /**
     * 您输入的用户名过短
     */
    ERROR_APP_USER_USERNAME_TOO_SHORT(20016, "ERROR_APP_USER_USERNAME_TOO_SHORT", "您输入的用户名过短！", 2),

    /**
     * 您输入的用户名过长
     */
    ERROR_APP_USER_USERNAME_TOO_LONG(20017, "ERROR_APP_USER_USERNAME_TOO_LONG", "您输入的用户名过长！", 2),

    /**
     * 您输入的用户名不能全为数字
     */
    ERROR_APP_USER_USERNAME_CANNOT_BE_NUMBER(20018, "ERROR_APP_USER_USERNAME_CANNOT_BE_NUMBER", "您输入的用户名不能全为数字！", 2),

    /**
     * 您输入的用户名不符合规则，用户名只能包含汉字、英文、“_”和数字
     */
    ERROR_APP_USER_USERNAME_FORMAT(20019, "ERROR_APP_USER_USERNAME_FORMAT", "您输入的用户名不符合规则，用户名只能包含汉字、英文、“_”和数字！", 2),

    /**
     * 原始密码输入错误
     */
    ERROR_APP_USER_OLD_PASS_WRONG(20020, "ERROR_APP_USER_OLD_PASS_WRONG", "原始密码输入错误！", 2),

    /**
     * 新密码不能和原密码相同
     */
    ERROR_APP_USER_PASS_CANNOT_SAME(20021, "ERROR_APP_USER_PASS_CANNOT_SAME", "新密码不能和原密码相同！", 2),

    /**
     * 用户状态值不能为字符或为空
     */
    ERROR_APP_USER_STATUS_CANNOT_EMPTY(20022, "ERROR_APP_USER_STATUS_CANNOT_EMPTY", "用户状态值不能为字符或为空！", 2),

    /**
     * 用户状态异常
     */
    ERROR_APP_USER_STATUS_WRONG(20023, "ERROR_APP_USER_STATUS_WRONG", "用户状态异常！", 2),

    /**
     * 该用户账号已绑定其他手机号
     */
    ERROR_APP_USER_ALREADY_BIND_MOBILE(20024, "ERROR_APP_USER_ALREADY_BIND_MOBILE", "该用户账号已绑定其他手机号！", 2),

    /**
     * 该手机号已绑定其他用户账号
     */
    ERROR_APP_USER_MOBILE_ALREADY_BIND_USER(20025, "ERROR_APP_USER_MOBILE_ALREADY_BIND_USER", "该手机号已绑定其他用户账号！", 2),

    /**
     * 绑定的手机号不能为空
     */
    ERROR_APP_USER_MOBILE_CANNOT_EMPTY(20026, "ERROR_APP_USER_MOBILE_CANNOT_EMPTY", "绑定的手机号不能为空！", 2),

    /**
     * 手机号码不能低于11位
     */
    ERROR_APP_USER_MOBILE_NUMBER_TOO_SHORT(20027, "ERROR_APP_USER_MOBILE_NUMBER_TOO_SHORT", "手机号码不能低于11位！", 2),

    /**
     * 手机号码不能超过11位
     */
    ERROR_APP_USER_MOBILE_NUMBER_TOO_LONG(20028, "ERROR_APP_USER_MOBILE_NUMBER_TOO_LONG", "手机号码不能超过11位！", 2),

    /**
     * 手机号码格式不正确
     */
    ERROR_APP_USER_MOBILE_FORMAT(20029, "ERROR_APP_USER_MOBILE_FORMAT", "手机号码格式不正确！", 2),

    /**
     * 用户尚未绑定手机号，无需解绑
     */
    ERROR_APP_USER_MOBILE_NOT_BIND(20030, "ERROR_APP_USER_MOBILE_NOT_BIND", "用户尚未绑定手机号，无需解绑！", 2),

    /**
     * 用户尚未通过手机认证
     */
    ERROR_APP_USER_MOBILE_NOT_AUTH(20031, "ERROR_APP_USER_MOBILE_NOT_AUTH", "用户尚未通过手机认证！", 2),

    /**
     * 该用户账号已绑定其他邮箱账号
     */
    ERROR_APP_USER_ALREADY_BIND_EMAIL(20032, "ERROR_APP_USER_ALREADY_BIND_EMAIL", "该用户账号已绑定其他邮箱账号！", 2),

    /**
     * 该邮箱账号已绑定其他用户账号
     */
    ERROR_APP_USER_EMAIL_ALREADY_BIND_USER(20033, "ERROR_APP_USER_EMAIL_ALREADY_BIND_USER", "该邮箱账号已绑定其他用户账号！", 2),

    /**
     * 绑定的邮箱账号不能为空
     */
    ERROR_APP_USER_EMAIL_CANNOT_EMPTY(20034, "ERROR_APP_USER_EMAIL_CANNOT_EMPTY", "绑定的邮箱账号不能为空！", 2),

    /**
     * 绑定的邮箱账号过长
     */
    ERROR_APP_USER_EMAIL_TOO_LONG(20035, "ERROR_APP_USER_EMAIL_TOO_LONG", "绑定的邮箱账号过长！", 2),

    /**
     * 用户尚未绑定邮箱账号，无需解绑
     */
    ERROR_APP_USER_EMAIL_NOT_BIND(20036, "ERROR_APP_USER_EMAIL_NOT_BIND", "用户尚未绑定邮箱账号，无需解绑！", 2),

    /**
     * 用户尚未通过邮箱认证
     */
    ERROR_APP_USER_EMAIL_NOT_AUTH(20037, "ERROR_APP_USER_EMAIL_NOT_AUTH", "用户尚未通过邮箱认证！", 2),

    /**
     * 该用户账号已通过实名认证
     */
    ERROR_APP_USER_ALREADY_BIND_ID(20038, "ERROR_APP_USER_ALREADY_BIND_ID", "该用户账号已通过实名认证！", 2),

    /**
     * 该身份标识已被其他用户认证
     */
    ERROR_APP_USER_ID_ALREADY_BIND_USER(20039, "ERROR_APP_USER_ID_ALREADY_BIND_USER", "该身份标识已被其他用户认证！", 2),

    /**
     * 绑定的身份标识不能为空
     */
    ERROR_APP_USER_IDENTITY_CANNOT_EMPTY(20040, "ERROR_APP_USER_IDENTITY_CANNOT_EMPTY", "绑定的身份标识不能为空！", 2),

    /**
     * 绑定的身份标识过长
     */
    ERROR_APP_USER_IDENTITY_TOO_LONG(20041, "ERROR_APP_USER_IDENTITY_TOO_LONG", "绑定的身份标识过长！", 2),

    /**
     * 用户尚未实名认证，无需解绑
     */
    ERROR_APP_USER_IDENTITY_NOT_BIND(20042, "ERROR_APP_USER_IDENTITY_NOT_BIND", "用户尚未实名认证，无需解绑！", 2),

    /**
     * 用户尚未通过实名认证
     */
    ERROR_APP_USER_IDENTITY_NOT_AUTH(20043, "ERROR_APP_USER_IDENTITY_NOT_AUTH", "用户尚未通过实名认证！", 2),

    /**
     * 用户尚未通过实名认证
     */
    ERROR_APP_USER_IDENTITY_ERROR(20043, "ERROR_APP_USER_IDENTITY_ERROR", "实名认证出现异常！", 2),

    /**
     * 实名认证信息不一致
     */
    ERROR_APP_USER_IDENTITY_NOT_MATCH(20043, "ERROR_APP_USER_IDENTITY_NOT_MATCH", "实名认证信息不一致！", 2),

    /**
     * 用户详细信息不存在
     */
    ERROR_APP_USER_INFO_NOTEXIST(20044, "ERROR_APP_USER_INFO_NOTEXIST", "用户详细信息不存在！", 2),

    /**
     * 邮政编码必须为数字
     */
    ERROR_APP_USER_POSTAL_CODE_SHOULD_BE_NUMBER(20045, "ERROR_APP_USER_POSTAL_CODE_SHOULD_BE_NUMBER", "邮政编码必须为数字！", 2),

    /**
     * QQ号码必须为数字
     */
    ERROR_APP_USER_QQ_SHOULD_BE_NUMBER(20046, "ERROR_APP_USER_QQ_SHOULD_BE_NUMBER", "QQ号码必须为数字！", 2),

    /**
     * 安全问题id不能为空或为字符
     */
    ERROR_APP_USER_SECURITY_QUESTION_ID_CANNOT_EMPTY(20047, "ERROR_APP_USER_SECURITY_QUESTION_ID_CANNOT_EMPTY",
            "安全问题id不能为空或为字符！", 2
    ),

    /**
     * 安全问题名称不能为空
     */
    ERROR_APP_USER_SECURITY_QUESTION_CANNOT_EMPTY(20048, "ERROR_APP_USER_SECURITY_QUESTION_CANNOT_EMPTY",
            "安全问题名称不能为空！", 2
    ),

    /**
     * 安全问题不存在
     */
    ERROR_APP_USER_SECURITY_QUESTION_NOTEXIST(20049, "ERROR_APP_USER_SECURITY_QUESTION_NOTEXIST", "安全问题不存在！", 2),

    /**
     * 用户未设置安全问题答案
     */
    ERROR_APP_USER_SECURITY_QUESTION_ANSWER_NOTEXIST(20050, "ERROR_APP_USER_SECURITY_QUESTION_ANSWER_NOTEXIST",
            "用户未设置安全问题答案！", 2
    ),

    /**
     * 用户设置的安全问题答案与输入不匹配
     */
    ERROR_APP_USER_SECURITY_QUESTION_ANSWER_NOTMATCH(20051, "ERROR_APP_USER_SECURITY_QUESTION_ANSWER_NOTMATCH",
            "用户设置的安全问题答案与输入不匹配！", 2
    ),

    /**
     * 安全问题已存在
     */
    ERROR_APP_USER_SECURITY_QUESTION_REPEAT(20052, "ERROR_APP_USER_SECURITY_QUESTION_REPEAT", "安全问题已存在！", 2),

    /**
     * 设置的安全问题太长
     */
    ERROR_APP_USER_SECURITY_QUESTION_TOO_LONG(20053, "ERROR_APP_USER_SECURITY_QUESTION_TOO_LONG", "设置的安全问题太长！", 2),

    /**
     * 安全问题的答案不能为空
     */
    ERROR_APP_USER_SECURITY_ANSWER_CANNOT_EMPTY(
            20054,
            "ERROR_APP_USER_SECURITY_ANSWER_CANNOT_EMPTY",
            "安全问题的答案不能为空！",
            2
    ),

    /**
     * 安全问题的答案太长
     */
    ERROR_APP_USER_SECURITY_ANSWER_TOO_LONG(20055, "ERROR_APP_USER_SECURITY_ANSWER_TOO_LONG", "安全问题的答案太长！", 2),

    /**
     * 您已经为该问题设置了答案
     */
    ERROR_APP_USER_SECURITY_ANSWER_ALREADY_SET(20056, "ERROR_APP_USER_SECURITY_ANSWER_ALREADY_SET", "您已经为该问题设置了答案！", 2),

    /**
     * 用户登录信息不存在
     */
    ERROR_APP_USER_LOGIN_NOTEXIST(20057, "ERROR_APP_USER_LOGIN_NOTEXIST", "用户登录信息不存在！", 2),

    /**
     * 用户登录ip无效
     */
    ERROR_APP_USER_LOGIN_IP_INVALID(20058, "ERROR_APP_USER_LOGIN_IP_INVALID", "用户登录ip无效！", 2),

    /**
     * 用户尚未完成认证，无法投资
     */
    ERROR_APP_USER_NOT_AUTH(20059, "ERROR_APP_USER_NOT_AUTH", "用户尚未完成认证，无法投资！", 2),

    /**
     * 填写的省名称长度过长
     */
    ERROR_APP_USER_PROVINCE_TOO_LONG(20060, "ERROR_APP_USER_PROVINCE_TOO_LONG", "填写的省名称长度过长！", 2),

    /**
     * 填写的市名称长度过长
     */
    ERROR_APP_USER_CITY_TOO_LONG(20061, "ERROR_APP_USER_CITY_TOO_LONG", "填写的市名称长度过长！", 2),

    /**
     * 填写的区名称长度过长
     */
    ERROR_APP_USER_DISTRICT_TOO_LONG(20062, "ERROR_APP_USER_DISTRICT_TOO_LONG", "填写的区名称长度过长！", 2),

    /**
     * 填写的地址长度过长
     */
    ERROR_APP_USER_ADDRESS_TOO_LONG(20063, "ERROR_APP_USER_ADDRESS_TOO_LONG", "填写的地址长度过长！", 2),

    /**
     * 填写的邮编长度过长
     */
    ERROR_APP_USER_POSTCODE_TOO_LONG(20064, "ERROR_APP_USER_POSTCODE_TOO_LONG", "填写的邮编长度过长！", 2),

    /**
     * 填写的邮编长度过短
     */
    ERROR_APP_USER_POSTCODE_TOO_SHORT(20065, "ERROR_APP_USER_POSTCODE_TOO_SHORT", "填写的邮编长度过短！", 2),

    /**
     * 填写的QQ长度过长
     */
    ERROR_APP_USER_QQ_TOO_LONG(20066, "ERROR_APP_USER_QQ_TOO_LONG", "填写的QQ长度过长！", 2),

    /**
     * 用户登录token校验失败
     */
    ERROR_APP_USER_LOGIN_TOKEN_NOTMATCH(20067, "ERROR_APP_USER_LOGIN_TOKEN_NOTMATCH", "用户登录token校验失败！", 2),
    /**
     * 用户名和id不匹配
     */
    ERROR_APP_USER_ID_AND_USERNAME_NOT_MATCH(20068, "ERROR_APP_USER_ID_AND_USERNAME_NOT_MATCH", "用户名和id不匹配！", 2),
    /**
     * 手机号和用户id不匹配
     */
    ERROR_APP_USER_ID_AND_MOBILE_NOT_MATCH(20069, "ERROR_APP_USER_ID_AND_MOBILE_NOT_MATCH", "手机号和用户id不匹配！", 2),

    /**
     * 用户的app识别id不存在
     */
    ERROR_APP_USER_APPSOURCE_ID_IS_EMPTY(20070, "ERROR_APP_USER_APPSOURCE_ID_IS_EMPTY", "用户的app识别id不存在！", 2),

    /**
     * 资金模块 20100-20199
     */

    /**
     * 系统尚未添加支持转账的银行
     */
    ERROR_APP_ACCOUNT_BANK_LIST_NOTEXIST(20100, "ERROR_APP_ACCOUNT_BANK_LIST_NOTEXIST", "系统尚未添加支持的银行！", 2),

    /**
     * 无效的银行id
     */
    ERROR_APP_ACCOUNT_BANK_ID_NOTVALID(20101, "ERROR_APP_ACCOUNT_BANK_ID_NOTVALID", "无效的银行id！", 2),

    /**
     * 已存在预绑定的银行卡d
     */
    ERROR_APP_ACCOUNT_BANK_ALREADY_PEBIND(20101, "ERROR_APP_ACCOUNT_BANK_ALREADY_PEBIND", "已存在预绑定的银行卡！", 2),

    /**
     * 该用户还没有资金账户充值流水
     */
    ERROR_APP_ACCOUNT_RECHARGE_LIST_NOTEXIST(20102, "ERROR_APP_ACCOUNT_RECHARGE_LIST_NOTEXIST", "该用户还没有资金账户充值流水！", 2),

    /**
     * 该用户还没有资金账户流水
     */
    ERROR_APP_ACCOUNT_CAPITAL_LIST_NOTEXIST(20103, "ERROR_APP_ACCOUNT_CAPITAL_LIST_NOTEXIST", "该用户还没有资金账户流水！", 2),

    /**
     * 该用户还没有绑定银行卡
     */
    ERROR_APP_ACCOUNT_USER_BANK_CARD_NOTEXIST(20104, "ERROR_APP_ACCOUNT_USER_BANK_CARD_NOTEXIST", "该用户还没有绑定银行卡！", 2),

    /**
     * 您已经绑定了银行卡，要绑定其他银行卡，请先解绑原卡
     */
    ERROR_APP_ACCOUNT_USER_ALREADY_BIND_CARD(20105, "ERROR_APP_ACCOUNT_USER_ALREADY_BIND_CARD",
            "您已经绑定了银行卡，要绑定其他银行卡，请先解绑原卡！", 2
    ),

    /**
     * 该用户还没有设置默认银行卡
     */
    ERROR_APP_ACCOUNT_USER_DEFAULT_BANK_CARD_NOTEXIST(20106, "ERROR_APP_ACCOUNT_USER_DEFAULT_BANK_CARD_NOTEXIST",
            "该用户还没有设置默认银行卡！", 2
    ),

    /**
     * 该银行卡已经被其他用户绑定
     */
    ERROR_APP_ACCOUNT_BANK_CARD_ALREADY_BE_BOUND(20107, "ERROR_APP_ACCOUNT_BANK_CARD_ALREADY_BE_BOUND",
            "该银行卡已经被其他用户绑定！", 2
    ),

    /**
     * 该银行卡和用户的默认银行卡不匹配
     */
    ERROR_APP_ACCOUNT_USER_AND_CARD_NOTMATCH(20108, "ERROR_APP_ACCOUNT_USER_AND_CARD_NOTMATCH", "该银行卡和用户的默认银行卡不匹配！", 2),

    /**
     * 银行卡id不能为空
     */
    ERROR_APP_ACCOUNT_USER_BANK_CARD_CANNOT_EMPTY(20109, "ERROR_APP_ACCOUNT_USER_BANK_CARD_CANNOT_EMPTY", "银行卡id不能为空！",
            2
    ),

    /**
     * 银行卡对应的银行id不能为空或为字符
     */
    ERROR_APP_ACCOUNT_BANK_ID_CANNOT_EMPTY(20110, "ERROR_APP_ACCOUNT_BANK_ID_CANNOT_EMPTY", "银行卡对应的银行id不能为空或为字符！", 2),

    /**
     * 银行卡所在省不能为空
     */
    ERROR_APP_ACCOUNT_BANK_PROVINCE_CANNOT_EMPTY(20111, "ERROR_APP_ACCOUNT_BANK_PROVINCE_CANNOT_EMPTY", "银行卡所在省不能为空！",
            2
    ),

    /**
     * 银行卡所在省名称的长度过长
     */
    ERROR_APP_ACCOUNT_BANK_PROVINCE_TOO_LONG(20112, "ERROR_APP_ACCOUNT_BANK_PROVINCE_TOO_LONG", "银行卡所在省名称的长度过长！", 2),

    /**
     * 银行卡所在市不能为空
     */
    ERROR_APP_ACCOUNT_BANK_CITY_CANNOT_EMPTY(20113, "ERROR_APP_ACCOUNT_BANK_CITY_CANNOT_EMPTY", "银行卡所在市不能为空！", 2),

    /**
     * 银行卡所在省名称的长度过长
     */
    ERROR_APP_ACCOUNT_BANK_CITY_TOO_LONG(20114, "ERROR_APP_ACCOUNT_BANK_CITY_TOO_LONG", "银行卡所在市名称的长度过长！", 2),

    /**
     * 银行卡所在区不能为空
     */
    ERROR_APP_ACCOUNT_BANK_DISTRICT_CANNOT_EMPTY(20115, "ERROR_APP_ACCOUNT_BANK_DISTRICT_CANNOT_EMPTY", "银行卡所在区不能为空！",
            2
    ),

    /**
     * 银行卡所在区名称的长度过长
     */
    ERROR_APP_ACCOUNT_BANK_DISTRICT_TOO_LONG(20116, "ERROR_APP_ACCOUNT_BANK_DISTRICT_TOO_LONG", "银行卡所在区名称的长度过长！", 2),

    /**
     * 银行卡所属银行的开户行名称不能为空
     */
    ERROR_APP_ACCOUNT_BANK_SUB_BRANCH_CANNOT_EMPTY(20117, "ERROR_APP_ACCOUNT_BANK_SUB_BRANCH_CANNOT_EMPTY",
            "银行卡所属银行的开户行名称不能为空！", 2
    ),

    /**
     * 银行卡开户银行所在开户行名称必须全为中文
     */
    ERROR_APP_ACCOUNT_BANK_SUB_BRANCH_MUST_CHINESE(20118, "ERROR_APP_ACCOUNT_BANK_SUB_BRANCH_MUST_CHINESE",
            "银行卡开户银行所在开户行名称必须全为中文！", 2
    ),

    /**
     * 银行卡开户银行所在开户行名称的长度过长
     */
    ERROR_APP_ACCOUNT_BANK_SUB_BRANCH_TOO_LONG(20119, "ERROR_APP_ACCOUNT_BANK_SUB_BRANCH_TOO_LONG",
            "银行卡开户银行所在开户行名称的长度过长！", 2
    ),

    /**
     * 银行卡所属银行的支行名称不能为空
     */
    ERROR_APP_ACCOUNT_BANK_BRANCH_CANNOT_EMPTY(20120, "ERROR_APP_ACCOUNT_BANK_BRANCH_CANNOT_EMPTY",
            "银行卡所属银行的支行名称不能为空！", 2
    ),

    /**
     * 银行卡所属银行的支行名称必须全为中文
     */
    ERROR_APP_ACCOUNT_BANK_BRANCH_MUST_CHINESE(20121, "ERROR_APP_ACCOUNT_BANK_BRANCH_MUST_CHINESE",
            "银行卡所属银行的支行名称必须全为中文！", 2
    ),

    /**
     * 银行卡开户银行所在支行名称的长度过长
     */
    ERROR_APP_ACCOUNT_BANK_BRANCH_TOO_LONG(20122, "ERROR_APP_ACCOUNT_BANK_BRANCH_TOO_LONG", "银行卡开户银行所在支行名称的长度过长！", 2),

    /**
     * 银行卡卡号不能为空或为字符
     */
    ERROR_APP_ACCOUNT_BANK_CARD_NUMBER_CANNOT_EMPTY(20123, "ERROR_APP_ACCOUNT_BANK_CARD_NUMBER_CANNOT_EMPTY",
            "银行卡卡号不能为空或为字符！", 2
    ),

    /**
     * 银行卡卡号太长
     */
    ERROR_APP_ACCOUNT_BANK_CARD_NUMBER_TOO_LONG(20124, "ERROR_APP_ACCOUNT_BANK_CARD_NUMBER_TOO_LONG", "银行卡卡号太长！", 2),

    /**
     * 银行卡号位数不正确
     */
    ERROR_APP_ACCOUNT_BANK_CARD_NUMBER_FORMAT(20125, "ERROR_APP_ACCOUNT_BANK_CARD_NUMBER_FORMAT", "银行卡号位数不正确！", 2),

    /**
     * 银行卡开户人不能为空
     */
    ERROR_APP_ACCOUNT_BANK_HOLDER_CANNOT_EMPTY(20126, "ERROR_APP_ACCOUNT_BANK_HOLDER_CANNOT_EMPTY", "银行卡开户人不能为空！", 2),

    /**
     * 银行卡开户人名字太长
     */
    ERROR_APP_ACCOUNT_BANK_HOLDER_TOO_LONG(20127, "ERROR_APP_ACCOUNT_BANK_HOLDER_TOO_LONG", "银行卡开户人名字太长！", 2),

    /**
     * 资金账户充值金额不能为字符或为空，且必须大于0
     */
    ERROR_APP_ACCOUNT_RECHARGE_CANNOT_EMPTY(20128, "ERROR_APP_ACCOUNT_RECHARGE_CANNOT_EMPTY",
            "资金账户充值金额不能为字符或为空，且必须大于0！", 2
    ),

    /**
     * 资金账户充值金额必须为整数
     */
    ERROR_APP_ACCOUNT_RECHARGE_MUST_INTEGER(20129, "ERROR_APP_ACCOUNT_RECHARGE_MUST_INTEGER", "资金账户充值金额必须为整数！", 2),

    /**
     * 资金账户充值金额过大
     */
    ERROR_APP_ACCOUNT_RECHARGE_TOO_MUCH(20130, "ERROR_APP_ACCOUNT_RECHARGE_TOO_MUCH", "资金账户充值金额过大！", 2),

    /**
     * 用户充值记录不存在
     */
    ERROR_APP_ACCOUNT_RECHARGE_NOTEXIST(20131, "ERROR_APP_ACCOUNT_RECHARGE_NOTEXIST", "用户充值记录不存在！", 2),

    /**
     * 资金账户充值结算状态值无效
     */
    ERROR_APP_ACCOUNT_RECHARGE_STATUS_NOT_VALID(20132, "ERROR_APP_ACCOUNT_RECHARGE_STATUS_NOT_VALID", "资金账户充值结算状态值无效！",
            2
    ),

    /**
     * 充值记录已处理，不能再次变更
     */
    ERROR_APP_ACCOUNT_RECHARGE_PROCESSED(20133, "ERROR_APP_ACCOUNT_RECHARGE_PROCESSED", "充值记录已处理，不能再次变更！", 2),

    ERROR_APP_ACCOUNT_RECHARGE_AMOUNT_ERROR(20133, "ERROR_APP_ACCOUNT_RECHARGE_AMOUNT_ERROR", "充值金额不匹配！", 2),

    /**
     * 该用户还没有资金账户提现流水
     */
    ERROR_APP_ACCOUNT_WITHDRAW_LIST_NOTEXIST(20134, "ERROR_APP_ACCOUNT_WITHDRAW_LIST_NOTEXIST", "该用户还没有资金账户提现流水！", 2),

    /**
     * 资金账户提现金额不能为字符或为空，且必须大于0
     */
    ERROR_APP_ACCOUNT_WITHDRAW_CANNOT_EMPTY(20135, "ERROR_APP_ACCOUNT_WITHDRAW_CANNOT_EMPTY",
            "资金账户提现金额不能为字符或为空，且必须大于0！", 2
    ),

    /**
     * 提现金额必须大于手续费
     */
    ERROR_APP_ACCOUNT_WITHDRAW_MUST_MORE_THAN_FEE(20136, "ERROR_APP_ACCOUNT_WITHDRAW_MUST_MORE_THAN_FEE",
            "提现金额必须大于手续费！", 2
    ),

    /**
     * 更新资金账户的提现记录id不能为空或为字符
     */
    ERROR_APP_ACCOUNT_WITHDRAW_UPDATE_ID_CANNOT_EMPTY(20137, "ERROR_APP_ACCOUNT_WITHDRAW_UPDATE_ID_CANNOT_EMPTY",
            "更新资金账户的提现记录id不能为空或为字符！", 2
    ),

    /**
     * 资金账户的提现号不能为空
     */
    ERROR_APP_ACCOUNT_WITHDRAW_NO_CANNOT_EMPTY(20138, "ERROR_APP_ACCOUNT_WITHDRAW_NO_CANNOT_EMPTY", "资金账户的提现号不能为空！", 2),

    /**
     * 资金账户提现银行卡id不能为空
     */
    ERROR_APP_ACCOUNT_WITHDRAW_BANKCARD_CANNOT_EMPTY(20139, "ERROR_APP_ACCOUNT_WITHDRAW_BANKCARD_CANNOT_EMPTY",
            "资金账户提现银行卡id不能为空！", 2
    ),

    /**
     * 用户提现记录不存在
     */
    ERROR_APP_ACCOUNT_WITHDRAW_NOTEXIST(20140, "ERROR_APP_ACCOUNT_WITHDRAW_NOTEXIST", "用户提现记录不存在！", 2),

    /**
     * 资金账户单笔提现金额不能超过1000万
     */
    ERROR_APP_ACCOUNT_WITHDRAW_TOO_MUCH(20141, "ERROR_APP_ACCOUNT_WITHDRAW_TOO_MUCH", "资金账户单笔提现金额不能超过1000万！", 2),

    /**
     * 提现记录已处理，不能再次变更
     */
    ERROR_APP_ACCOUNT_WITHDRAW_PROCESSED(20142, "ERROR_APP_ACCOUNT_WITHDRAW_PROCESSED", "提现记录已处理，不能再次变更！", 2),

    /**
     * 资金账户提现结算状态值无效
     */
    ERROR_APP_ACCOUNT_WITHDRAW_STATUS_NOT_VALID(20143, "ERROR_APP_ACCOUNT_WITHDRAW_STATUS_NOT_VALID", "资金账户提现结算状态值无效！",
            2
    ),

    /**
     * 提现流水号不能为空
     */
    ERROR_APP_ACCOUNT_WITHDRAW_NO_NOT_VALID(20144, "ERROR_APP_ACCOUNT_WITHDRAW_NO_NOT_VALID", "提现流水号不能为空！", 2),

    /**
     * 奖励账户类型不存在，请检查该类型
     */
    ERROR_APP_ACCOUNT_REWARD_TYPE_NOTEXIST(20145, "ERROR_APP_ACCOUNT_REWARD_TYPE_NOTEXIST", "奖励账户类型不存在，请检查该类型！", 2),

    /**
     * 用户尚未收到任何奖励
     */
    ERROR_APP_ACCOUNT_REWARD_NOTEXIST(20146, "ERROR_APP_ACCOUNT_REWARD_NOTEXIST", "用户尚未收到任何奖励！", 2),

    /**
     * 用户免提现费流水列表为空
     */
    ERROR_APP_ACCOUNT_FREECREDIT_NOTEXIST(20147, "ERROR_APP_ACCOUNT_FREECREDIT_NOTEXIST", "用户免提现费流水列表为空！", 2),

    /**
     * 用户余额初始化失败
     */
    ERROR_APP_ACCOUNT_BALANCE_INIT(20148, "ERROR_APP_ACCOUNT_BALANCE_INIT", "用户余额初始化失败！", 2),

    /**
     * 余额类型不存在，请检查该类型
     */
    ERROR_APP_ACCOUNT_BALANCE_TYPE_NOTEXIST(20149, "ERROR_APP_ACCOUNT_BALANCE_TYPE_NOTEXIST", "余额类型不存在，请检查该类型！", 2),

    /**
     * 获取不到余额，请检查传入参数
     */
    ERROR_APP_ACCOUNT_BALANCE_NOTEXIST(20150, "ERROR_APP_ACCOUNT_BALANCE_NOTEXIST", "获取不到余额，请检查传入参数！", 2),

    /**
     * 资金账户余额不足
     */
    ERROR_APP_ACCOUNT_BALANCE_LACKING(20151, "ERROR_APP_ACCOUNT_BALANCE_LACKING", "资金账户余额不足！", 2),

    /**
     * 奖励账户余额不足
     */
    ERROR_APP_ACCOUNT_REWARD_BALANCE_LACKING(20152, "ERROR_APP_ACCOUNT_REWARD_BALANCE_LACKING", "奖励账户余额不足！", 2),

    /**
     * 平台账户余额不足
     */
    ERROR_APP_ACCOUNT_PLATFORM_BALANCE_LACKING(20153, "ERROR_APP_ACCOUNT_PLATFORM_BALANCE_LACKING", "平台账户余额不足！", 2),

    /**
     * 项目可投资额度不足
     */
    ERROR_APP_ACCOUNT_PROJECT_BALANCE_LACKING(20154, "ERROR_APP_ACCOUNT_PROJECT_BALANCE_LACKING", "项目可投资额度不足！", 2),

    /**
     * 免提现费额度不足
     */
    ERROR_APP_ACCOUNT_FREECREDIT_BALANCE_LACKING(20155, "ERROR_APP_ACCOUNT_FREECREDIT_BALANCE_LACKING", "免提现费额度不足！", 2),

    /**
     * 每日提现限制次数达到上限
     */
    ERROR_APP_ACCOUNT_WITHDRAW_TIMES_BALANCE_LACKING(20156, "ERROR_APP_ACCOUNT_WITHDRAW_TIMES_BALANCE_LACKING",
            "每日提现限制次数达到上限！", 2
    ),

    /**
     * 平台账户记录收入流水时，收入资金不能为空
     */
    ERROR_APP_ACCOUNT_PLATFORM_INCOME_CANNOT_EMPTY(20157, "ERROR_APP_ACCOUNT_PLATFORM_INCOME_CANNOT_EMPTY",
            "平台账户记录收入流水时，收入资金不能为空！", 2
    ),

    /**
     * 平台账户记录支出流水时，支出资金不能为空
     */
    ERROR_APP_ACCOUNT_PLATFORM_OUTLAY_CANNOT_EMPTY(20158, "ERROR_APP_ACCOUNT_PLATFORM_OUTLAY_CANNOT_EMPTY",
            "平台账户记录支出流水时，支出资金不能为空！", 2
    ),
    /**
     * 查询平台充值流水记录出错
     */
    ERROR_APP_ACCOUNT_GET_RECHARGE_LOG_ERROR(20159, "ERROR_APP_ACCOUNT_GET_RECHARGE_LOG_ERROR", "查询平台充值流水记录出错！", 2),
    /**
     * 查询提现流水记录出错
     */
    ERROR_APP_ACCOUNT_GET_WITHDRAW_LOG_ERROR(20160, "ERROR_APP_ACCOUNT_GET_WITHDRAW_LOG_ERROR", "查询提现流水记录出错！", 2),
    /**
     * 提现流水号已经存在
     */
    ERROR_APP_ACCOUNT_WITHDRAW_NO_EXISTS(20161, "ERROR_APP_ACCOUNT_WITHDRAW_NO_EXISTS", "提现流水号已经存在！", 2),
    /**
     * 更新平台充值流水记录出错
     */
    ERROR_APP_ACCOUNT_UPDATE_RECHARGE_LOG_ERROR(20162, "ERROR_APP_ACCOUNT_UPDATE_RECHARGE_LOG_ERROR", "更新平台充值流水记录出错！",
            2
    ),

    /**
     * 资金账户充值时的交易号不能为空
     */
    ERROR_APP_ACCOUNT_RECHARGE_TRADE_NO_CANNOT_EMPTY(20163, "ERROR_APP_ACCOUNT_RECHARGE_TRADE_NO_CANNOT_EMPTY",
            "资金账户充值时的交易号不能为空！", 2
    ),

    /**
     * 资金账户充值时的签名不能为空
     */
    ERROR_APP_ACCOUNT_RECHARGE_SIGN_CANNOT_EMPTY(20164, "ERROR_APP_ACCOUNT_RECHARGE_SIGN_CANNOT_EMPTY",
            "资金账户充值时的签名不能为空！", 2
    ),

    /**
     * 资金账户充值时的交易号或签名必须唯一
     */
    ERROR_APP_ACCOUNT_RECHARGE_TRADE_NO_OR_SIGN_MUST_UNIQUE(20165,
            "ERROR_APP_ACCOUNT_RECHARGE_TRADE_NO_OR_SIGN_MUST_UNIQUE",
            "资金账户充值时的交易号或签名必须唯一！",
            2
    ),

    /**
     * 资金账户充值已经充值成功或失败
     */
    ERROR_APP_ACCOUNT_RECHARGE_SUCCESS_OR_FAIL(20166, "ERROR_APP_ACCOUNT_RECHARGE_SUCCESS_OR_FAIL", "资金账户充值已经充值成功或失败！",
            2
    ),

    /**
     * 资金账户充值充值成功
     */
    ERROR_APP_ACCOUNT_RECHARGE_SUCCESS(20167, "ERROR_APP_ACCOUNT_RECHARGE_SUCCESS", "资金账户充值充值成功！", 2),

    /**
     * 资金账户充值充值失败
     */
    ERROR_APP_ACCOUNT_RECHARGE_FAIL(20168, "ERROR_APP_ACCOUNT_RECHARGE_FAIL", "资金账户充值失败！", 2),

    /**
     * 资金账户充值充值异常
     */
    ERROR_APP_ACCOUNT_RECHARGE_ERROR(20169, "ERROR_APP_ACCOUNT_RECHARGE_ERROR", "资金账户充值异常！", 2),

    /**
     * 奖励金额为空或者null
     */
    ERROR_APP_ACCOUNT_REWARD_ERROR_OR_NULL(20170, "ERROR_APP_ACCOUNT_REWARD_ERROR_OR_NULL", "奖励金额为空或者null！", 2),
    /**
     * 奖励来源ID为空或者null
     */
    ERROR_APP_ACCOUNT_REWARD_SOURCE_ID_ERROR_OR_NULL(20171, "ERROR_APP_ACCOUNT_REWARD_SOURCE_ID_ERROR_OR_NULL",
            "奖励来源ID为空或者null！", 2
    ),
    /**
     * 用户在该问卷已送过奖励
     */
    ERROR_APP_ACCOUNT_REWARD_IS_SENDED(20172, "ERROR_APP_ACCOUNT_REWARD_IS_SENDED", "用户在该问卷已送过奖励！", 2),

    /**
     * 债权模块 20200-20299
     */

    /**
     * adminId数值格式非Long型
     */
    ERROR_APP_DEBT_ADMINID_VALUEINVALID(20201, "ERROR_APP_DEBT_ADMINID_VALUEINVALID", "adminId数值格式非Long型", 2),

    /**
     * 省市区代码格式无效
     */
    ERROR_APP_DEBT_PCDCODE_VALUEINVALID(20202, "ERROR_APP_DEBT_PCDCODE_VALUEINVALID", "省市区代码格式无效", 2),

    /**
     * 年龄值无效
     */
    ERROR_APP_DEBT_AGE_VALUEINVALID(20203, "ERROR_APP_DEBT_AGE_VALUEINVALID", "年龄值无效", 2),

    /**
     * 性别值无效
     */
    ERROR_APP_DEBT_SEX_VALUEINVALID(20204, "ERROR_APP_DEBT_SEX_VALUEINVALID", "性别值无效", 2),

    /**
     * 借款额值无效
     */
    ERROR_APP_DEBT_AMOUNT_VALUEINVALID(20205, "ERROR_APP_DEBT_AMOUNT_VALUEINVALID", "借款额值无效", 2),

    /**
     * 年化收益率值无效
     */
    ERROR_APP_DEBT_ANNUALRATE_VALUEINVALID(20206, "ERROR_APP_DEBT_ANNUALRATE_VALUEINVALID", "年化收益率值无效", 2),

    /**
     * 手续费率值无效
     */
    ERROR_APP_DEBT_FEERATE_VALUEINVALID(20207, "ERROR_APP_DEBT_FEERATE_VALUEINVALID", "手续费率值无效", 2),

    /**
     * 时间值无效
     */
    ERROR_APP_DEBT_TIME_VALUEINVALID(20208, "ERROR_APP_DEBT_TIME_VALUEINVALID", "时间值无效", 2),

    /**
     * 质押价值、年收入、年营业额无效
     */
    ERROR_APP_DEBT_INCOME_VALUEINVALID(20209, "ERROR_APP_DEBT_INCOME_VALUEINVALID", "质押价值、年收入、年营业额无效", 2),

    /**
     * 法人年龄值无效
     */
    ERROR_APP_DEBT_LEGALAGE_VALUEINVALID(20210, "ERROR_APP_DEBT_LEGALAGE_VALUEINVALID", "法人年龄值无效", 2),

    /**
     * 公司经营年限值无效
     */
    ERROR_APP_DEBT_OPERATEPERIOD_VALUEINVALID(20211, "ERROR_APP_DEBT_OPERATEPERIOD_VALUEINVALID", "公司经营年限值无效", 2),

    /**
     * Query值无效
     */
    ERROR_APP_DEBT_QUERYPARAM_VALUEINVALID(20212, "ERROR_APP_DEBT_QUERYPARAM_VALUEINVALID", "Query值无效", 2),

    /**
     * 生成债权失败
     */
    ERROR_APP_DEBT_INSERT_FAILED(20213, "ERROR_APP_DEBT_INSERT_FAILED", "生成债权失败", 1),

    /**
     * 未找到债权付息表
     */
    ERROR_APP_DEBT_NOINTEREST_FOUNT(20214, "ERROR_APP_DEBT_NOINTEREST_FOUNT", "未找到债权付息表", 2),

    /**
     * ID值无效
     */
    ERROR_APP_DEBT_ID_VALUEINVALID(20215, "ERROR_APP_DEBT_ID_VALUEINVALID", "ID值无效", 2),

    /**
     * 附件模块 20300-20399
     */
    /**
     * 提交参数值无效
     */
    ERROR_APP_ATTACHMENT_PARAMS_VALUEINVALID(20301, "ERROR_APP_ATTACHMENT_PARAMS_VALUEINVALID", "提交参数值无效", 2),

    /**
     * 附件上传失败
     */
    ERROR_APP_ATTACHMENT_UPLOAD_FAILED(20302, "ERROR_APP_ATTACHMENT_UPLOAD_FAILED", "附件上传失败", 2),

    /**
     * 项目模块 20400-20499
     */
    /**
     * 新增项目失败
     */
    ERROR_APP_PROJECT_INSERT_FAILED(20401, "ERROR_APP_PROJECT_INSERT_FAILED", "新增项目失败", 2),

    /**
     * 新增项目附件失败
     */
    ERROR_APP_PROJECT_INSERT_ATTACHMENT_FAILED(20402, "ERROR_APP_PROJECT_INSERT_ATTACHMENT_FAILED", "新增项目附件失败", 2),

    /**
     * 项目不存在
     */
    ERROR_APP_PROJECT_NOTEXISTS(20403, "ERROR_APP_PROJECT_NOTEXISTS", "项目不存在", 2),

    /**
     * 项目审核状态码有误
     */
    ERROR_APP_PROJECT_AUDIT_ERROR(20404, "ERROR_APP_PROJECT_AUDIT_ERROR", "项目审核状态码有误", 2),

    /**
     * 项目ID为空或者格式错误
     */
    ERROR_APP_PROJECT_ID_NULL_OR_ERROR(20405, "ERROR_APP_PROJECT_ID_NULL_OR_ERROR", "项目ID为空或者格式错误", 2),

    /**
     * 修改项目失败
     */
    ERROR_APP_PROJECT_UPDATE_FAILED(20406, "ERROR_APP_PROJECT_UPDATE_FAILED", "修改项目失败", 2),

    /**
     * 项目名称为空
     */
    ERROR_APP_PROJECT_NAME_NULL(20407, "ERROR_APP_PROJECT_NAME_NULL", "项目名称为空", 2),

    /**
     * 项目余额不足
     */
    ERROR_APP_PROJECT_BALANCE_LACEING(20408, "ERROR_APP_PROJECT_BALANCE_LACEING", "项目余额不足", 2),

    /**
     * 项目名称和项目ID不匹配
     */
    ERROR_APP_PROJECT_NAME_ID_NOT_MATCH(20409, "ERROR_APP_PROJECT_NAME_ID_NOT_MATCH", "项目名称和项目ID不匹配", 2),
    /**
     * 项目余额为0
     */
    ERROR_APP_PROJECT_BALANCE_ZERO(20410, "ERROR_APP_PROJECT_BALANCE_ZERO", "项目余额为0", 2),

    /**
     * 项目提前赎回时间为空或null
     */
    ERROR_APP_PROJECT_REDEEM_DATE_NULL(20411, "ERROR_APP_PROJECT_REDEEM_DATE_NULL", "项目提前赎回时间为空或null", 2),

    /**
     * 项目余额不存在
     */
    ERROR_APP_PROJECT_BALANCE_NOT_EXISTS(20412, "ERROR_APP_PROJECT_BALANCE_NOT_EXISTS", "项目余额不存在", 2),
    /**
     * 交易 20500-20599
     */
    /**
     * 交易记录列表为空
     */
    ERROR_APP_TRANSACTION_LIST_NOTEXISTS(20501, "ERROR_APP_TRANSACTION_LIST_NOTEXISTS", "交易记录列表为空", 2),

    /**
     * 交易记录插入失败
     */
    ERROR_APP_TRANSACTION_INSERT_ERROR(20502, "ERROR_APP_TRANSACTION_INSERT_ERROR", "交易记录插入失败", 2),

    /**
     * 交易利息为空
     */
    ERROR_APP_TRANSACTION_INTEREST_NOTEXISTS_ERROR(
            20503,
            "ERROR_APP_TRANSACTION_INTEREST_NOTEXISTS_ERROR",
            "交易利息为空",
            2
    ),

    /**
     * 交易利息记录列表为空
     */
    ERROR_APP_TRANSACTION_INTEREST_LIST_NOTEXISTS(20504, "ERROR_APP_TRANSACTION_INTEREST_LIST_NOTEXISTS", "交易利息记录列表为空",
            2
    ),

    /**
     * 交易_项目不是有效项目
     */
    ERROR_APP_TRANSACTION_PROJECT_NOT_VALID(20505, "ERROR_APP_TRANSACTION_PROJECT_NOT_VALID", "交易_项目不是有效项目", 2),

    /**
     * 交易_使用用户账户资金和奖励账户资金都为0
     */
    ERROR_APP_TRANSACTION_CAPITAL_REWARD_ZERO(20506, "ERROR_APP_TRANSACTION_CAPITAL_REWARD_ZERO",
            "交易_使用用户账户资金和奖励账户资金都为0", 2
    ),

    /**
     * 交易_使用用户账户资金和奖励账户资金之和小于项目起投金额
     */
    ERROR_APP_TRANSACTION_PROJECT_LESS_MINIVESTMOUNT(20507, "ERROR_APP_TRANSACTION_PROJECT_LESS_MINIVESTMOUNT",
            "交易_使用用户账户资金和奖励账户资金之和小于项目起投金额", 2
    ),

    /**
     * 交易_用户投资额为空
     */
    ERROR_APP_TRANSACTION_INVEST_TMOUNT_NULL(20508, "ERROR_APP_TRANSACTION_INVEST_TMOUNT_NULL", "交易_用户投资额为空", 2),

    /**
     * 交易_使用用户账户资金和奖励账户资金都为NULL
     */
    ERROR_APP_TRANSACTION_CAPITAL_REWARD_NULL(20509, "ERROR_APP_TRANSACTION_CAPITAL_REWARD_NULL",
            "交易_使用用户账户资金和奖励账户资金都为NULL", 2
    ),

    /**
     * 交易_年化收益为NULL
     */
    ERROR_APP_TRANSACTION_ANNUALIZED_RATE_NULL(20510, "ERROR_APP_TRANSACTION_ANNUALIZED_RATE_NULL", "交易_年化收益为NULL", 2),

    /**
     * 插入交易利息记录失败
     */
    ERROR_APP_TRANSACTION_INTEREST_INSERT_ERROR(20511, "ERROR_APP_TRANSACTION_INTEREST_INSERT_ERROR", "插入交易利息记录失败", 2),

    /**
     * 使用奖励账户金额大于该用户投资额总额的1%
     */
    ERROR_APP_TRANSACTION_REWARD_MORE_INVEST(20512, "ERROR_APP_TRANSACTION_REWARD_MORE_INVEST",
            "使用奖励账户金额大于该用户投资额总额的1%", 2
    ),

    /**
     * 总投资额小于起投金额
     */
    ERROR_APP_TRANSACTION_INVESTAMOUNT_LESS_MININVESTAMOUNT(20513,
            "ERROR_APP_TRANSACTION_INVESTAMOUNT_LESS_MININVESTAMOUNT",
            "总投资额小于起投金额",
            2
    ),

    /**
     * 递增金额有误
     */
    ERROR_APP_TRANSACTION_INCREMENT_AMOUNT_ERROR(20514, "ERROR_APP_TRANSACTION_INCREMENT_AMOUNT_ERROR", "递增金额有误", 2),

    /**
     * 计算利息出错
     */
    ERROR_APP_TRANSACTION_CALCULATE_INTEREST_ERROR(
            20515,
            "ERROR_APP_TRANSACTION_CALCULATE_INTEREST_ERROR",
            "计算利息出错",
            2
    ),

    /**
     * 金额大于项目投资总额
     */
    ERROR_APP_TRANSACTION_AMOUNT_MORE_THAN_TOTAL_MOUNT(20516, "ERROR_APP_TRANSACTION_AMOUNT_MORE_THAN_TOTAL_MOUNT",
            "金额大于项目投资总额", 2
    ),

    /**
     * 支付密码为空或者不正确
     */
    ERROR_APP_TRANSACTION_PAY_PASSWORD_BE_NULL_OR_WRONG(20517, "ERROR_APP_TRANSACTION_PAY_PASSWORD_BE_NULL_OR_WRONG",
            "支付密码为空或者不正确", 2
    ),

    /**
     * 使用资金账户金额与使用奖励账户金额之和不等于投资金额
     */
    ERROR_APP_TRANSACTION_USEDCAPITAL_USEDREWARD_NOT_EQUAL_INVESTAMOUNT(20518,
            "ERROR_APP_TRANSACTION_USEDCAPITAL_USEDREWARD_NOT_EQUAL_INVESTAMOUNT",
            "使用资金账户金额与使用奖励账户金额之和不等于投资金额",
            2
    ),
    /**
     * 交易id为null
     */
    ERROR_APP_TRANSACTION_ID_NULL(20519, "ERROR_APP_TRANSACTION_ID_NULL", "交易id为null", 2),

    /**
     * 交易不存在
     */
    ERROR_APP_TRANSACTION_NOT_EXIST(20520, "ERROR_APP_TRANSACTION_NOT_EXIST", "交易不存在", 2),

    /**
     * 新增order信息出错
     */
    ERROR_APP_TRANSACTION_ADD_ORDER_ORDER(20521, "ERROR_APP_TRANSACTION_ADD_ORDER_ORDER", "新增order信息出错", 2),

    /**
     * 交易_支付方式为空
     */
    ERROR_APP_TRANSACTION_METHOD_ERROR(20522, "ERROR_APP_TRANSACTION_METHOD_ERROR", "交易_支付方式为空", 2),

    /**
     * 交易_订单号为空
     */
    ERROR_APP_TRANSACTION_TRADE_NO_NULL(20523, "ERROR_APP_TRANSACTION_TRADE_NO_NULL", "交易_订单号为空", 2),

    /**
     * 交易_订单信息为空
     */
    ERROR_APP_TRANSACTION_ORDER_NULL(20524, "ERROR_APP_TRANSACTION_ORDER_NULL", "交易_订单信息为空", 2),

    /**
     * 交易_订单状态出错
     */
    ERROR_APP_TRANSACTION_ORDER_STATUS_ERROR(20525, "ERROR_APP_TRANSACTION_ORDER_STATUS_ERROR", "交易_订单状态出错", 2),

    /**
     * 交易_每日创建订单超过10笔
     */
    ERROR_APP_TRANSACTION_ORDER_THAN_TEN(20526, "ERROR_APP_TRANSACTION_ORDER_THAN_TEN", "交易_每日创建订单超过10笔", 2),

    /**
     * 订单列表为空
     */
    ERROR_APP_ORDER_LIST_NULL(20527, "ERROR_APP_ORDER_LIST_NULL", "订单列表为空", 2),

    /**
     * 交易_该订单还没付款
     */
    ERROR_APP_TRANSACTION_ORDER_NOT_PAY(20528, "ERROR_APP_TRANSACTION_ORDER_NOT_PAY", "交易_该订单还没付款", 2),

    /**
     * 交易_该订单付款成功，等待投资
     */
    ERROR_APP_TRANSACTION_ORDER_PAY_SUCCESS_WAIT_DO_TRANSACTION(20529,
            "ERROR_APP_TRANSACTION_ORDER_PAY_SUCCESS_WAIT_DO_TRANSACTION",
            "交易_该订单付款成功，等待投资",
            2
    ),

    /**
     * 交易_订单转让折价率错误
     */
    ERROR_APP_TRANSFER_DISCOUNT_RATE_WRONG(20530,
            "ERROR_APP_TRANSFER_DISCOUNT_RATE_WRONG", "交易_订单转让折价率错误", 2
    ),

    /**
     * 交易_订单转让持有天数需大于60天
     */
    ERROR_APP_TRANSFER_HAVE_DAYS_MORE_THAN_SIXTY(20531,
            "ERROR_APP_TRANSFER_HAVE_DAYS_MORE_THAN_SIXTY", "交易_订单转让持有天数需大于60天", 2
    ),

    /**
     * 交易_订单转让项目结束时间大于15天
     */
    ERROR_APP_TRANSFER_END_TIME_MORE_THAN_FIFTEEN(20532,
            "ERROR_APP_TRANSFER_END_TIME_MORE_THAN_FIFTEEN",
            "交易_订单转让项目结束时间大于15天",
            2
    ),

    /**
     * 转让额度需小于持有价值
     */
    ERROR_APP_TRANSFER_AMOUNT_LESS(20534, "ERROR_APP_TRANSFER_AMOUNT_LESS", "转让额度需小于持有价值", 2),

    /**
     * 订单正在转让中
     */
    ERROR_APP_TRANSFER_PROCESSING(20536,
            "ERROR_APP_TRANSFER_PROCESSING", "订单正在转让中", 2
    ),

    /**
     * 活动_外部活动ID为空
     */
    ERROR_APP_PROMOTION_OUT_PROMOTION_ID_NULL(20601, "ERROR_APP_PROMOTION_OUT_PROMOTION_ID_NULL", "活动_外部活动ID为空", 2),

    /**
     * 活动_外部用户ID为空
     */
    ERROR_APP_PROMOTION_OUT_USER_ID_NULL(20602, "ERROR_APP_PROMOTION_OUT_USER_ID_NULL", "活动_外部用户ID为空", 2),

    /**
     * 活动_查询时间不能为空
     */
    ERROR_APP_PROMOTION_TIME_NOT_NULL(20603, "ERROR_APP_PROMOTION_TIME_NOT_NULL", "活动_查询时间不能为空", 2),

    /**
     * 营销活动id不能为空或为字符
     */
    ERROR_APP_ACTIVITY_ID_CANNOT_NULL(20701, "ERROR_APP_ACTIVITY_ID_CANNOT_NULL", "营销活动id不能为空或为字符！", 2),

    /**
     * 您已经参加过该活动，不能重复参加
     */
    ERROR_APP_ACTIVITY_CANNOT_BE_REPEAT(20702, "ERROR_APP_ACTIVITY_CANNOT_BE_REPEAT", "您已经参加过该活动，不能重复参加！", 2),

    /**
     * 活动不存在
     */
    ERROR_APP_ACTIVITY_NOT_EXIST(20705, "ERROR_APP_ACTIVITY_NOT_EXIST", "活动不存在！", 2),

    /**
     * 活动未开始或已结束
     */
    ERROR_APP_ACTIVITY_END_OR_NOT_START(20706, "ERROR_APP_ACTIVITY_END_OR_NOT_START", "活动未开始或已结束！", 2),

    /**
     * 对不起，您不在活动的参与范围内，无法获取奖励
     */
    ERROR_APP_ACTIVITY_USER_CANNOT_JOIN(20703, "ERROR_APP_ACTIVITY_USER_CANNOT_JOIN", "对不起，您不在活动的参与范围内，无法获取奖励！", 2),

    /**
     * limit参数必须为数字
     */
    ERROR_APP_LIMIT_CODE_SHOULD_BE_NUMBER(20704, "ERROR_APP_LIMIT_CODE_SHOULD_BE_NUMBER", "limit参数必须为数字", 2),

    /**
     * 该用户微信没有绑定账号
     */
    ERROR_APP_ACCOUNT_USER_DEFAULT_WECHATUID_NOTEXIST(20705, "ERROR_APP_ACCOUNT_USER_DEFAULT_WECHATUID_NOTEXIST",
            "该用户微信没有绑定账号！", 2
    ),

    /**
     * 该微信号和用户的默认微信号不匹配
     */
    ERROR_APP_ACCOUNT_USER_AND_WECHATUID_NOTMATCH(20706, "ERROR_APP_ACCOUNT_USER_AND_WECHATUID_NOTMATCH",
            "该微信号和用户的默认微信号不匹配！", 2
    ),

    /**
     * 登录来源不能为空
     */
    ERROR_APP_USER_LOGIN_SOURCE_CANNOT_EMPTY(20707, "ERROR_APP_USER_LOGIN_SOURCE_CANNOT_EMPTY", "登录来源不能为空！", 2),

    /**
     * 来源id不能为空
     */
    ERROR_APP_USER_SOURCE_CANNOT_EMPTY(20708, "ERROR_APP_USER_SOURCE_CANNOT_EMPTY", "来源id不能为空！", 2),

    /**
     * 登录ip不能为空
     */
    ERROR_APP_USER_LOGIN_IP_CANNOT_EMPTY(20709, "ERROR_APP_USER_LOGIN_IP_CANNOT_EMPTY", "登录ip不能为空！", 2),

    /**
     * 来源id已存在
     */
    ERROR_APP_USER_SOURCEID_EXIST(20710, "ERROR_APP_USER_SOURCEID_EXIST", "来源id已被注册！", 2),

    /**
     * 注册方式不能为空
     */
    ERROR_APP_USER_REGISTER_METHOD_CANNOT_EMPTY(20711, "ERROR_APP_USER_REGISTER_METHOD_CANNOT_EMPTY", "注册方式不能为空！", 2),

    /**
     * 来源id过长
     */
    ERROR_APP_USER_SOURCE_TOO_LONG(20712, "ERROR_APP_USER_SOURCE_TOO_LONG", "来源id过长！", 2),

    /**
     * 对不起，您不在活动的参与范围内，无法获取投证券
     */
    ERROR_APP_ACTIVITY_USER_CANNOT_JOIN_COUPON(20713, "ERROR_APP_ACTIVITY_USER_CANNOT_JOIN_COUPON",
            "对不起，您不在活动的参与范围内，无法获取投资券！", 2
    ),

    /**
     * 投资券列表为空
     */
    ERROR_APP_PROMOTION_COUPON_LIST_NULL(20801, "ERROR_APP_PROMOTION_COUPON_LIST_NULL", "投资券列表为空", 2),

    /**
     * 投资券使用超额
     */
    ERROR_APP_PROMOTION_COUPON_USED_TO_MUCH(20800, "ERROR_APP_PROMOTION_COUPON_USED_TO_MUCH", "投资券使用超额", 2),

    /**
     * 投资券不存在
     */
    ERROR_APP_PROMOTION_COUPON_IS_NOT_EXSIST(20802, "ERROR_APP_PROMOTION_COUPON_IS_NOT_EXSIST", "投资券不存在", 2),

    /**
     * 投资券无效
     */
    ERROR_APP_PROMOTION_COUPON_IS_NOT_VALID(20803, "ERROR_APP_PROMOTION_COUPON_IS_NOT_VALID", "投资券无效", 2),

    /**
     * 投资券不属于该用户或未被该用户领取
     */
    ERROR_APP_PROMOTION_COUPON_IS_NOT_RECEIVED_BY_USER(20804, "ERROR_APP_PROMOTION_COUPON_IS_NOT_RECEIVED_BY_USER",
            "投资券不属于该用户或未被该用户领取", 2
    ),

    /**
     * 用户使用投资券金额与领取投证券金额不匹配
     */
    ERROR_APP_PROMOTION_COUPON_AMOUNT_NOT_EQUAL(20805, "ERROR_APP_PROMOTION_COUPON_AMOUNT_NOT_EQUAL",
            "用户使用投资券金额与领取投证券金额不匹配", 2
    ),

    /**
     * 投资券模板列表为空
     */
    ERROR_APP_PROMOTION_COUPON_TEMPLATE_LIST_NULL(20806, "ERROR_APP_PROMOTION_COUPON_TEMPLATE_LIST_NULL", "投资券模板列表为空",
            2
    ),

    /**
     * 投资券模板打印列表为空
     */
    ERROR_APP_PROMOTION_COUPON_TEMPLATE_PRINT_LIST_NULL(20807, "ERROR_APP_PROMOTION_COUPON_TEMPLATE_PRINT_LIST_NULL",
            "投资券模板打印列表为空", 2
    ),

    /**
     * 投资券已被领完
     */
    ERROR_APP_PROMOTION_COUPON_RECEIVED_ALL(20808, "ERROR_APP_PROMOTION_COUPON_RECEIVED_ALL", "投资券已被领完", 2),

    /**
     * 投资券领取失败
     */
    ERROR_APP_PROMOTION_COUPON_RECEIVED_FAIL(20809, "ERROR_APP_PROMOTION_COUPON_RECEIVED_FAIL", "投资券领取失败", 2),

    /**
     * 年化券不存在
     */
    ERROR_VALIDATE_ANNUAL_NOT_EXISTS(20810, "ERROR_VALIDATE_ANNUAL_NOT_EXISTS", "年化券不存在", 2),

    /**
     * 年化券当前不可用
     */
    ERROR_VALIDATE_ANNUAL_STATUS_ERROR(20811, "ERROR_VALIDATE_ANNUAL_STATUS_ERROR", "年化券当前不可用", 2),

    /**
     * 年化券未被订单使用
     */
    ERROR_VALIDATE_ANNUAL_NOT_PRE_USE(20812, "ERROR_VALIDATE_ANNUAL_NOT_PRE_USE", "年化券未被订单使用", 2),

    /**
     * 年化券已过期
     */
    ERROR_VALIDATE_ANNUAL_OUT_DATE(20813, "ERROR_VALIDATE_ANNUAL_OUT_DATE", "年化券已过期", 2),

    /**
     * 年化券不属于该用户或未被该用户领取
     */
    ERROR_VALIDATE_ANNUAL_IS_NOT_RECEIVED_BY_USER(20814, "ERROR_VALIDATE_ANNUAL_IS_NOT_RECEIVED_BY_USER",
            "年化券不属于该用户或未被该用户领取", 2
    ),

    /**
     * 优惠券不存在
     */
    ERROR_APP_COUPON_NOT_EXISTS(20815, "ERROR_APP_COUPON_NOT_EXISTS", "优惠券不存在", 2),

    /**
     * 年化券ID不合法
     */
    ERROR_APP_INVALIDATE_ANNUAL_ID(20816, "ERROR_APP_INVALIDATE_ANNUAL_ID", "年化券ID不合法", 2),

    /**
     * 提现结算业务正在处理
     */
    ERROR_APP_WITHDRAW_PROCESSING(20817, "ERROR_APP_WITHDRAW_PROCESSING", "提现结算业务正在处理", 2),

    /**
     * 该卡为无效银行卡
     */
    ERROR_APP_ACCOUNT_BANK_CARD_INVALID(20818, "ERROR_APP_ACCOUNT_BANK_CARD_INVALID", "该卡为无效银行卡", 2),

    /**
     * 该卡为信用卡，不支持提现，请绑定储蓄卡
     */
    ERROR_APP_ACCOUNT_BANK_CARD_CREDIT_ID(20819, "ERROR_APP_ACCOUNT_BANK_CARD_CREDIT_ID", "该卡为信用卡，不支持提现，请绑定储蓄卡", 2),

    /**
     * 该卡与所属银行不匹配
     */
    ERROR_APP_ACCOUNT_BANK_NO_MATCH(20820, "ERROR_APP_ACCOUNT_BANK_NO_MATCH", "该卡与所属银行不匹配", 2),

    /**
     * 有过投资记录不可再投资新手标
     */
    ERROR_APP_NOVICE_PROJECT_NO_MATCH(20821, "ERROR_APP_NOVICE_PROJECT_NO_MATCH", "有过投资记录不可再投资新手标", 2),

    /**
     * 联动优势解约失败
     */
    ERROR_APP_BANK_CANCLE_FAILURE(20822, "ERROR_APP_BANK_CANCLE_FAILURE", "联动优势解约失败", 2),

    /**
     * 联动优势解约成功
     */
    ERROR_APP_BANK_CANCLE_SUCCESS(20823, "ERROR_APP_BANK_CANCLE_SUCCESS", "联动优势解约成功", 2),

    /**
     * 联动优势签约成功
     */
    ERROR_APP_BANK_REG_SUCCESS(20824, "ERROR_APP_BANK_REG_SUCCESS", "联动优势签约成功", 2),

    /**
     * 联动优势签约失败
     */
    ERROR_APP_BANK_REG_FAILURE(20825, "ERROR_APP_BANK_REG_FAILURE", "银行卡绑定失败,请联系客服", 2),

    /**
     * 银行卡余额为空
     */
    ERROR_APP_BANK_BALANCE_NULL(20826, "ERROR_APP_BANK_BALANCE_NULL", "银行卡余额不足", 2),

    /**
     * 银行卡信息与用户信息不符
     */
    ERROR_APP_BANK_AND_USER_NO_MATCH(20827, "ERROR_APP_BANK_AND_USER_NO_MATCH", "银行卡信息与用户信息不符", 2),

    /**
     * 银行卡提现金额和充值金额不匹配
     */
    ERROR_APP_BANK_RECHARGE_WITHDRAW_DIFFER(20840, "ERROR_APP_BANK_AND_USER_NO_MATCH", "银行卡提现金额和充值金额不匹配", 2),

    /**
     * 用户投资使用的奖励账户余额过多
     */
    ERROR_APP_USED_REWARD_TOO_MUCH(20152, "ERROR_APP_USED_REWARD_TOO_MUCH", "用户投资使用的奖励账户余额过多", 2),

    /**
     * 您的交易笔数超过当日累计交易笔数限制，无法完成交易
     */
    ERROR_APP_TRANSACTION_TIMES_EXCEED(20828, "ERROR_APP_TRANSACTION_TIMES_EXCEED", "您的交易笔数超过当日累计交易笔数限制，无法完成交易", 2),

    /**
     * 四季宝计划不存在
     */
    ERROR_APP_SEASON_PROJECT_NOT_EXSIT(20830, "ERROR_APP_SEASON_PROJECT_NOT_EXSIT", "四季宝计划不存在", 2),

    /**
     * 四季宝项目不可投资新手标或福利标
     */
    ERROR_APP_NOVICE_OR_WELFARE_PROJECT_NO_MATCH(
            20829,
            "ERROR_APP_NOVICE_OR_WELFARE_PROJECT_NO_MATCH",
            "四季宝项目不可投资新手标或福利标",
            2
    ),

    /**
     * 联动优势解约失败
     */
    UMP_PAY_USER_CANCEL_ERROR(20532, "UMP_PAY_USER_CANCEL_ERROR", "联动优势解约银行卡失败", 2),

    ERROR_APP_SEASON_PROJECT_ID_NULL(20831, "ERROR_APP_SEASON_PROJECT_ID_NULL", "四季宝id为空", 2),

    ERROR_APP_RANKING_LIST_SEARCH(20860, "ERROR_APP_RANKING_LIST", "排行榜查询出错", 2),

    UMP_PAY_REQ_SMS_BACK_ERROR(20531, "UMP_PAY_REQ_SMS_BACK_ERROR", "联动优势催缴下的单失败", 2),

    /**
     * 保存转让订单失败
     */
    ERROR_APP_SAVE_TRANSFER_ORDER(20861, "ERROR_APP_SAVE_TRANSFER_ORDER", "保存转让订单失败", 2),

    /**
     * 购买的转让记录不存在
     */
    ERROR_APP_SAVE_TRANSFER_PROJECT_NOT_EXISTS(20862, "ERROR_APP_SAVE_TRANSFER_PROJECT_NOT_EXISTS", "购买的转让记录不存在", 2),

    /**
     * 订单的金额不匹配
     */
    ERROR_APP_ORDER_MONEY_NOT_MATCHED(20862, "ERROR_APP_ORDER_MONEY_NOT_MATCHED", "订单的金额不匹配", 2),

    /**
     * 转让项目的投资记录不存在
     */
    ERROR_APP_TRANSFER_PROJECT_TRANSACTION_IS_NULL(
            20863,
            "ERROR_APP_TRANSFER_PROJECT_TRANSACTION_IS_NULL",
            "转让项目的投资记录不存在",
            2
    ),

    /**
     * 订单金额不足
     */
    ERROR_APP_ORDER_MONEY_NOT_ENOUGH(20864, "ERROR_APP_ORDER_MONEY_NOT_ENOUGH", "订单金额不足", 2),

    /**
     * 个人账户宝项目不可使用奖励账户余额
     */
    ERROR_APP_DEMAND_PROJECT_CANNOT_USE_REWARD_BALANCE(
            20865,
            "ERROR_APP_DEMAND_PROJECT_CANNOT_USE_REWARD_BALANCE",
            "个人账户宝项目不可使用奖励账户余额",
            2
    ),

    /**
     * 个人账户宝项目不可使用现金券
     */
    ERROR_APP_DEMAND_PROJECT_CANNOT_USE_COUPON_BALANCE(
            20866,
            "ERROR_APP_DEMAND_PROJECT_CANNOT_USE_COUPON_BALANCE",
            "个人账户宝项目不可使用现金券",
            2
    ),

    /**
     * 赎回项目不能为0
     */
    ERROR_APP_DEMAND_REDEEM_NOT_ZERO(20900, "ERROR_APP_DEMAND_REDEEM_NOT_ZERO", "赎回项目不能为0", 2),

    /**
     * 剩余待赎回金额不足
     */
    ERROR_APP_DEMAND_REDEEM_NOT_ENOUGH(20901, "ERROR_APP_DEMAND_REDEEM_NOT_ENOUGH", "剩余待赎回金额不足", 2),

    ERROR_APP_UMP_BIND_NOT_MATCH(20533, "ERROR_APP_UMP_BIND_NOT_MATCH", "身份信息存在风险,请联系客服解决", 2),

    //@start demand
    /**
     * 赎回个人账户宝余额失败
     */
    ERROR_APP_REDEEM_DEMAND(20902, "ERROR_APP_REDEEM_DEMAND", "赎回个人账户宝余额失败", 2),
    /**
     * 每天赎回次数过多
     */
    ERROR_APP_REDEEM_TIMES_TOO_MUCH(20903, "ERROR_APP_REDEEM_TIMES_TOO_MUCH", "每天赎回次数过多", 2),

    /**
     * 个人账户宝余额不足
     */
    ERROR_APP_DEMAND_BALANCE_NOT_ENOUGH(20904, "ERROR_APP_DEMAND_BALANCE_NOT_ENOUGH", "个人账户宝余额不足", 2),

    /**
     * 转入金额超出限制
     */
    ERROR_APP_DEMAND_INCOME_AMOUNT_TOO_MUCH(20905, "ERROR_APP_DEMAND_INCOME_AMOUNT_TOO_MUCH", "转入金额超出限制", 2)
    //@end
    ,

    ERROR_WEB_LOGIN_MUST_USE_MOBILE(20906, "ERROR_WEB_LOGIN_MUST_USE_MOBILE", "为了您的安全，请使用绑定的手机号登录", 2),

    //@start club
    /**
     * 积分值不够
     */
    ERROR_APP_SCORE_TOO_LESS(21000, "ERROR_APP_SCORE_TOO_LESS", "积分值不够", 2),

    /**
     * 该物品已售完
     */
    ERROR_APP_SCORE_GOODS_SALE_OUT(21001, "ERROR_APP_SCORE_GOODS_SALE_OUT", "该物品已售完", 2),

    /**
     * 用户尚未绑定邮箱
     */
    ERROR_APP_NOT_BIND_EMAIL(21002, "ERROR_APP_NOT_BIND_EMAIL", "用户尚未绑定邮箱", 2),

    /**
     * 用户尚未首次投资
     */
    ERROR_APP_NOT_FIRST_INVEST(21003, "ERROR_APP_NOT_FIRST_INVEST", "用户尚未首次投资", 2),

    /**
     * 用户尚未首次充值
     */
    ERROR_APP_NOT_FIRST_RECHARGE(21004, "ERROR_APP_NOT_FIRST_RECHARGE", "用户尚未首次充值", 2),

    /**
     * 已经领取过绑定邮箱任务积分
     */
    ERROR_APP_RECEIVED_EMAIL_SCORE(21005, "ERROR_APP_RECEIVED_EMAIL_SCORE", "已经领取过绑定邮箱任务积分", 2),

    /**
     * 已经领取过首次投资任务积分
     */
    ERROR_APP_RECEIVED_INVEST_SCORE(21006, "ERROR_APP_RECEIVED_INVEST_SCORE", "已经领取过首次投资任务积分", 2),

    /**
     * 已经领取过首次充值任务积分
     */
    ERROR_APP_RECEIVED_RECHARGE_SCORE(21007, "ERROR_APP_RECEIVED_RECHARGE_SCORE", "已经领取过首次充值任务积分", 2),

    /**
     * 完成积分任务失败
     */
    ERROR_APP_DO_SCORE_TASK(21008, "ERROR_APP_DO_SCORE_TASK", "完成积分任务失败", 2),

    /**
     * 用户当前已经签到
     */
    ERROR_APP_USER_HAS_SIGNED(21009, "ERROR_APP_USER_HAS_SIGNED", "用户今天已经签到", 2),

    /**
     * 发放签到积分失败
     */
    ERROR_APP_SEND_SIGN_SCORE(21010, "ERROR_APP_SEND_SIGN_SCORE", "发放签到积分失败", 2),

    /**
     * 兑换积分失败
     */
    ERROR_APP_EXCHANGE_SCORE(21011, "ERROR_APP_EXCHANGE_SCORE", "兑换积分失败", 2),

    /**
     * 输入验证码错误
     */
    ERROR_AUTH_CODE(21012, "ERROR_AUTH_CODE", "输入验证码错误", 2),
    /**
     * 请登录
     */
    ERROR_LOGIN_AUTH(21013, "ERROR_AUTH_CODE", "请登录", 2),
    /**
     * token失效，请重新登录！
     */
    ERROR_CHECK_TOKEN(21014, "ERROR_CHECK_TOKEN", "token失效，请重新登录！", 2),

    ERROR_TIME_OUT(22014, "ERROR_TIME_OUT", "连接超时,请校对您的系统时间!", 2),
    /**
     * 签名错误
     */
    ERROR_SIGN(22015, "ERROR_SIGN", "签名错误!", 2),
    /**
     * 您已是最新版本，不需要更新！
     */
    ERROR_NOT_UPDATE(21015, "ERROR_NOT_UPDATE", "您已是最新版本，不需要更新！", 2),
    /**
     * 您还未绑定任何银行卡！
     */
    ERROR_NOT_BIND_CARD(21016, "ERROR_NOT_BIND_CARD", "您还未绑定任何银行卡！", 2),
    /**
     * 身份证号码格式不正确！
     */
    ERROR_ID_CARD_NO(21017, "ERROR_ID_CARD_NO", "身份证号码格式不正确！", 2),
    /**
     * 投资金额必须为数字！
     */
    ERROR_INVEST_COUNT(21018, "ERROR_INVEST_COUNT", "投资金额必须为数字！", 2),
    /**
     * 投资金额必须为最小投资金额的整数倍！
     */
    ERROR_INVEST_OF_MIN(21019, "ERROR_INVEST_OF_MIN", "投资金额必须为最小投资金额的整数倍！", 2),
    /**
     * 投资金额不能大于最大投资金额！
     */
    ERROR_INVEST_OF_MAX(21020, "ERROR_INVEST_OF_MAX", "投资金额不能大于最大投资金额！", 2),
    /**
     * 投资金额不能小于最小投资金额！
     */
    ERROR_INVEST_GT_MIN(21021, "ERROR_INVEST_GT_MIN", "投资金额不能小于最小投资金额！", 2),
    /**
     * 该手机账号已注册,请返回我页面登录后进行投资!
     */
    ERROR_MOBILE_ALREADY_REGISTER(21999, "ERROR_BANK_CARD_NO", "该手机账号已注册,请先登录后进行投资!", 2),
    /**
     * 银行卡号格式不正确！
     */
    ERROR_BANK_CARD_NO(21022, "ERROR_BANK_CARD_NO", "银行卡号格式不正确！", 2),
    /**
     * 购买成功后系统会自动将您的手机号作为账号！
     */
    ERROR_NEW_USER(21023, "ERROR_NEW_USER", "购买成功后系统会自动将您的手机号作为账号！", 2),
    /**
     * 待收利息为0,分享失败！
     */
    ERROR_SHOW_PREADE(21024, "ERROR_SHOW_PREADE", "待收利息为0,分享失败！", 2),
    /**
     * 您已经购买过，不能再投资新人特惠标！
     */
    ERROR_NEW_USER_PROJECT(21025, "ERROR_NEW_USER_PROJECT", "您已经购买过，不能再投资新人特惠标！", 2),
    /**
     * 您已经超过购买次数限制！
     */
    ERROR_OVER_LIMIT_TIMES(21026, "ERROR_OVER_LIMIT_TIMES", "您已经超过购买次数限制！", 2),
    /**
     * 请使用本人名下银行卡购买！
     */
    ERROR_NOT_SELF_BANK_CARD(21027, "ERROR_NOT_SELF_BANK_CARD", "请使用本人名下银行卡购买！", 2),
    /**
     * 提现额度超过可提额度！
     */
    ERROR_WITHDRAWARL_MORE_ABLE(21028, "ERROR_NOT_SELF_BANK_CARD", "提现额度超过可提额度！", 2),
    /**
     * 超出可提现次数！
     */
    ERROR_WITHDRAWARL_MORE_ABLE_COUNT(21029, "ERROR_WITHDRAWARL_MORE_ABLE_COUNT", "超出可提现次数！", 2),
    /**
     * 提现金额不能小于0.01元！
     */
    ERROR_WITHDRAWARL_TOO_SMALL(21030, "ERROR_WITHDRAWARL_TOO_SMALL", "提现金额不能小于0.01元！", 2),
    /**
     * 您已经超过爆款购买次数限制！
     */
    ERROR_OVER_BK_LIMIT_TIMES(21031, "ERROR_OVER_BK_LIMIT_TIMES", "您已经超过爆款购买次数限制！", 2),
    /**
     * 首次不能投资爆款标！
     */
    ERROR_OVER_NEW_USER_BK_LIMIT_TIMES(21032, "ERROR_OVER_NEW_USER_BK_LIMIT_TIMES", "首次不能投资爆款标", 2),
    /**
     * 个人账户可投资额度不足！
     */
    ERROR_OVER_QB_OVER(21033, "ERROR_OVER_NEW_USER_BK_LIMIT_TIMES", "个人账户可投资额度不足！", 2),
    /**
     * 姓名和银行卡信息不符！
     */
    ERROR_BANK_NAME(21034, "ERROR_BANK_NAME", "姓名和银行卡信息不符！", 2),
    /**
     * 身份证和银行卡信息不符！
     */
    ERROR_BANK_ID_NO(21035, "ERROR_BANK_ID_NO", "身份证和银行卡信息不符！", 2),
    /**
     * 手机号和银行卡信息不符！
     */
    ERROR_BANK_MOBILE(21036, "ERROR_BANK_MOBILE", "手机号和银行卡信息不符！", 2),
    /**
     * 银行卡和身份证信息不符！
     */
    ERROR_ID_BANKNO(21037, "ERROR_ID_BANKNO", "银行卡和身份证信息不符！", 2),
    /**
     * 姓名和身份证信息不符！
     */
    ERROR_ID_NAME(21038, "ERROR_ID_NAME", "姓名和身份证信息不符！", 2),
    /**
     * 手机号和身份证信息不符！
     */
    ERROR_ID_MOBILE(21039, "ERROR_ID_MOBILE", "手机号和身份证信息不符！", 2),

    ERROR_ID_MOBILE2(22039, "ERROR_ID_MOBILE", "该身份信息已投资，请您登录！", 2),
    ERROR_BANK_CARD_ALREADY_USE(22040, "ERROR_BANK_CARD_ALREADY_USE", "该身份信息已被使用！", 2),
    /**
     * 输入金额过大！
     */
    ERROR_AMOUNT_BIGGER(21040, "ERROR_AMOUNT_BIGGER", "输入金额过大！", 2),
    /**
     * 此标还未开始销售！
     */
    ERROR_PROJECT_NOT_START(21041, "ERROR_PROJECT_NOT_START", "此标还未开始销售！", 2),
    /**
     * 银行卡和姓名信息不符！
     */
    ERROR_NAME_BANKNO(21042, "ERROR_NAME_BANKNO", "银行卡和姓名信息不符！", 2),
    /**
     * 身份证和姓名信息不符！
     */
    ERROR_NAME_ID(21043, "ERROR_NAME_ID", "身份证和姓名信息不符！", 2),

    ERROR_EXIT_ID(22043, "ERROR_EXIT_ID", "身份证已经绑定，不能重复绑定！", 2),
    /**
     * 手机号和姓名信息不符！
     */
    ERROR_NAME_MOBILE(21044, "ERROR_ID_MOBILE", "手机号和姓名信息不符！", 2),
    /**
     * 个人账户投资的不能设置返回银行卡！
     */
    ERROR_NOT_RETURN_BANK(21045, "ERROR_NOT_RETURN_BANK", "个人账户投资的不能设置返回银行卡！", 2),
    /**
     * 资金已到期，无法切换还款方式！
     */
    ERROR_BEFORE_REPAYMENT(21045, "ERROR_BEFORE_REPAYMENT", "资金已到期，无法切换还款方式！", 2),
    /**
     * 该号码已注销，请联系客服!
     */
    ERROR_USER_UNLOGIN(21046, "ERROR_USER_UNLOGIN", "该号码已注销，请联系客服!", 2),
    /**
     * 请升级到最新版本！
     */
    ERROR_UPGRADE_VERSION(21047, "ERROR_UPGRADE_VERSION", "请升级到最新版本！", 2),
    /**
     * 该号码已注销，请联系客服!
     */
    ERROR_USER_INVEST_EXISTS(21048, "ERROR_USER_INVEST_EXISTS", "该号码已经注册，不满足邀请资格!", 2),
    /**
     * 服务器繁忙，请稍后再试！
     */
    ERROR_SERVER_BUSY(21027, "ERROR_SERVER_BUSY", "服务器繁忙，请稍后再试！", 1),
    /**
     * 您的获取短信次数过多，请一分钟后重试！
     */
    ERROR_SMS_GAIN_ONE_MINUTE(21048, "ERROR_SMS_GAIN_ONE_MINUTE", "您的获取短信次数过多，请一分钟后重试！", 1),
    /**
     * 您的获取次数过多，请稍后重试！
     */
    ERROR_SMS_GAIN_EXCESSIVE(21049, "ERROR_SMS_GAIN_EXCESSIVE", "您的获取短信次数过多，请稍后重试！", 1),
    /**
     * 投资金额不符券的使用条件！
     */
    ERROR_COUPON_AMMOUNT_CAN_INVEST(21050, "ERROR_COUPON_AMMOUNT_CAN_INVEST", "投资金额不符券的使用条件！", 1),

    ERROR_DOING_WITHDRAW(21051, "ERROR_DOING_WITHDRAW", "正在申请提现操作,请稍后再试！", 2),

    ERROR_INVITE_USER_NOT_EXISTS(21052, "ERROR_INVITE_USER_NOT_EXISTS", "邀请人不存在，请重新尝试！", 2),

    ERROR_LOTTERY_POINT_LACK(21053, "ERROR_LOTTERY_POINT_LACK", "您的抽奖积分不足！", 2),
    /**
     * 邀请好友请求过于频繁
     */
    ERROR_INVITE_SMS_GAIN_ONE_MINUTE(21054, "ERROR_INVITE_SMS_GAIN_ONE_MINUTE", "您邀请好友过于频繁，请一分钟后重试！", 1),

    /**
     * 提现金额不能小于100元！
     */
    ERROR_DRAWARL_TOO_SMALL(21055, "ERROR_DRAWARL_TOO_SMALL", "提现金额不能小于100元！", 2),
    /**
     * 提现金额不能小于100元！
     */
    ERROR_DEVICE_BLACK(21056, "ERROR_DEVICE_BLACK", "检测到您的终端异常，请联系客服！", 1),

    /**
     * 单次充值金额不能小于100元
     */
    ERROR_RECHARGE_MIN(21057, "ERROR_RECHARGE_MIN", "单次充值金额不能低于100元", 2),

    /**
     * 操作失败请稍后再试
     */
    ERROR_OPERATE_FAILED(21058, "ERROR_OPERATE_FAILED", "操作失败，请稍后再试", 2),

    ERROR_BANK_CARD_NO_MAX(21059, "ERROR_BANK_CARD_NO_MAX", "已绑银行卡超过最大限额，不可添加新银行卡，若有问题请联系客服！", 2),

    ERROR_PROJECT_ID(21060, "ERROR_PROJECT_ID", "投资标参数错误！", 2),
    ERROR_PROJECT_END_TIME(21061, "ERROR_PROJECT_END_TIME", "所选投资标时间参数错误！", 2),
    ERROR_PROJECT_OUT_TIME(21062, "ERROR_PROJECT_OUT_TIME", "所选投资标已过期！", 2),

    /**
     * 活动项目购买的次数 不足
     */
    ERROR_APP_PROJECT_ACTBUYNUM_ERROR(21063, "ERROR_APP_PROJECT_ACTBUYNUM_ERROR", "您当前暂无该款标的购买次数!", 2),

    /**
     * 不支持的银行卡
     */
    ERROR_BANK_CARD_NO_SUPPORT_ERROR(21064, "ERROR_BANK_CARD_NO_SUPPORT_ERROR", "不支持的的银行卡！", 2),

    /**
     * 姓名格式错误！
     */
    ERROR_REALNAME_FORMAT_ERROR(21065, "ERROR_REALNAME_FORMAT_ERROR", "姓名格式错误！", 2),

    /**
     * 错误次数超限
     */
    ERROR_OVER_ERROR_TIMES_ERROR(21066, "ERROR_OVER_ERROR_TIMES_ERROR", "错误次数超限!", 2),

    /**
     * 认证失败-持卡人身份信息、卡信息或手机信息错误 | 认证失败
     */
    ERROR_CARD_ID_MOBILE_AUTH_ERROR(21067, "ERROR_CARD_ID_MOBILE_AUTH_ERROR", "认证失败-持卡人身份信息、卡信息或手机信息错误 | 认证失败!", 2),

    /**
     * 为保证资金安全，五分钟之内您不能提现两次
     */
    ERROR_WITHDRAW_TIME_LESS_FIVE_MINUTE_ERROR(21068, "ERROR_WITHDRAW_TIME_LESS_FIVE_MINUTE_ERROR", "为保证资金安全，五分钟之内您不能提现两次！", 2),

    /**
     * 理论余额与实际余额相差额度<0
     */
    ERROR_THEORY_ACTUAL_AMOUNT_DIF_ERROR(21069, "ERROR_THEORY_ACTUAL_AMOUNT_DIF_ERROR", "理论余额与实际余额有相差额度！", 2),
    /**
     * 订单号为空
     */
    ERROR_RECHARGE_NO(21069, "ERROR_RECHARGE_NO", "订单号为空！", 2),

    //@end
    ;

    private String msg;

    private int code;

    private String codeStr;

    /**
     * 错误类型（0:一般结果码；1：系统级的错误；2：应用级的错误）
     */
    private int type;

    public int getIntCode() {
        return this.code;
    }

    public String getCode() {
        return String.valueOf(this.code);
    }

    public String getMsg() {
        return this.msg;
    }

    public String getCodeStr() {
        return this.codeStr;
    }

    public int getType() {
        return this.type;
    }

    private ResultCode(int code, String codeStr, String msg, int type) {
        this.msg = msg;
        this.code = code;
        this.codeStr = codeStr;
        this.type = type;
    }

}

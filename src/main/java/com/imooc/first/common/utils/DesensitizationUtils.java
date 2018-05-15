package com.imooc.first.common.utils;

public class DesensitizationUtils {

    public static String getMobile(String mobile) {
        if (!StringUtils.isEmpty(mobile) && (mobile.length() == 11)) {
            return mobile.substring(0, 3) + "****" + mobile.substring(7);
        } else {
            return mobile;
        }
    }

    public static String getRealName(String realName) {
        if (!StringUtils.isEmpty(realName) && (realName.length() == 2)) {
            return realName.substring(0, 1) + "*";
        } else if (!StringUtils.isEmpty(realName) && (realName.length() > 3)) {
            return realName.substring(0, 1) + "*" + realName.substring(2);
        } else {
            return realName;
        }
    }

    public static String getCardNo(String cardNo) {
        if (!StringUtils.isEmpty(cardNo) && (cardNo.length() == 15)) {
            return cardNo.substring(0, 3) + "*********" + cardNo.substring(11);
        } else if (!StringUtils.isEmpty(cardNo) && (cardNo.length() == 18)) {
            return cardNo.substring(0, 3) + "************" + cardNo.substring(14);
        } else {
            return cardNo;
        }
    }

    public static String getBankCardNo(String bankCardNo) {
        if (!StringUtils.isEmpty(bankCardNo)) {
            return "尾号" + bankCardNo.substring(bankCardNo.length() - 4, bankCardNo.length());
        } else {
            return bankCardNo;
        }
    }
}

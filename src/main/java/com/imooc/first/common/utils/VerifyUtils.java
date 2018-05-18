package com.imooc.first.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @Description: 校验工具类
 * @author
 * @date 2017年7月20日 下午3:40:16
 */
public class VerifyUtils {
    /**
     * 校验手机号
     *
     * @param mobile
     * @return
     */
    public static boolean verifyMobile(String mobile) {
        if (StringUtils.isEmpty(mobile)) {
            return false;
        }
        String regExp = "^[1][3,4,5,6,7,8,9][0-9]{9}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(mobile);
        return m.find();
    }

    /**
     * 校验身份证号
     *
     * @param str
     * @return
     */
    public static boolean isIDcard(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        // String regex = "(\\d{14}[0-9xX])|(\\d{17}[0-9xX])";
        return IdcardUtils.validateCard(str);
        // return match(regex, str);
    }

    /**
     * Number校验
     *
     * @param str
     * @return
     */
    public static boolean isNumber(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        Pattern pattern = Pattern.compile("^[1-9]\\d*$");
        Matcher match = pattern.matcher(str);
        if (match.matches() == false) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 正整数
     *
     * @param d
     * @return
     */
    public static boolean isZZS(Double d) {
        double y = d % 1;
        if (y == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 正则验证
     *
     * @param regex
     * @param str
     * @return
     */
    private static boolean match(String regex, String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static void main(String[] args) {
        // System.out.println(VerifyUtil.isIDcard("51010719841214266X"));
        //// System.out.println(VerifyUtil.isNumber("86.01"));
        //// System.out.println(VerifyUtil.verifyMobile("08613868031625"));

    }

    public static boolean isInteger(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            Integer.valueOf(str);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    public static boolean isLong(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            Long.valueOf(str);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    public static boolean isDouble(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            Double.valueOf(str);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
}

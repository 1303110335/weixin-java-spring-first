package com.imooc.first.common.utils;

import java.text.DecimalFormat;

/**
 * Created by chenghao on 8/11/16.
 */
public class StringUtils {
    public static boolean isEmpty(String str) {
        return org.springframework.util.StringUtils.isEmpty(str);
    }

    public static String nullToEmpty(String str) {
        if (str == null)
            return "";
        return str;
    }

    public static String getDoubleFormatString2(Double value) {
        return new DecimalFormat("#0.00").format(value);
    }

    public static String getDoubleFormatString4(Double value) {
        return new DecimalFormat("#0.0000").format(value);
    }
}

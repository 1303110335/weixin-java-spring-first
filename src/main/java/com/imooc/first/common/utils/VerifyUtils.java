package com.imooc.first.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyUtils {

    public static boolean verifyMobile(String mobile)
    {
        if (StringUtils.isEmpty(mobile)) {
            return false;
        }

        String regExp = "^[1][3,4,5,6,7,8,9][0-9]{9}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(mobile);
        return m.find();
    }
}

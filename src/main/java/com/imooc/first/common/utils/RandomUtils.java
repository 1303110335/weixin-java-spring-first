package com.imooc.first.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomUtils {
    /**
     * 获取c位随机数
     * @param c
     * @return
     */
    public static String getRandom(int c)
    {
        Random r = new Random();
        SimpleDateFormat format = new SimpleDateFormat("ssSSS");
        Date d = new Date();
        StringBuffer sb = new StringBuffer();
        sb.append(format.format(d));
        sb.append(r.nextInt(10));
        return sb.toString();
    }

    public static String getRandomString(int length) { // length表示生成字符串的长度
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    public static String getRandomWithLength(int length) {
        Random random = new Random();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < length; i++) {
            boolean isChar = (random.nextInt(2) % 2 == 0);
            if (isChar) {
                int choice = (random.nextInt(2) % 2 == 0) ? 65 : 97;
                ret.append((char) (choice + random.nextInt(26)));
            } else {
                ret.append(Integer.toString(random.nextInt(10)));
            }
        }
        return ret.toString();
    }

    public static String getSMSCODE() {
        int x = (int) (Math.random() * 9000 + 1000);
        return String.valueOf(x);
    }

    public static void main(String args[]) {
        System.out.println(genSerialCode(2));
        // System.out.println(RandomUtil.genMobile());
    }

    public static String genMobile() {
        StringBuffer sb = new StringBuffer();
        Random r = new Random();
        SimpleDateFormat format = new SimpleDateFormat("DDssSSS");
        Date d = new Date();
        sb.append("1");
        sb.append("3");
        sb.append(r.nextInt(10));
        sb.append(format.format(d));
        return sb.toString();
    }

    /**
     * 邀请码生成器，算法原理：<br/>
     * 1) 获取id: 1127738 <br/>
     * 2) 使用自定义进制转为：gpm6 <br/>
     * 3) 转为字符串，并在后面加'o'字符：gpm6o <br/>
     * 4）在后面随机产生若干个随机数字字符：gpm6o7 <br/>
     * 转为自定义进制后就不会出现o这个字符，然后在后面加个'o'，这样就能确定唯一性。最后在后面产生一些随机字符进行补全。<br/>
     *
     */

    /**
     * 自定义进制(0,1没有加入,容易与o,l混淆)
     */
    private static final char[] r = new char[]{'q', 'w', 'e', '8', 'a', 's', '2', 'd', 'z', 'x', '9', 'c', '7', 'p',
            '5', 'i', 'k', '3', 'm', 'j', 'u', 'f', 'r', '4', 'v', 'y', 'l', 't', 'n', '6', 'b', 'g', 'h'};

    /**
     * (不能与自定义进制有重复)
     */
    private static final char b = 'o';

    /**
     * 进制长度
     */
    private static final int binLen = r.length;

    /**
     * 序列最小长度
     */
    private static final int s = 8;

    /**
     * 根据ID生成六位随机码
     *
     * @param id ID
     * @return 随机码
     */
    public static String genSerialCode(long id) {
        char[] buf = new char[32];
        int charPos = 32;

        while ((id / binLen) > 0) {
            int ind = (int) (id % binLen);
            buf[--charPos] = r[ind];
            id /= binLen;
        }
        buf[--charPos] = r[(int) (id % binLen)];
        String str = new String(buf, charPos, (32 - charPos));
        // 不够长度的自动随机补全
        if (str.length() < s) {
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            Random rnd = new Random();
            for (int i = 1; i < s - str.length(); i++) {
                sb.append(r[rnd.nextInt(binLen)]);
            }
            str += sb.toString();
        }
        return str;
    }
}



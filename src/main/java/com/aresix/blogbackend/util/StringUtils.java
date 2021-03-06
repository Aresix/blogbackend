package com.aresix.blogbackend.util;

import java.util.Random;

// 生成指定长度随机字符串
public class StringUtils {
    public static String getRandomString(int length) throws Exception {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString() + CurTimeToStr.getCurrentTime();
    }
}

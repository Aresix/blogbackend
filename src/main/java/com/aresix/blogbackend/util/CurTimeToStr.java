package com.aresix.blogbackend.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurTimeToStr {
    public static String getCurrentTime() throws Exception {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        return format.format(date);
    }
}

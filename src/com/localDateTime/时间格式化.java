package com.localDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author wangxiaoqiang
 * @date 2020/4/17 10:49
 * @description
 */

public class 时间格式化 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        String format = now.format(DateTimeFormatter.BASIC_ISO_DATE);
        String format1 = now.format(DateTimeFormatter.ISO_DATE);
        String format2 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        String format4 = now.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String format5 = now.format(DateTimeFormatter.ISO_LOCAL_TIME);
        String format6 = now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        String format7 = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.out.println(format);
        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format4);
        System.out.println(format5);
        System.out.println(format6);
        System.out.println(format7);
    }
}

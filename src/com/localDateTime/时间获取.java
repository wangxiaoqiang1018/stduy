package com.localDateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author wangxiaoqiang
 * @date 2020/4/17 10:03
 * @description
 */

public class 时间获取 {
    public static void main(String[] args) {
        //2020-4-17 10:14:00
        LocalDateTime now = LocalDateTime.now();

        //2020      年
        System.out.println(now.getYear());
        //4         月
        System.out.println(now.getMonthValue());
        //17        日
        System.out.println(now.getDayOfMonth());
        //10        时
        System.out.println(now.getHour());
        //17        分
        System.out.println(now.getMinute());
        //00        秒
        System.out.println(now.getSecond());

        //FRIDAY
        System.out.println(now.getDayOfWeek());
        //108
        System.out.println(now.getDayOfYear());
        //APRIL
        System.out.println(now.getMonth());

        ZonedDateTime zonedDateTime = LocalDateTime.now().atZone(ZoneId.systemDefault());
        //时区
        System.out.println(zonedDateTime.getZone());
    }
}

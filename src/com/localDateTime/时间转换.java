package com.localDateTime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author wangxiaoqiang
 * @date 2020/4/17 10:27
 * @description
 */

public class 时间转换 {
    public static void main(String[] args) {
        //字符串时间转换
        LocalDateTime dateTime = LocalDateTime.parse("2020-04-17T10:28:26");
        System.out.println(dateTime);

        //字符串时间转换 指定格式
        LocalDateTime dateTime1 = LocalDateTime.parse("2020-04-17 10:28:26", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(dateTime1);

        //Date --> LocalDateTime
        Date date = new Date();
        LocalDateTime dateTime2 = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println(dateTime2);

        //LocalDateTime --> Date
        LocalDateTime now = LocalDateTime.now();
        Date from = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(from);

        //转换为时间戳
        long epochMilli = now.toInstant(ZoneOffset.of("+8")).toEpochMilli();
        System.out.println(epochMilli);

        // 时间戳转换成时间
        LocalDateTime epochMilliTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(epochMilli), ZoneId.systemDefault());
        System.out.println(epochMilliTime);
    }
}

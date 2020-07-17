package com.localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author wangxiaoqiang
 * @date 2020/4/17 10:20
 * @description
 */

public class 时间创建 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2020, 4, 17, 10, 24, 20);
        LocalDate date = LocalDate.of(2020, 4, 17);
        LocalTime time = LocalTime.of(10, 24, 20);
        System.out.println(dateTime);
        System.out.println(date);
        System.out.println(time);
    }
}

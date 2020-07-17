package com.localDateTime;

import java.time.LocalDateTime;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

/**
 * @author wangxiaoqiang
 * @date 2020/4/17 11:21
 * @description
 */

public class 时间扩展方法 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("当前时间：" + now);
        // 第一天
        LocalDateTime firstDay = now.withDayOfMonth(1);
        System.out.println("本月第一天：" + firstDay);
        // 当天最后一秒
        LocalDateTime lastSecondOfDay = now.withHour(23).withMinute(59).withSecond(59);
        System.out.println("当天最后一秒：" + lastSecondOfDay);
        // 最后一天
        LocalDateTime lastDay = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("本月最后一天:" + lastDay);
        // 是否闰年
        System.out.println("今年是否闰年：" + Year.isLeap(now.getYear()));
    }
}

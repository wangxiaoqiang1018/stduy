package com.localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author wangxiaoqiang
 * @date 2020/4/17 10:57
 * @description
 */

public class 时间比较 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime yestory = now.minusDays(1);
        System.out.println(now + "在" + yestory + "之后吗?" + now.isAfter(yestory));
        System.out.println(now + "在" + yestory + "之前吗?" + now.isBefore(yestory));

        // 时间差
        long day = yestory.until(now, ChronoUnit.DAYS);
        long month = yestory.until(now, ChronoUnit.MONTHS);
        long hours = yestory.until(now, ChronoUnit.HOURS);
        long minutes = yestory.until(now, ChronoUnit.MINUTES);
        System.out.println("相差月份" + month);
        System.out.println("相差天数" + day);
        System.out.println("相差小时" + hours);
        System.out.println("相差分钟" + minutes);

        // 距离JDK 14 发布还有多少天？
        LocalDate jdk14 = LocalDate.of(2020, 3, 17);
        LocalDate nowDate = LocalDate.now();
        System.out.println("距离JDK 14 发布还有：" + nowDate.until(jdk14, ChronoUnit.DAYS) + "天");
    }
}

package com.localDateTime;

import java.time.LocalDateTime;

/**
 * @author wangxiaoqiang
 * @date 2020/4/17 11:20
 * @description
 */

public class 时间加减 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("当前时间："+now);
        LocalDateTime plusTime = now.plusMonths(1).plusDays(1).plusHours(1).plusMinutes(1).plusSeconds(1);
        System.out.println("增加1月1天1小时1分钟1秒时间后：" + plusTime);
        LocalDateTime minusTime = now.minusMonths(2);
        System.out.println("减少2个月时间后：" + minusTime);
    }
}

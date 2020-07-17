package com.wxq.my0417fri;

import java.util.Arrays;

/**
 * @author wangxiaoqiang
 * @date 2020/4/17 16:44
 * @description 编写一个方法，计算从 0 到 n (含 n) 中数字 2 出现的次数。
 */

public class TiMu {
    public static void main(String[] args) {
        int i = fun(25);
        System.out.println(i);
    }

    public static int fun(int num){
        int count = 0;
        for (int i = 0; i <= num; i++ ){
           if(i / 10 ==2){
               count++;
           }
           if(i % 10 ==2){
               count++;
           }
        }
        return count;
    }
}

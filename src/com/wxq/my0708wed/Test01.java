package com.wxq.my0708wed;

/**
 * @author wangxiaoqiang
 * @date 2020/7/8 13:55
 * @description
 */

public class Test01 {

    public static void main(String[] args) {
        Person p1 = new Person("wxq",22);
        Person p2 = new Person("wxq",22);
        System.out.println("hashCode="+p1.hashCode());
        System.out.println("hashCode="+p2.hashCode());
        System.out.println(p1.equals(p2));
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2);
    }
}

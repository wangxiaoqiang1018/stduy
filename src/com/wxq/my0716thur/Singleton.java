package com.wxq.my0716thur;

/**
 * @author wangxiaoqiang
 * @date 2020/7/16 8:55
 * @description
 */

public class Singleton {
    private static volatile Singleton singleton;
    private Singleton(){}
    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}

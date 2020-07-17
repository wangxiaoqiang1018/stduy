package com.wxq.my0417fri;

/**
 * @author wangxiaoqiang
 * @date 2020/4/17 14:08
 * @description
 */

public class MySingleton {
    private static MySingleton mySingleton;
    private MySingleton(){}
    public static MySingleton getInstance(){
        if(mySingleton!=null){
            return mySingleton;
        }else{
            return new MySingleton();
        }
    }
}

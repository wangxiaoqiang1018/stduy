package com.wxq.my0708wed;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangxiaoqiang
 * @date 2020/7/15 10:26
 * @description
 */

public class Test02 {
    public static void main(String[] args) throws Exception {
        // hashmap 指定大小时 自动扩容为2的幂次方 最接近的
        Map<String,String> map = new HashMap<>(30);
        Class clazz = HashMap.class;
        Field field = clazz.getDeclaredField("threshold");
        field.setAccessible(true);
        int threshold = (int) field.get(map);
        System.out.println(threshold);
    }
}

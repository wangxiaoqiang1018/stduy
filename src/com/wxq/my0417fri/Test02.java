package com.wxq.my0417fri;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangxiaoqiang
 * @date 2020/5/19 13:52
 * @description
 */

public class Test02 {
    private Integer id;
    private String name;
    private List<String> lists;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public static void main(String[] args) {
        List<Test02> list = new ArrayList<>();

        List<List<String>> collect = list.stream().map(Test02::getLists).collect(Collectors.toList());


        System.out.println(21/20);
    }
}

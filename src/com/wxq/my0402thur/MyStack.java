package com.wxq.my0402thur;

/**
 * @author wangxiaoqiang
 * @date 2020/4/2 15:49
 * @description 使用数组实现栈
 * 自己实现一个栈，要求这个栈具有push()、pop()（返回栈顶元素并出栈）、peek() （返回栈顶元素不出栈）、isEmpty()、size()这些基本的方法。
 */

public class MyStack {
    private int[] ints;
    private int capacity;
    private int count;

    public MyStack(){
        this.ints = new int[8];
        this.capacity = 8;
        this.count = 0;
    }

    public MyStack(int capacity){
        if(capacity < 1){
            throw new IndexOutOfBoundsException("容量不能小于1");
        }
        this.ints = new int[capacity];
        this.capacity = capacity;
        this.count = 0;
    }

    public void expansion(){
        ints = new int[this.capacity * 2];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public int size(){
        return count;
    }



}

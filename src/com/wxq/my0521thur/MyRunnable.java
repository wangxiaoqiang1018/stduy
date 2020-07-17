package com.wxq.my0521thur;

/**
 * @author wangxiaoqiang
 * @date 2020/5/21 16:43
 * @description
 */

public class MyRunnable implements Runnable {
    private int count;
    private String str = "";
    public MyRunnable(int count){
        this.count = count;
    }
    @Override
    public void run() {
            System.out.println("count=" + count);

    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("执行main方法");

//        Thread.sleep(5000);
        int c = 0;
        for (int i=0; i<10; i++){
            c++;
            MyRunnable myRunnable = new MyRunnable(c);
            Thread thread = new Thread(myRunnable);
            thread.start();
        }

//        thread.join();
    }
}

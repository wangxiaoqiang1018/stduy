package com.wxq.my0414tue;

/**
 * @author wangxiaoqiang
 * @date 2020/4/14 13:41
 * @description 启动三个线程打印递增数字，线程1先打印1,2,3 然后是线程2打印4,5,6然后是线程3打印出7,8,9.接着在由线程1打印10,11,12.以此类推打印到45.
 */

public class Test01 {
    private static int n = 1;
    private static int state = 1;
    public static void main(String[] args) {
        String p ="";
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (p){
                    for (int j=0;j<5;j++) {
                        while (state != 1)
                            try {
                                p.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        System.out.println("线程1");
                        for (int i = 0; i < 3; i++) {
                            System.out.println(n);
                            n++;
                        }
                        System.out.println();
                        state = 2;
                        p.notifyAll();
                    }
                }
            }
        },"线程1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (p){
                    for (int j=0;j<5;j++) {
                        while (state != 2)
                            try {
                                p.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        System.out.println("线程2");
                        for (int i = 0; i < 3; i++) {
                            System.out.println(n);
                            n++;
                        }
                        System.out.println();
                        state = 3;
                        p.notifyAll();
                    }
                }
            }
        },"线程2").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (p){
                    for (int j=0;j<5;j++){
                        while (state !=3)
                            try {
                                p.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        System.out.println("线程3");
                        for (int i=0; i<3;i++){
                            System.out.println(n);
                            n++;
                        }
                        System.out.println();
                        state = 1;
                        p.notifyAll();
                    }
                }
            }
        },"线程3").start();
    }
}
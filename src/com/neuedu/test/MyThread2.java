package com.neuedu.test;

/**
 * Created by hy on 2020/2/12.
 */
public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i<=100;i++){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Thread.currentThread()获取当前正在执行的线程
            System.out.println(Thread.currentThread().getName()+"线程输出----"+i);
        }
    }
}

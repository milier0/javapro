package com.neuedu.test;

/**
 * Created by hy on 2020/2/12.
 */
public class XianTest {
    public static void main(String[] args) {
        /*
        * 进程
        *   正在运行的程序
        * 线程
        *   线程是进程的一个执行过程 也就是说 一个进程可以包含多个线程（至少也有一个线程）
        *
        * 如何创建多线程
        *   1 继承Thread类
        *   2 实现Runnable接口
        *   3 线程池
        *
        * */
        /*
        MyThread1 t1 = new MyThread1();
        t1.start();
        //不是同一个对象，就不是同一个线程
        MyThread1 t2 = new MyThread1();
        t2.start();*/
        /*
        MyThread2 t2 = new MyThread2();
        Thread t = new Thread(t2);
        t.start();*/
        MyInterface2 jia = new MyAdd();
        MyInterface2 jian = new MyJian();
        MyInterface2 cheng = new MyCheng();
        MyInterface2 chu = new MyChu();
        System.out.println(method(10,2,jia));

    }
    public static void eat(){}
    public static void talk(){}
    public static void drink(){}
    public static int method(int a,int b,MyInterface2 myInterface2){
        return myInterface2.method(a,b);
    }
}

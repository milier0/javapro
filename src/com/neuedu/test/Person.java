package com.neuedu.test;

/**
 * Created by hy on 2020/2/4.
 */
public class Person extends Animal{
    /*
    *构造方法：
    *   1构造方法一旦被调用 就会返回一个对象
    *   2为私有属性赋值
    *
    *构造方法的写法
    *    访问修饰符 方法名{方法名必须和类名一样}（参数列表）{
    *       代码 不必写返回值
    *    }
    *
    *如果不写 则默认生成一个没有参数的构造方法
    *如果写了 不会生成
    *
    * */

    @Override//代表重写
    public void run() {
        System.out.println("人能跑能跳能颠步");
    }
}


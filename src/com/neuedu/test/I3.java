package com.neuedu.test;

/**
 * Created by hy on 2020/2/8.
 */
//建一个CPU I3类
//电脑运行中所有的计算都是由CPU完成的 相当于主板的心脏
//可以看做I3是接口(CPU)的子类
//必须重写抽象方法
public class I3 implements CPU{
    public void method(){
        System.out.println("i3进行计算");
    }
}

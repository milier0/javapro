package com.neuedu.bean;

import com.neuedu.test.Father;

import java.util.Random;

/**
 * Created by hy on 2020/2/10.
 */
public class MyTest11 {
    public static void main(String[] args) {
        Father f1 = new Father();
        f1.setName("sherry");
        String  a = f1.getName();
        System.out.println(a);
        //abs绝对值
        System.out.println(Math.abs(-100));
        //max写俩值返回大值
        System.out.println(Math.max(5,10));
        //sqrt开平方
        System.out.println(Math.sqrt(25));
        //PI 3.14
        System.out.println(Math.PI);
        //pow 次方
        System.out.println(Math.pow(3,3));
        //random 生成0-1的随机数
        System.out.println(Math.random());
        //生成0-52 不会等于52 左闭右开的随机数
        Random random = new Random();
        System.out.println(random.nextInt(52));
    }
}

package com.neuedu.test;

import java.net.SocketOption;

/**
 * Created by hy on 2020/2/5.
 */
public class MyTest4 {
    public static void main(String[] args) {
        /*
        * 继承 ——两个类之间的行为
        *   明确了 两个类之间的父子关系
        *   子类可以拿到父类的属性和方法
        *
        * */
        Wang w1 = new Wang();
        w1.setAge(36 );
        w1.teach();
        Zhang z1 = new Zhang();
        z1.teach();
        Guo g1 =new Guo();
        g1.teach();


    }
}

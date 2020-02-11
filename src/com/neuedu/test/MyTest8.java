package com.neuedu.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * Created by hy on 2020/2/7.
 */
public class MyTest8 {
    public static void main(String[] args) {
        /*
        * 多态 —— 建立在继承的基础上
        * 可以说是实现继承之后的一个好处
        *
        * 有两种表现形式
        * 1 赋值多态
        *    父类引用指向子类对象 子类的的对象可以给父类的引用赋值
        * 2 传参多态
        *    当一个方法的参数类型定位为父类的时候 所有子类都可以传参
        *
        * */
        /*
        * 接口  ——比抽象类更抽象的一种特殊类
        *
        * 接口在jdk1.8之前 只能有抽象方法 不能有抽象类
        * 接口中 不能有属性 不能有构造方法
        *
        * */
        //引用类型存的全部都是地址
        //wang里边存的是 new Wang 的地址， new Wang 是对象
        /*Wang wang = new Wang();
        method(wang);
    }

    public static void method(Teacher teacher) {

    }*/
        /*
        *  集合
        *  List 接口interface
        *    实现类ArrayList
        *    Vector
        *    LinkedList
        *    <ArrayList和Vector的区别>
        *        ArrayList非线程安全   Vector线程安全
        *    <ArrayList和LinkedList的区别>
        *        ArrayList底层是数组
        *        LinkedList底层是链表
        *
        *  Set
        *  Map
        *
        * */
        //动态数组
        /*List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(51);
        list.add(0,22);
        List list2 = new ArrayList();
        list2.add("hkj");
        list2.add("adf");
        list.addAll(list2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //查看括号内内容是否在集合内 true/false
        System.out.println(list.contains("51"));
        //查看括号内内容在集合内的位置(下标)
        System.out.println(list.indexOf(51));
        List vector = new Vector();
        List linkedlist  = new LinkedList();*/
    }
}

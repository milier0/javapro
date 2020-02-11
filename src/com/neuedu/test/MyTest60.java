package com.neuedu.test;

/**
 * Created by hy on 2020/2/6.
 */
//编写测试类
// 在main方法中，分别使用父类引用指向子类对象
// 声明创建一个矩形和圆的对象，并调用2个子类的showAll方法
public class MyTest60 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,20,"pink");
        r1.showAll();
        Circle c1 = new Circle(10.0,"blue");
        c1.showAll();
    }

}

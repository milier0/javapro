package com.neuedu.test;

/**
 * Created by hy on 2020/2/6.
 */
//Shape的子类 Rectangle表示矩形类
public class Rectangle extends Shape{
    //增加两个属性 width表示长度 height表示宽度
    private double width;
    private double height;
    //增加一个构造方法（一个是默认的、一个是为高度、宽度、颜色赋值的 ）
    public Rectangle(){}

    //赋值有两种方法 一种用set方法 一种用构造方法
    //这里用构造方法赋值
    public Rectangle(double width,double height,String color){
        //调用父类的构造方法 传一个color
        super(color);
        //给宽度和高度赋值
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPer() {
        return 2*(width+height);
    }

    @Override
    public void showAll() {
        System.out.println("矩形面积"+getArea());
        System.out.println("矩形周长"+getPer());
        System.out.println("矩形颜色"+getColor());
    }
}

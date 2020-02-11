package com.neuedu.test;

/**
 * Created by hy on 2020/2/6.
 */
public class Circle extends Shape{
    //增加1个属性，radius表示半径
    private double radius;

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double getPer() {
        return 2*3.14*radius;
    }

    @Override
    public void showAll() {
        System.out.println("圆面积:"+getArea());
        System.out.println("圆周长:"+getPer());
        System.out.println("圆颜色:"+getColor());
    }

    ;
    public Circle(Double radius,String color){
        super(color);
        this.radius = radius;
    }
}

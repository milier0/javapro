package com.neuedu.test;

/**
 * Created by hy on 2020/2/6.
 */
//如果类下有了抽象方法 那么这个类必须是抽象类 abstract
public abstract class Shape {
    //面积属性
    private double area;
    //周长属性
    private double per;
    //颜色属性
    private String color;
    //有两个构造方法（一个是默认的、一个是为颜色赋值的）
    public Shape(){};
    public Shape(String color){
        this.color = color;
    }
    //添加一个getcolor方法 获取一下颜色
    public String getColor() {
        return color;
    }

    //定义3个抽象方法
    // getArea计算面积
    public abstract double getArea();
    // getPer计算周长
    public abstract double getPer();
    // showAll输出所有信息
    public abstract void showAll();
}

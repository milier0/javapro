package com.neuedu.test;

/**
 * Created by hy on 2020/2/10.
 */
public abstract class Wenju {
    private double prices;
    //大小
    private String size;
    //颜色
    private String color;
    //构造方法 为颜色赋值
    public Wenju(){}
    public Wenju(String color){
        this.color = color;
    }
    //getcolor 获取颜色
    public String getColor(){
        return color;
    }


    //计算总价
    public abstract double getPrices();
    //输出所有
    public abstract void showAll();
}

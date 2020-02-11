package com.neuedu.test;

/**
 * Created by hy on 2020/2/10.
 */
public class Pencil extends Wenju {
    //增加属性大小
    private String size;
    private int no;
    private double price;
    //构造方法
    public Pencil(){}
    public Pencil(int no,double price,String size,String color) {
        //调用父类的构造方法 传no,size,color
        super(color);
        //给size赋值
        this.no = no;
        this.price = price;
        this.size = size;
    }

    @Override
    public double getPrices() {
        return no*price;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public double getPrice() {
        return price;
    }

    public int getNo() {
        return no;
    }

    @Override
    public void showAll() {
        System.out.println("铅笔颜色："+getColor());
        System.out.println("铅笔大小:"+getColor());
        System.out.println("铅笔单价:"+getPrice());
        System.out.println("铅笔个数:"+getNo());
        System.out.println("铅笔总价:"+getPrices());

    }

}

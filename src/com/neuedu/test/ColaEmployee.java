package com.neuedu.test;

/**
 * Created by hy on 2020/2/6.
 */
//创建一个抽象员工类ColaEmployee
//属性：员工的姓名(字符串类型)
//员工的生日月份(整型) 抽象方法：getSalary(int month)
public abstract class ColaEmployee {
    public ColaEmployee(String name,int month){
        this.name = name;
        this.month = month;
    }
    private String name;
    private int month;
    public abstract double getSalary(int month);
}

package com.neuedu.test;

/**
 * Created by hy on 2020/2/6.
 */
//SalariedEmployee (拿固定工资的员工)
public class SalariedEmployee extends ColaEmployee{
    private int salary;
    public SalariedEmployee(String name,int salary,int month){
        super(name,month);
        this.salary = salary;
    }
    @Override
    public double getSalary(int month) {
        return salary;
    }
}

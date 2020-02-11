package com.neuedu.test;

/**
 * Created by hy on 2020/2/6.
 */
public class MyTest7 {
    public static void main(String[] args) {
        SalariedEmployee s1 = new SalariedEmployee("cy",12000,2);
        System.out.println(s1.getSalary(2));
        HourlyEmployee h1 = new HourlyEmployee("milier",200,50,4);
        System.out.println(h1.getSalary(4));
        SalesEmployee s2 = new SalesEmployee("cp",300000,0.05,5);
        System.out.println(s2.getSalary(5));
    }



}


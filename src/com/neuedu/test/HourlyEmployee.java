package com.neuedu.test;

/**
 * Created by hy on 2020/2/6.
 */
//HourlyEmployee（拿小时工资的员工）
//按小时拿工资的员工，每月工作超出160 小时的部分按照1.5 倍工资发放
//参数：每小时的工资（整型），每月工作的小时数(整型)
public class HourlyEmployee extends ColaEmployee{
    private int hour;
    private int hourSalay;
    public HourlyEmployee(String name,int hour,int hourSalay,int month){
        super(name,month);
        this.hour = hour;
        this.hourSalay = hourSalay;
    }

    @Override
    public double getSalary(int month) {
        if(hour<=160){
            return hour*hourSalay;
        }else {
            return 160*hourSalay+(hour-160)*hourSalay*1.5;
        }
    }
}

package com.neuedu.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hy on 2020/2/13.
 */
public class MyTest16 {
    public static void main(String[] args) {
        //斐波那契数列
        //1 1 2 3 5 8 13
       System.out.println(method(6));
        //一个球从100米高度落下，每次落地后反弹到原高度的一半
        //第10次落地后 反弹多高
        System.out.println(high(10));
        //完全平方数 一个数能表示成某个整数的平方的形式
        //一个整数加100后是一个完全平方数 再加168也是一个完全平方数 该数是多少
        /*for (int i = -99;;i++){
            if(Math.sqrt(i+100)%1==0&&Math.sqrt(i+268)%1==0)
                System.out.println("这个数是："+i);
        }*/
        //报数
        //System.out.println(baoshu(1000));
    }
    public static int method(int y){
        //前两位数为1
        if (y==1||y==2){
            return 1;
        }else {
            //从第三个数开始循环输出
            int f1 = 1;
            int f2 = 1;
            int sum;
            for (int i = 3;i<=y;i++){
                sum = f1+f2;
                f1 = f2;
                f2 = sum;
            }
            return f2;
        }
    }
    public static double high(int x){
        //球从100米高度落下
        int h = 100;
        //每次落地后反弹到原高度的一半
        double g = h/2.0;
        for (int n =1; n<10;n++){
            g = g/2;
        }
        return g;
    }
    public static int baoshu(int n){
        List<Integer> list = new ArrayList<>();
        for (int i = 1;i<=n;i++){
            list.add(i);
        }
        //定义一个报数的计数器m
        int m = 1;
        //只要列内的人数大于1 就一直循环报数
        while (list.size()>1){
            //只要不报3 就将这个人从列表第一个移出 放于列表最后一个继续排队报数
            if (m!=3){
                int first = list.remove(0);
                list.add(first);
                m++;
            //当报3的时候 出列 从列中移除
            }else {
                list.remove(0);
                m = 1;
            }
        }
        //列表只剩一个人 数组下标为0
        return list.get(0);
    }

}

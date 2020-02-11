package com.neuedu.test;

/**
 * Created by hy on 2020/2/11.
 */
public class Runnian {
    public static void main(String[] args) {
        //闰年
        int year = 1995;
        if((year%4==0&&year%100!=0)||year%400==0){
            System.out.println(year+"是闰年");
        }else {
            System.out.println(year+"不是闰年");
        }
        //计算1-100累加和
        int sum1 = 0;
        for(int i = 1;i<=100;i++){
            sum1 +=i;
        }
        System.out.println("1-100累加和为"+sum1);
        //1-100偶数和
        int sum2 = 0;
        for(int i = 1;i<=100;i++){
            if(i%2==0){
                sum2 +=i;
            }
        }
        System.out.println("1-100偶数和为"+sum2);
        //计算m的n次方
        int m = 5;
        int n = 3;
        int s = 1;
        for(int i = 1;i<=n;i++){
            s*=m;
        }
        System.out.println(m+"的"+n+"次方为"+s);
        //两个正整数的最大公约数和最小公倍数
        int x = 8;
        int y = 12;
        int max = 1;
        int min = Math.max(x,y);
        for(int i =1;i<=x&&i<=y;i++){
            if(x%i==0&&y%i==0){
                max=i;
            }
        }
        for(int i = Math.max(x,y);i<=x*y;i++){
            if(i%x==0&&i%y==0){
                min=i;
                break;
            }
        }
        System.out.println(x+"和"+y+"的最大公约数为"+max);
        System.out.println(x+"和"+y+"的最小公倍数为"+min);
        //100-999之间的水仙花数
        for (int i = 100;i<=999;i++){
            int a = i/100;
            int b = i/10%10;
            int c = i%10;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }

    }
}

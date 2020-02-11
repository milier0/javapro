package com.neuedu.test;

/**
 * Created by hy on 2020/2/3.
 */
public class MyTest {
    public static void main(String[] args){
        //println默认回车 printf没有回车 没一句代码必须以分号结尾
//        System.out.println("11111");
//        System.out.println("22222");
//        System.out.print("11111");
//        System.out.print("22222");
        /*
        * java的数据类型
        * 两种
        *   基本类型
        *      1 byte    整数型    1字节
        *      2 short   整数型    2字节
        *      3 int     整数型    4字节
        *      4 long    整数型    8字节
        *      5 float   浮点型
        *      6 double  浮点型
        *      7 boolean 真假(true false)
        *      8 char    字符(1个)
        *   引用类型
        *      1 类
        *      2 数组
        *      3 接口
        *
        *
        *
        *
        * */
        //闰年
        /*int year = 1995;
        if((year%4==0&&year%100!=0)||year%400==0){
            System.out.println("是闰年");
        }else {
            System.out.println("不是闰年");
        }*/
        //计算1-100累加
        /*int sum=0;
            for(int i=1;i<=100;i++){
                sum += i;
            }
            System.out.println(sum);*/
        //1-4之间 拿出任意3个数 最多能组成多少个数字 并打印
        /*int[]array={1,2,3,4};
        for(int i : array){
            //先拿出百位的数赋值给i
            for(int j : array){
                //再拿十位的数给j
                if(i!=j){
                    for(int k : array){
                        //最后拿个位数赋值给k
                        if(k!=j&&k!=i){
                            System.out.println(i*100+j*10+k);
                        }

                    }
                }

            }

        }*/
        //1-100的偶数和
        /*int sum = 0;
        for (int i = 1;i<=100;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);*/
        //定义两个int变量 m和n 计算m的n次方
        /*int m = 4;
        int n = 3;
        int s = 1;
        for(int i = 0;i<n;i++){
            s*=m;
        }
        System.out.println(s);*/
        //100~999之间的水仙花数 例如 153 1^3+5^3+3^3=153
        /*for(int i=100;i<=999;i++){
            //取百位
            int a=i/100;
            //取十位
            int b=i/10%10;
            //取个位
            int c=i%10;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }*/
        //两个正整数 计算最大公约数和最小公倍数
        /*int x=8;
        int y=12;
        int max=1;
        int min=max(x,y);
        for(int i=1;i<=x&&i<=y;i++){
            if(x%i==0&&y%i==0){
                max=i;
            }
        }
        for(int i=max(x,y);i<=x*y;i++){
            if(i%x==0&&i%y==0){
                min=i;
                break;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    //定义运算符
    public static int max(int a,int b){
        //三目运算符
        //表达式？如果成立返回：如果不成立返回
        return (a>b)?a:b;*/
        //冒泡排序
        /*int [] array={ 9, 22, 71, 56, 42, 25, 63, 99, 111, 15};
        //输出原始数列
        System.out.println("原始数列为：");
        for(int n : array){
            System.out.println(n+"");
        }
        //外层循环控制总趟数
        for(int i=0;i<array.length-1;i++){
            int flag = 0;
            //内层循环控制每趟的排序
            for(int j=0;j<array.length-i-1;j++){
                int temp;
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag++;
                }
            }
        }
        //输出排序后的序列
        System.out.println();
        System.out.println("排序后的序列为：");
        for(int n : array){
            System.out.println(n+"");
        }*/
        //选择排序
        /*int [] array={ 9, 22, 71, 56, 42, 25, 63, 99, 111, 15};
        //输出原始数列
        System.out.println("原始数列为：");
        for(int n : array){
            System.out.println(n+"");
        }
        //外层循环
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp =array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        System.out.println("排序后数列为：");
        for(int n : array){
            System.out.println(n+"");
        }*/
    }
}

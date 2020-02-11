package com.neuedu.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by hy on 2020/2/11.
 */
public class LangTest {

    public static ArrayList<Langren> list = new ArrayList<>();
    public static void main(String[] args) {

        menu();
    }
    public static void menu(){
        System.out.println("请选择你要进行的操作（输入1-3中的任一个数字）：");
        System.out.println("1：展示所有身份牌");
        System.out.println("2：开始游戏");
        System.out.println("3：退出游戏");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1:
                break;
            case 2:
                System.out.println("请输入游戏人数：");
                break;
            default:
                System.exit(0);
        }
    }

    public static void print(ArrayList<String> list){
        for(int i = 1;i<=5;i++){
            list.add("狼人"+i);
        }
        for(int j= 1;j<=7;j++){
            list.add("村民"+j);
        }
        list.add("预言家");
        list.add("女巫");
        list.add("丘比特");
        list.add("猎人");
        list.add("村长");
        list.add("替罪羊");
        list.add("吹笛人");
        list.add("盗贼");
        System.out.println("所有的身份牌如下：");
        for (Object obj : list){
            System.out.println(obj);
        }
        menu();
    }
    public static void configure(ArrayList<Langren> figures){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 18:
                System.out.println("狼人*5，村民*7，预言家*1，女巫*1，丘比特*1，守护*1，猎人*1，村长*1，替罪羊*1，吹笛者*1，盗贼*1");
                System.out.println("共21张牌");
            case 17:
                System.out.println("狼人*5，村民*7，预言家*1，女巫*1，丘比特*1，守护*1，猎人*1，村长*1，替罪羊*1，盗贼*1");
                System.out.println("共20张牌");
            case 16:
                System.out.println("狼人*5，村民*6，预言家*1，女巫*1，丘比特*1，守护*1，猎人*1，村长*1，替罪羊*1，盗贼*1");
                System.out.println("共19张牌");
            case 15:
                System.out.println("狼人*5，村民*5，预言家*1，女巫*1，丘比特*1，守护*1，猎人*1，村长*1，替罪羊*1，盗贼*1");
                System.out.println("共18张牌");
            case 14:
                System.out.println("狼人*4，村民*5，预言家*1，女巫*1，丘比特*1，守护*1，猎人*1，村长*1，替罪羊*1，盗贼*1");
                System.out.println("共17张牌");
            case 13:
                System.out.println("狼人*4，村民*5，预言家*1，女巫*1，丘比特*1，守护*1，猎人*1，村长*1，盗贼*1");
                System.out.println("共16张牌");
            case 12:
                System.out.println("狼人*4，村民*4，预言家*1，女巫*1，丘比特*1，守护*1，猎人*1，村长*1，盗贼*1");
                System.out.println("共15张牌");
            default:
                menu();
        }
    }
}

package com.neuedu.test;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by hy on 2020/2/11.
 */
public class Langren {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
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
    }
}
package com.neuedu.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hy on 2020/2/11.
 */
public class CardList {
    String str1 = "红桃";
    String str2 = "fang";
    String str3 = "heitao";
    String str4 = "meihua";
    List<String> l1 = new ArrayList<String>();
    List<String> l2 = new ArrayList<String>();
    List<String> l3 = new ArrayList<String>();
    List<String> l4 = new ArrayList<String>();
    List<String> l5 = new ArrayList<String>();
    public void fold(String str1,String str2,String str3,String str4,List<String>l1){
        for(int i = 1;i<14;i++){
            l1.add(str1+i);
            l1.add(str2+i);
            l1.add(str3+i);
            l1.add(str4+i);
        }
        l1.add("大王");
        l1.add("小王");
        System.out.println(l1);
    }
    public void issue(){
        int b = 0;
        for(int i = 0;i<l1.size();i++){
            if(i<l1.size()-3){
                if(i==0+(3*b)){
                    l3.add(l1.get(i));
                }
                if (i==1+(3*b)){
                    l4.add(l1.get(i));
                }
                if(i==2+(3*b)){
                    l5.add(l1.get(i));
                    b++;
                }
            }
            if (i>=l1.size()-3){
                l2.add(l1.get(i));
            }
        }
        System.out.println("A得到的牌"+l3);
        System.out.println("B得到的牌"+l4);
        System.out.println("C得到的牌"+l5);
        System.out.println("底牌"+l2);
    }
    public void isDiZhu(String str12){
        if(str12.equals("A")){
            l3.addAll(l2);
        }else if(str12.equals("B")){
            l4.addAll(l2);
        }else if (str12.equals("C")){
            l5.addAll(l2);
        }
        System.out.println("A得到的牌"+l3);
        System.out.println("B得到的牌"+l4);
        System.out.println("C得到的牌"+l5);
        System.out.println("底牌"+l2);
        l2.clear();
        System.out.println("底牌"+l2);
    }
}

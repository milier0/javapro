package com.neuedu.test;

/**
 * Created by hy on 2020/2/5.
 */
public class MyTest5 {
    public static void main(String[] args){
        MyArray myArray = new MyArray();
        for(int i=1;i<=100;i++){
            myArray.add(i);
        }
        for(int i=0;i<myArray.getSize();i++){
            System.out.println(myArray.get(i));
        }
    }
}

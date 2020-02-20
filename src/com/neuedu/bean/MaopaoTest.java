package com.neuedu.bean;

/**
 * Created by hy on 2020/2/20.
 */
public class MaopaoTest {
    //冒泡排序
    public static void main(String[] args) {
        int[] array = {99,22,56,48,120,36,59};
        System.out.println("原始数列为：");
        for (int m:array){
            System.out.println(m);
        }
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-i-1;j++){
                if (array[i]>array[j+1]){
                    int t = array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
        System.out.println("排序后的数列为：");
        for (int n :array){
            System.out.println(n);
        }
    }


}

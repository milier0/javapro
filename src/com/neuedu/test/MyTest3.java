package com.neuedu.test;

/**
 * Created by hy on 2020/2/5.
 */
public class MyTest3 {
    public static void main(String[] args){
        /*二分搜索
    *   在数组中快速查找元素的一种方式
    *   前提是必须是有序的数组
    *
    *   */
        int[] array = new int[1000];
        for(int i=0;i<array.length;i++){
            array[i]=i+1;
        }
        int a=400;
        //接索引
        int index = search(array,a);
        System.out.println(index);
    }
    /*从array中找到value的索引*/
    //定义一个方法 因为main方法是static 如果想被让他被访问也要用static
    //在一个int数组里边给个参数，去查一个value值
    public static int find(int[] array,int value){
        int count = 0;
    /*穷举查询*/
        int index = -1;
        for(int i=0;i<array.length;i++){
            count++;
            if(array[i]==value){
                System.out.println("查找了"+count+"次");
                return i;
            }

        }
        //return -1代表找不着 数组里边没有
        return -1;
    }
    /*二分搜索查询*/
    public static int search(int[]array,int value){
        int min = 0;
        int max = array.length-1;
        int mid = (min+max)/2;
        int count = 0;
        while(min<=max){
            count++;
            mid=(min+max)/2;
            if(value==array[mid]){
                System.out.println("查找了"+count+"次");
                return mid;
            }else if(value<array[mid]){
                max = mid-1;
            }else{
                min = mid+1;
            }
        }
        return -1;
    }

}

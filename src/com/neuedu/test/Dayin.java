package com.neuedu.test;

/**
 * Created by hy on 2020/2/11.
 */
public class Dayin {
    public static void main(String[] args) {
        //1-4之间 拿出任意三个数 最多能组成多少个数字 并打印
        int[]array={1,2,3,4};
        for(int i :array){
            for(int j:array){
                if(i!=j){
                    for(int k:array){
                        if(k!=j&&k!=i){
                            System.out.println(i*100+j*10+k);
                        }
                    }
                }
            }
        }
    }
}

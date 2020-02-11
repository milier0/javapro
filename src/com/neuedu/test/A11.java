package com.neuedu.test;

/**
 * Created by lan_jia_nao on 2020/2/9.
 */
public class A11 {
    private int a;
    //通道a想与c通道
    public void setA(int a){
        this.a=a;
    }
    public int getA(){
        return a;
    }
    public static void main(String[] args) {
        A11 a11 =new A11();
        a11.setA(15);
        int b=a11.getA();
        System.out.println(b);
    }
}

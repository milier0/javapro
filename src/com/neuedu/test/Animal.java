package com.neuedu.test;

/**
 * Created by hy on 2020/2/5.
 */
public class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void run(){
        System.out.println("动物在跑");
    }
}

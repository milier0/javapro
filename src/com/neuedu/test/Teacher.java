package com.neuedu.test;

/**
 * Created by hy on 2020/2/5.
 */
public abstract class Teacher {
    public Teacher(){}
    public Teacher(String name,int age){
        this.name = name;
        this.age = age;
    }
    private String name;
    private int age;
    public abstract void teach();

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
}

package com.neuedu.test;

import java.io.Serializable;

/**
 * Created by hy on 2020/2/5.
 */
public class Student implements Serializable {
    //1L L代表这个1是个long类型的
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String grade;
    private Integer age;
    private String name;

    public Integer getId(int i) {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}

package com.neuedu.pojo;

/**
 * Created by hy on 2020/2/18.
 */
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    /*static {
        //这个部分叫做静态代码块
        //该代码块中的代码 会在类加载器对该类进行加载在的时候运行
        //因为对类进行加载的动作只会执行一次 所以静态代码块只有第一场次主动使用类的时候会执行一次
        System.out.println("student静态代码块");
    }
    {
        //构造代码块 只要调用一次构造方法他就会执行一次
        //new多少次执行多少次
        System.out.println("构造代码块");
    }
    public Student(){
        System.out.println("构造方法");
    }*/

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student(int id, String name, int age) {
        this.id = this.id;
        this.name = this.name;
        this.age = this.age;
    }

    public Student() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

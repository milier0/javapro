package com.neuedu.test;

import com.neuedu.pojo.*;
import com.neuedu.pojo.Student;
import com.neuedu.util.*;
import com.neuedu.util.MyArray;
import com.neuedu.web.StudentWeb;

import java.lang.reflect.Field;
import java.util.List;

/**
 * Created by hy on 2020/2/18.
 */
public class StudentWebTest {
    public static void main(String[] args) {
        StudentWeb studentWeb = new StudentWeb();
        studentWeb.showmain();
        studentWeb.input();
        /*Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();*/

//        student.setId(1);
//        Student student2 = new Student();

        //System.out.println(JdbcUtil.add(1,2,3,4,5,6,7));


        /*try {
            Class clz = Student.class;
            Student student = new Student();
            Class clz2 = student.getClass();
            //因为是以字符串传进来的 如果字符串写错了有可能就找不到那个类 所以会有异常
            Class clz3 = Class.forName("com.neuedu.pojo.Student");
            System.out.println(clz==clz2);
            System.out.println(clz==clz3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
        //Class clz = Student.class;
        //调用该类的无参构造创建一个对象
        // 类下 每一个方法都会封装成 Method类型的对象
        // 类下 每一个属性都会封装成Field类型的对象
        // 有多少个属性就有多少个Field 有多少个方法就有多少个Method
        // 实际上 Field是个数组 Method也是数组
        /*Field[] fields = clz.getDeclaredFields();
        for (Field f:fields){
            System.out.println(f.getName());
        }*/
        /*List<Dept> list = JdbcUtil.executeQuery("select deptno,dname,loc from dept",Dept.class);
        System.out.println(list);*/
    }
}

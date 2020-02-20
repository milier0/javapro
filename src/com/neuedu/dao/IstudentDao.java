package com.neuedu.dao;

import com.neuedu.pojo.Student;

import java.util.List;

/**
 * Created by hy on 2020/2/18.
 */
public interface IstudentDao {
    List<Student> query();
    //添加
    int add(Student student);
    //修改
    int update(Student student);
    //删除
    int del(int id);
    //根据id查单个
    Student queryOne(int id);
}

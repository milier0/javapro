package com.neuedu.dao;

import com.neuedu.pojo.Student;
import com.neuedu.util.JdbcUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hy on 2020/2/18.
 */
public class StudentDao implements IstudentDao{
    String url = "jdbc:mysql://localhost:3306/db1?useUnicode=true&characterEncoding=utf8";
    String username = "root";
    String password = "123456";
    //提升作用域
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    @Override
    public List<Student> query() {
        //因为不知道有多少个student记录 所以创建list
        List<Student> list = new ArrayList<>();
        try {
            // 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 创建连接
            con = DriverManager.getConnection(url,username,password);
            // 创建命令行 写sql语句
            pstmt = con.prepareStatement("select id,name,age from student");
            // 执行sql语句
            //如果是查询 调用executeQuery方法 返回一个ResultSet 结果集
            rs = pstmt.executeQuery();
            /*
            * ResultSet 每次调用 next()方法的时候 会做两件事
            *   1 看一下有没有下一行 如果没有返回false
            *   2 如果有 将游标推向下一行 返回true
            *
            * */
            while (rs.next()){
                Student student = new Student();
                //获取一个student对象信息
                //把数据库里的id拿出来赋给student对象的ID属性上
                //每循环一行记录 就把这一行记录的值封装到java中的student对象中
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                //每循环完一次 都放到list里面
                list.add(student);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (rs!=null)
                    rs.close();
                if (pstmt!=null)
                    pstmt.close();
                if (con!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return list;
    }

    @Override
    public int add(Student student) {
        //定义一个Object数组放问号的值
        return JdbcUtil.executeUpdate("insert into student(name,age)values(?,?)",student.getName(),student.getAge());
    }

    @Override
    public int update(Student student){
        return JdbcUtil.executeUpdate("update student set name=?,age=? where id=?",student.getName(),student.getAge(),student.getId());
    }

    @Override
    public int del(int id) {
        return JdbcUtil.executeUpdate("delete from student where id=?",id);

    }

    @Override
    public Student queryOne(int id) {
        return null;
    }
}

package com.neuedu.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by hy on 2020/2/18.
 */
public class MyAddTest {
    public static void main(String[] args) {
        /*
        * jdbc 和 Navicat 的用法实际上是一样的
        * 看似形式不同 一个是用代码 一个是视图画面
        * 但是实质上 是一回事儿 流程完全相同
        *
        * */
        String url = "jdbc:mysql://localhost:3306/db1?useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "123456";
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            // 1 文件-->新建-->mysql 选择要连接数据库的种类
            //加载驱动 连哪种数据库就要加载哪种驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2 新建连接 通过主机id或者主机名 端口号 用户名 密码
            //创建连接 通过DriverManager类来实现
            //返回一个connection对象 所以用connection来接收
            con = DriverManager.getConnection(url,username,password);
            // 3 选择要操作哪一个数据库
            //在jdbc中 要操作的库已经包含在url中了 所以在jdbc中省略

            // 4 创建一个可以写sql语句的地方
            //括号里面要传一个String类型的 就写sql语句
            pstmt = con.prepareStatement("insert into student(id,name) values(4,'可爱')");
            // 5 写sql语句
            //在jdbc中 该操作已经包含在创建PreparedStatement中了 所以不需要再写

            // 6 执行sql语句 看结果
            //如果是增删改查 则用PreparedStatement对象调用 executeUpdate方法 返回int(受影响的行数)
            //如果是查询 则用PreparedStatement对象调用 executeQuery 返回ResultSet对象(结果集)
            Object l = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //对于con和PreparedStatement来说 都是资源 使用后要进行关闭
            //谁后创建的先关
            try {
                if (pstmt!=null)
                    pstmt.close();
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }
}

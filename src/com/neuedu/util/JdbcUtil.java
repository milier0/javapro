package com.neuedu.util;

import com.neuedu.pojo.Dept;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hy on 2020/2/19.
 */
public class JdbcUtil {
    //Static final 静态只读 相当于一个常量
    //规范：用它修饰的变量名用大写字母(如URL)来命名
    private static final String URL = "jdbc:mysql://localhost:3306/db1?useUnicode=true&characterEncoding=utf8";
    private static final String USENAME ="root";
    private static final String PASSWORD = "123456";
    //加载驱动 只加载一次就行
    //静态代码块只加载一次
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //创建连接
    public static Connection getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL,USENAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    //封装通用的增删改
    //类型没准用object 个数没准用list
    //List<Object> 或者 Object[]
    public static int executeUpdate(String sql,Object... params){
        int result = 0;
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(sql);
            //空指针点.什么都会报错
            if (params!=null){
                for (int i = 0;i<params.length;i++){
                    pstmt.setObject(i+1,params[i]);
                }
            }
            //result等于执行的结果
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(con,pstmt);
        }
        return result;
    }
    //封装通用查询
    //因为static不用new 约束T要加在方法上
    //传的是什么.class，返回的就是什么泛型
    public static <T> List<T> executeQuery(String sql,Class<T> clz,Object... params){
        // Student 继承 Object
        // List<Student> 没有继承关系 List<Object>
        List<T> list = new ArrayList<>();
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = con.prepareStatement(sql);
            if (params!=null)
                for (int i = 0;i<params.length;i++){
                    pstmt.setObject(i+1,params[i]);
                }
                rs = pstmt.executeQuery();
            while(rs.next()){
                //创建一个T类型的对象 放进list里面
                //该方法是通过反射class对象 调用无参构造来创建对象
                T t = clz.newInstance();
                //通过字段名 从rs中拿值 然后赋值给 对象的属性
                //在不知道该类有多少个属性的情况下 应该是有多少个属性就set多少个属性
                //我们必须先获取有多少个属性
                Field[] fields = clz.getDeclaredFields();
                /*rs.getInt("deptno");
                rs.getString("danme");
                rs.getString("loc");*/
                for (Field f : fields){
                    //属性名 刚好和数据库字段名一样了
                    //我们就可以把属性名 当做数据库里的字段名 用rs.getObject(传属性名)
                    //getName() get出来的是 的deptno dname local
                    try {
                        Object value = rs.getObject(f.getName());
                        //拿出值之后 我们就可以为 属性赋值了
                        //为属性赋值 属性对象是Field 但是我们必须指明 我们要为哪个对象的属性赋值
                    /*
                    *我们用field 调用set方法 可以进行赋值
                    * 第一个参数 传一个对象 表示为哪个对象的该属性赋值
                    * 第二个参数 传值表示赋什么样的值
                    *
                    * 如果该属性是private 那么在赋值之前必须先打开权限
                    *
                    * */
                        f.setAccessible(true);
                        f.set(t, value);
                    }catch (Exception ex){}
                }
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }finally {
            close(con,pstmt,rs);
        }
        return list;
    }
    //封装通用查询 List的泛型是什么类型 我们就要放一个什么类型的对象

    //封装关闭方法
    static void close(Connection con,PreparedStatement pstmt){
        try {
            if (pstmt!=null)
                pstmt.close();
            if (con!=null)
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //方法名相同 参数列表不同 叫做方法重载
    static void close(Connection con, PreparedStatement pstmt, ResultSet rs){
        try {
            if (rs!=null)
                rs.close();
            close(con, pstmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //定义动态参数 int... 表示传多少个都可以
    public static int add(int... array){
        int sum = 0 ;
        for (int a : array){
            sum+=a;
        }
        return sum;
    }
}

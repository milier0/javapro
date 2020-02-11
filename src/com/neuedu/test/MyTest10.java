package com.neuedu.test;

import java.util.*;

/**
 * Created by hy on 2020/2/10.
 */
public class MyTest10 {
    public static void main(String[] args) {
        Father f1 = new Father();
        String a = f1.name;
        System.out.println(a);
        /*
        * set里边不同放入重复元素
        * list可以重复
        * */
        /*List list = new ArrayList();
        list.add(1);
        list.add(1);
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);*/
        /*
        * HashSet 无序
        * TreeSet 按照内容自然顺序
        * LinkedHashSet 按照添加顺序进行排序
        *
        * */
        /*Set set = new LinkedHashSet();
        set.add(1);
        set.add(125);
        set.add(56);
        set.add(220);
        set.add(22);
        set.add(1);
        set.add(125);
        for (Object obj : set){
            System.out.println(obj);
        }*/
        /*
        * 如果输入值的话输出值
        * 不输入值输出null
        * */
        /*Fruit f1 = new Fruit();
        System.out.println(f1.getNo());*/
        /*
        * 包装类的对比必须进行拆包比较
        * */
        /*Integer a = 128;
        Integer b = 128;
        System.out.println(a.intValue()==b.intValue());*/
        /*
        * Map<K,V> 键和值
        * key不能重复 否则会覆盖
        * */
        /*Map<String,String>map = new HashMap<>();
        map.put("a1","Wcy");
        map.put("b1","Xxl");
        map.put("b1","Sherry");
        System.out.println(map.get("b1"));
        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(map.get(key));
        }*/
        /*
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        String b = s1.nextLine();
        System.out.println("a="+a+",b="+b);*/
        /*
        * string转int类型
        *   Integer.parseInt或者Integer.valueof
        * */
        /*String s1 = "456";
        int a = Integer.valueOf(s1);
        String b = String.valueOf(a);
        System.out.println(b);*/
        /*
        * 需要给有异常的代码用try包裹起来
        * */
        /*try{
            int[] a = {1,2,3,4,5,6};
            System.out.println(a[6]);
            //Exception是所有异常的父类
            //出现异常会自动跳到catch块
        }catch (Exception ex){
            System.out.println("出现异常");
        }finally {

        }*/
    try{
        String s1 = method();
        System.out.println(s1);
    }catch (Exception ex){

    }finally {

    }
    }
    public static String method() throws Exception{
        int a = 100/0;
        return "abc";



        //先把return的值放入操作数栈的栈顶，
        // 然后再执行finally，
        // 最后再把操作数栈的栈顶的值return出去
        /*try{
            System.exit(0);
            //制造异常
            //int k = 100/0;
            return "qwer";
        }catch (Exception ex){
            return "asdf";
        }finally {
            System.out.println("无论如何都要执行");
        }*/

    }



}

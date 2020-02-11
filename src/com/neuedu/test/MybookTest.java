package com.neuedu.test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by hy on 2020/2/11.
 */
public class MybookTest {
    //定义一个类数组,长度为200
    public static Mybook[] books = new Mybook[200];
    public static ArrayList<Mybook> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        inputData(arrayList);
        menu();

        /*print(arrayList);
        searchName(arrayList,"书名3");
        deleteName(arrayList,"书名6");
        addBook(arrayList);
        print(arrayList);*/
    }
    public static void menu(){
        System.out.println("请选择你要进行的操作（请输入1-4中的任一个数字）：");
        System.out.println("1：添加图书");
        System.out.println("2：删除图书");
        System.out.println("3：查找图书（根据书名）");
        System.out.println("4：查看全部");
        System.out.println("5：退出");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1:
                addBook(arrayList);
                break;
            case 2:
                System.out.println("请输入需要删除的书名：");
                String name = scanner.next();
                deleteName(arrayList,name);
                break;
            case 3:
                System.out.println("请输入你要查找的书名：");
                String searchName = scanner.next();
                searchName(arrayList,searchName);
                break;
            case 4:
                print(arrayList);
                break;
            default:
                System.exit(0);
        }
    }
    //编写一个函数inputData(ArrayList<Mybook> books])，
    //n为书的数量，从键盘上输入n本书的信息，
    public static void inputData(ArrayList<Mybook> books){
        //控制台输入
        Scanner scanner = new Scanner(System.in);
        //接入
        int n = scanner.nextInt();
        for(int i =1;i<=n;i++){
            Mybook mybook =new Mybook("书名"+i,i,"出版社"+i,"作者"+i,"ISBN号"+i);
            books.add(mybook);
        }
    }
    //编写一个函数print(ArrayList<Mybook> books)，
    //输出全部书的信息。
    public static void print(ArrayList<Mybook> books){
        for(int i = 0;i<books.size();i++){
            //get(i)默认调用toString方法
            System.out.println(books.get(i));
        }
        menu();
    }
    //增加查找功能，
    //编写函数searchName(ArrayList<Mybook> books,String name)，
    //根据书名name在数组books中查找是否存在此书，
    //如果能找到，输出该书的详细信息，
    //如果找不到，输出“此书不存在”。
    public static void searchName(ArrayList<Mybook> books,String name){
        for(int i = 0;i<books.size();i++){
            Mybook mybook = books.get(i);
            //mybook的getname和传进来的name相比
            //字符串比较不能用==，用equals方法
            if(mybook.getName().equals(name)){
                System.out.println(mybook);
                menu();
                //已经找到了 不再往下找 跳出循环 停掉整个函数
                return;
            }
        }
        System.out.println("此书不存在");
        menu();
    }
    //增加删除功能，
    //编写函数deleteName(ArrayList<Mybook> books,String name)，
    //根据书名name在数组books中查找是否存在此书，
    //如果存在，删除该书，并提示“此书删除成功。 ”，并显示该书的详细信息。
    //如果不存在，输出“没有此书，删除失败.”
    public static void deleteName(ArrayList<Mybook> books,String name){
        for(int i = 0;i<books.size();i++){
            Mybook mybook = books.get(i);
            if(mybook.getName().equals(name)){
                //删掉下标
                books.remove(i);
                System.out.println("此书删除成功。");
                menu();
                return;
            }
        }
        System.out.println("没有此书，删除失败.");
        menu();
    }
    public static void addBook(ArrayList<Mybook>books){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名：");
        String name = scanner.next();
        System.out.println("请输入价格：");
        double price = scanner.nextDouble();
        System.out.println("请输入出版社：");
        String press = scanner.next();
        System.out.println("请输入作者：");
        String author = scanner.next();
        System.out.println("请输入书的ISBN号：");
        String bookISBN = scanner.next();
        Mybook mybook = new Mybook(name,price,press,author,bookISBN);
        books.add(mybook);
        menu();
    }
}

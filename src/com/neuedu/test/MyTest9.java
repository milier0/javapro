package com.neuedu.test;

/**
 * Created by hy on 2020/2/8.
 */
public class MyTest9 {
    public static void main(String[] args) {
        /*
        * 继承父类 extends+父类名
        * 实现(继承)接口 implements+接口名
        *
        * 传参多态
        *    参数如果是父类 那么所有子类的对象都可以传递
        * */
        //运行需要主板和CPU
        I3 i3 = new I3();
        I5 i5 = new I5();
        I7 i7 = new I7();
        MainBoard mainBoard = new MainBoard();
        //要把CPU接在主板上 通过set方法
        //setCpu 参数需要传Cpu类型
        //i3 i5 i7 只要是CPU的子类就都可以进行传递
        mainBoard.setCpu(i7);
        mainBoard.method();
    }
}

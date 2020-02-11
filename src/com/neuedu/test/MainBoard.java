package com.neuedu.test;

/**
 * Created by hy on 2020/2/8.
 */
//主板类
public class MainBoard {
    private CPU cpu;

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void method(){
        this.cpu.method();

    /*
    //电脑运行的好坏 不在于电脑本身 而在于CPU的好坏
    public void method(){
        this.i3.method();*/
    }
}

package com.zzx.thread;

/**
 * @ClassName Demo
 * @Description
 * @Author zhangzx
 * @Date 2019/6/13 17:14
 * Version 1.0
 **/
public class Demo extends Thread{
    public void run(){
        for (int x = 0; x < 60; x++) {
            System.out.println(this.getName()+"demo run---"+x);
        }
    }

    public static void main(String[] args) {
        Demo d = new Demo();//创建一个线程
        d.start();//开启线程，并执行该线程的run方法
        d.run(); //仅仅是对象调用方法，而线程创建了但并没有运行
        for (int x = 0; x < 60; x++) {
            System.out.println("Hello World---"+x);
        }
    }
}
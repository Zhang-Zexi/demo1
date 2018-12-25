package com.zzx.problem.SimpleSinglon;

/**
 * @ClassName Run
 * @Description 一个简单的单例类的实现
 * @Author zhangzx
 * @Date 2018/12/25 16:06
 * Version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
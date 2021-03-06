package com.zzx.demo.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *@Description TODO 可变尺寸的线程池
 *@Author zhangzx
 *Version 1.0
 **/
public class NewCachedThreadPool {

    public static void main(String[] args) {
// 可根据需要创建新线程的线程池，但是在以前构造的线程可用时将重用它们。
        ExecutorService pool = Executors.newCachedThreadPool();
        Thread t1 = new MyThread2();
        Thread t2 = new MyThread2();
        Thread t3 = new MyThread2();
        Thread t4 = new MyThread2();
        Thread t5 = new MyThread2();

        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);

        pool.shutdown();
    }
}

class MyThread2 extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在执行。。。");
    }
}

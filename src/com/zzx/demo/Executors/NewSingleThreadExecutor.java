package com.zzx.demo.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *@Description TODO 单任务线程池
 *@Author zhangzx
 *Version 1.0
 **/
public class NewSingleThreadExecutor {

    public static void main(String[] args) {
        // 每次调用execute方法，其实最后都是调用了thread-1的run方法。
        ExecutorService pool = Executors.newSingleThreadExecutor();
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread1();
        Thread t3 = new MyThread1();
        Thread t4 = new MyThread1();
        Thread t5 = new MyThread1();

        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);

        pool.shutdown();
    }
}

class MyThread1 extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在执行。。。");

    }
}

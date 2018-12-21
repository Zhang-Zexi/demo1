package com.zzx.demo.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *@Description TODO 延迟连接池
 *@Author zhangzx
 *Version 1.0
 **/
public class NewScheduledThreadPool {

    public static void main(String[] args) {
// 可根据需要创建新线程的线程池，但是在以前构造的线程可用时将重用它们。
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);
        Thread t1 = new MyThread3();
        Thread t2 = new MyThread3();
        Thread t3 = new MyThread3();
//        Thread t4 = new MyThread3();
//        Thread t5 = new MyThread3();

        pool.execute(t1);
        pool.schedule(t2, 1000, TimeUnit.MILLISECONDS);
        pool.schedule(t3, 10, TimeUnit.MILLISECONDS);
//        pool.execute(t4);
//        pool.execute(t5);

        pool.shutdown();
    }
}

class MyThread3 extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在执行。。。");
    }
}

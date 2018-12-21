package com.zzx.demo.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *@Description TODO 固定大小的线程池
 *@Author zhangzx
 *Version 1.0
 **/
public class NewFixedThreadPool {

    public static void main(String[] args) {
// newFixedThreadPool的参数指定了可以运行的线程的最大数目，超过这个数目的线程加进去以后，不会运行。其次，加入线程池的线程属于托管状态，线程的运行不受加入顺序的影响。
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        Thread t3 = new MyThread();
        Thread t4 = new MyThread();
        Thread t5 = new MyThread();

        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);

        pool.shutdown();
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在执行。。。");
    }
}

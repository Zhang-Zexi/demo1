package com.zzx.lock;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Test03
 * @Description lockInterruptibly()响应中断
 * @Author zhangzx
 * @Date 2019/8/12 16:09
 * Version 1.0
 **/
public class Test03 {
    private ArrayList<Integer> arrayList = new ArrayList<>();
    Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Test03 test = new Test03();
        MyThread thread1 = new MyThread(test);
        MyThread thread2 = new MyThread(test);
        thread1.start();
        thread2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.interrupt();
    }

    public void insert(Thread thread) throws InterruptedException{
        lock.lockInterruptibly();
        try {
            System.out.println(thread.getName() + "得到了锁");
            long startTime = System.currentTimeMillis();
            for ( ; ;) {
                if (System.currentTimeMillis() - startTime >= Integer.MAX_VALUE)
                    break;
            }
        } catch (Exception e) {

        } finally {
            System.out.println(Thread.currentThread().getName() + "执行finally");
            lock.unlock();
            System.out.println(thread.getName() + "释放锁");
        }
    }
}

class MyThread extends Thread {
    private Test03 test = null;

    public MyThread(Test03 test) {
        this.test = test;
    }

    @Override
    public void run() {
        try {
            test.insert(Thread.currentThread());
        } catch (Exception e) {
            System.out.println(Thread.currentThread().getName() + "被中断");
        }
    }
}


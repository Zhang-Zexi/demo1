package com.zzx.thread.synchronizeddemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName SynchronizedThread
 * @Description 线程同步运用
 * @Author zhangzx
 * @Date 2019/8/30 16:23
 * Version 1.0
 **/
class Bank {
    //        private volatile int account = 100;
//    private int account = 100;
    // 需要声明可重入锁
//        private Lock lock = new ReentrantLock();
    private static ThreadLocal<Integer> account = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 100;
        }
    };

    public void save(int money) {
        account.set(account.get() + money);
    }

    public int getAccount() {
        return account.get();
    }

    // 这里不需要synchorinzed
//    public void save(int money) {
//        lock.lock();// 加锁
//        try {
//            account += money;
//        } finally {
//            lock.unlock();// 释放锁
//        }
//    }
//
//    // 同步代码块实现
//    public void save1(int money) {
//        synchronized (this) {
//            account += money;
//        }
//    }
}
public class SynchronizedThread {

    class NewThread implements Runnable {
        private Bank bank;

        public NewThread(Bank bank) {
            this.bank = bank;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                bank.save(10);
//                bank.save1(10);
                System.out.println(i + "账户余额为：" + bank.getAccount());
            }
        }
    }

    // 建立线程，调用内部类
    public void userThread() {
        Bank bank = new Bank();
        NewThread newThread = new NewThread(bank);
        System.out.println("线程1");
        Thread thread1 = new Thread(newThread);
        thread1.start();
        System.out.println("线程2");
        Thread thread2 = new Thread(newThread);
        thread2.start();
    }

    public static void main(String[] args) {
        SynchronizedThread st = new SynchronizedThread();
        st.userThread();
    }
}

package com.zzx.thread.synchronizeddemo4;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Bank
 * @Description 銀行存款實例
 * @Author zhangzx
 * @Date 2019/9/2 10:07
 * Version 1.0
 **/
class Bank {
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

    public void userThread() {
        Bank bank = new Bank();

        MybanRunnable my1 = new MybanRunnable(bank);
        System.out.println("线程1");
        Thread th1 = new Thread(my1);
        th1.start();
        System.out.println("线程2");
        Thread th2 = new Thread(my1);
        th2.start();
    }
}

package com.zzx.thread.synchronizeddemo2;

/**
 * @ClassName Bank
 * @Description 銀行存款實例
 * @Author zhangzx
 * @Date 2019/9/2 10:07
 * Version 1.0
 **/
class Bank {
    private volatile int account = 100;

    public int getAccount() {
        return account;
    }

    // 同步方法
    public void save(int money) {
        account += money;
    }

    public void save1(int money) {
        //同步代碼塊
        synchronized (this) {// 锁定当前对象
            account += money;
        }
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

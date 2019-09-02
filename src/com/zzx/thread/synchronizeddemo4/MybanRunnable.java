package com.zzx.thread.synchronizeddemo4;

/**
 * @ClassName MybanRunnable
 * @Description
 * @Author zhangzx
 * @Date 2019/9/2 10:07
 * Version 1.0
 **/
public class MybanRunnable implements Runnable {

    private Bank bank;

    public MybanRunnable(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i ++) {
            bank.save(100);
            System.out.println(Thread.currentThread().getName() + "账户余额是---" + bank.getAccount());
        }
    }
}

package com.zzx.deadlock;

import com.zzx.problem.SimpleSinglon.MyObject;

/**
 * @ClassName DeadLockDemo
 * @Description
 * @Author zhangzx
 * @Date 2019/8/29 10:42
 * Version 1.0
 **/
// 定义锁对象
class MyLock {
    public static final Object objA = new Object();
    public static final Object objB = new Object();
}

// 定义Thread类的run方法
class DeadLock extends Thread {
    // 定义一个flag变量，用来标记此时持有的是哪个锁
    private boolean flag;

    public DeadLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag) {
            synchronized (MyLock.objA) {
                System.out.println("if objA");
                synchronized (MyLock.objB) {
                    System.out.println("if objB");
                }
            }
        } else {
            synchronized (MyLock.objB) {
                System.out.println("if objB");
                synchronized (MyLock.objA) {
                    System.out.println("if objA");
                }
            }
        }
    }
}

public class DeadLockDemo {

    public static void main(String[] args) {
        DeadLock d1 = new DeadLock(true);
        DeadLock d2 = new DeadLock(false);

        d1.start();
        d2.start();
    }
}

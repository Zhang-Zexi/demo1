package com.zzx.lock;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Test02
 * @Description tryLock方法的使用
 * @Author zhangzx
 * @Date 2019/8/12 16:09
 * Version 1.0
 **/
public class Test02 {
    private ArrayList<Integer> arrayList = new ArrayList<>();
    Lock lock = new ReentrantLock();
    public static void main(String[] args) {
        Test02 test = new Test02();
        new Thread() {
            public void run () {
                test.insert(Thread.currentThread());
            }
        }.start();

        new Thread() {
            public void run() {
                test.insert(Thread.currentThread());
            }
        }.start();
    }

    private void insert(Thread thread) {
        if (lock.tryLock()) {
            try {
                System.out.println(thread.getName() + "得到了锁");
                for (int i = 0; i < 5; i++) {
                    arrayList.add(i);
                }
            } catch (Exception e) {
                //
            } finally {
                lock.unlock();
                System.out.println(thread.getName() + "释放了锁");
            }
        } else {
            System.out.println(thread.getName() + "获取锁失败");
        }
    }
}

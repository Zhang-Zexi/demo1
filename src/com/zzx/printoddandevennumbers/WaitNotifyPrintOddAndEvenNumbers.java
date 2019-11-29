package com.zzx.printoddandevennumbers;

/**
 * @ClassName WaitNotifyPrintOddAndEvenNumbers
 * @Description 复习用wait和notify打印奇偶数
 * @Author zhangzx
 * @Date 2019/11/29 17:01
 * Version 1.0
 **/
public class WaitNotifyPrintOddAndEvenNumbers {

    public static int count = 0;
    public final static Object lock = new Object();

    public static void main(String[] args) {
        new Thread(new TuringTool(), "偶数").start();
        new Thread(new TuringTool(), "奇数").start();
    }

    static class TuringTool implements Runnable {

        @Override
        public void run() {
            while (count  <= 100) {
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName() + ":" + count ++);
                    lock.notify();// 写在上面，是因为wait后，就不往下运行了
                    if (count <= 100) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}

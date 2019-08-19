package com.zzx.volatiledemo;

/**
 * @ClassName NoVisibility
 * @Description
 * @Author zhangzx
 * @Date 2019/8/19 15:14
 * Version 1.0
 **/
public class NoVisibility {
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
        @Override
        public void run() {
            while(!ready) {
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        new ReaderThread().start();
        number = 42;
        ready = true;
    }
}

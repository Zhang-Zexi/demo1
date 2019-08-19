package com.zzx.thread.localvariable;

/**
 * @ClassName Main
 * @Description
 * @Author zhangzx
 * @Date 2019/8/16 17:32
 * Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        OneNumber oneNumber = new OneNumber();
        AThread aThread = new AThread(oneNumber);
        BThread bThread = new BThread(oneNumber);
        aThread.start();
        bThread.start();
    }
}

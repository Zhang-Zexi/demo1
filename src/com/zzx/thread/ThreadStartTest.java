package com.zzx.thread;

/**
 * @ClassName ThreadStartTest
 * @Description
 * @Author zhangzx
 * @Date 2019/6/14 15:50
 * Version 1.0
 **/
public class ThreadStartTest {
    public static void main(String[] args) {
        Thread tt = new Thread();// 创建一个线程实例
        tt.start();  // 启动线程
    }
}
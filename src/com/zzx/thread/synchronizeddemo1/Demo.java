package com.zzx.thread.synchronizeddemo1;

import com.zzx.thread.synchronizeddemo.SynchronizedThread;

/**
 * @ClassName Demo
 * @Description
 * @Author zhangzx
 * @Date 2019/9/2 10:21
 * Version 1.0
 **/
public class Demo {
    public static void main(String[] args) {
        Bank bk = new Bank();
        bk.userThread();
    }
}

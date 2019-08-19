package com.zzx.thread.localvariable;

/**
 * @ClassName AThread
 * @Description
 * @Author zhangzx
 * @Date 2019/8/16 17:29
 * Version 1.0
 **/
public class AThread extends Thread {

    private OneNumber oneNumber;

    public AThread(OneNumber oneNumber) {
        this.oneNumber = oneNumber;
    }

    public void run () {
        oneNumber.receiverUserName("a");
    }
}

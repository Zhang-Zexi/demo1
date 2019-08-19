package com.zzx.thread.localvariable;

/**
 * @ClassName BThread
 * @Description
 * @Author zhangzx
 * @Date 2019/8/16 17:31
 * Version 1.0
 **/
public class BThread extends Thread {

    private OneNumber oneNumber;

    public BThread(OneNumber oneNumber) {
        this.oneNumber = oneNumber;
    }

    public void run () {
        oneNumber.receiverUserName("b");
    }
}

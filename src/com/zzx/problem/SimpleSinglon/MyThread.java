package com.zzx.problem.SimpleSinglon;

/**
 * @ClassName MyThread
 * @Description
 * @Author zhangzx
 * @Date 2018/12/25 16:05
 * Version 1.0
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}

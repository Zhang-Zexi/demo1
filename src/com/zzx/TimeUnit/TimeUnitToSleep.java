package com.zzx.TimeUnit;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName TimeUnitToSleep
 * @Description 休眠类
 * @Author zhangzx
 * @Date 2019/11/29 19:20
 * Version 1.0
 **/
public class TimeUnitToSleep implements Runnable{

    public static void main(String[] args) {
        new Thread(new TimeUnitToSleep()).start();
    }

    @Override
    public void run() {
        System.out.println("我要休眠了");
        try {
//            TimeUnit.SECONDS.sleep(5);
            TimeUnit.MILLISECONDS.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("休眠成功");
    }
}

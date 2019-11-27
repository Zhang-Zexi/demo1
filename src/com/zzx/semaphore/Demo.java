package com.zzx.semaphore;

import java.util.concurrent.Semaphore;

import static javafx.scene.input.KeyCode.R;

/**
 * @ClassName Demo
 * @Description
 * @Author zhangzx
 * @Date 2019/11/13 16:58
 * Version 1.0
 **/
public class Demo {
//
//    private Semaphore semaphore;
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        semaphore = new Semaphore(5);
//
//        for (int i = 0; i < 1000; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    showLog();
//                }
//            }).start();
//        }
//
//
//    }
//    private void showLog(){
//        try {
//            semaphore.acquire();
//            Log.i("xqxinfo","线程:"+Thread.currentThread().getName()+"执行了一个acquire请求操作");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        // 线程休眠1s
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        semaphore.release();
//        Log.i("xqxinfo","线程:"+Thread.currentThread().getName()+"执行了一个release请求操作");
//
//
//    }
}

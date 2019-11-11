package com.zzx.threadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @ClassName Demo
 * @Description
 * @Author zhangzx
 * @Date 2019/11/11 11:26
 * Version 1.0
 **/
public class Demo01 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
//        ExecutorService executorService2 = Executors.newFixedThreadPool(10);
//        ExecutorService executorService3 = Executors.newScheduledThreadPool(10);
        Future future = executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Asynchronous task");
            }
        });
        System.out.println("future.get()=" + future.get());
    }
}

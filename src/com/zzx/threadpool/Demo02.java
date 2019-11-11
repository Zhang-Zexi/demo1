package com.zzx.threadpool;

import java.util.concurrent.*;

/**
 * @ClassName Demo
 * @Description
 * @Author zhangzx
 * @Date 2019/11/11 11:26
 * Version 1.0
 **/
public class Demo02 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
//        ExecutorService executorService2 = Executors.newFixedThreadPool(10);
//        ExecutorService executorService3 = Executors.newScheduledThreadPool(10);
        Future future = executorService.submit(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("Asynchronous Callable");
                return "Callable Result";
            }
        });
        System.out.println("future.get()=" + future.get());
    }
}

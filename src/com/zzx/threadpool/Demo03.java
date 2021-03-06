package com.zzx.threadpool;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

/**
 * @ClassName Demo
 * @Description
 * @Author zhangzx
 * @Date 2019/11/11 11:26
 * Version 1.0
 **/
public class Demo03 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Set<Callable<String>> callables = new HashSet<Callable<String>>();

        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 1";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 2";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 3";
            }
        });

        String result = executorService.invokeAny(callables);

        System.out.println("result = " + result);

        executorService.shutdown();
    }
}

package com.zzx.threadpool;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

/**
 * @ClassName Demo
 * @Description
 * @Author zhangzx
 * @Date 2019/11/11 11:26
 * Version 1.0
 **/
public class Demo04 {

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

        List<Future<String>> result = executorService.invokeAll(callables);

        for (Future s : result) {
            System.out.println("result = " + s.toString());
        }


        executorService.shutdown();
    }
}

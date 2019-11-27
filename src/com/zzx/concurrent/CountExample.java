package com.zzx.concurrent;

import com.sun.istack.internal.logging.Logger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @ClassName CountExample
 * @Description
 * @Author zhangzx
 * @Date 2019/11/13 16:12
 * Version 1.0
 **/
public class CountExample {

    private static int threadTotal = 200;
    private static int clientTotal = 5000;
    private static long count = 0;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(threadTotal);
        for (int index = 0; index < clientTotal; index ++) {
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    add();
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }

    private static void add() {
    }
}

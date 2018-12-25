package com.zzx.problem.ProducerConsumer;

import com.zzx.problem.ProducerConsumer.Consumer;
import com.zzx.problem.ProducerConsumer.Producer;

import java.util.Vector;

/**
 * @ClassName ProducerConsumerSolution
 * @Description 如何用wait-notify解决生产者消费者问题
 * @Author zhangzx
 * @Date 2018/12/25 15:20
 * Version 1.0
 **/
public class ProducerConsumerSolution {

    public static void main(String[] args) {
        Vector sharedQueue = new Vector();
        int size = 4;
        Thread prodThread = new Thread(new Producer(sharedQueue, size), "Producer");
        Thread consThread = new Thread(new Consumer(sharedQueue, size), "Consumer");
        prodThread.start();
        consThread.start();
    }
}

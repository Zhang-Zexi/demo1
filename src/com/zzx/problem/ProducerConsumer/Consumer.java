package com.zzx.problem.ProducerConsumer;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @ClassName Consumer
 * @Description 消费者
 * @Author zhangzx
 * @Date 2018/12/25 15:03
 * Version 1.0
 **/
public class Consumer implements  Runnable{

    private final Vector sharedQueue;
    private final int SIZE;

    public Consumer(Vector sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        SIZE = size;
    }

    @Override
    public void run() {
        while(true) {
            try {
                System.out.println("Consumer:" + consume());
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private int consume() throws InterruptedException {

        while (sharedQueue.isEmpty()) {
            synchronized (sharedQueue) {
                System.out.println("Queue is Empty ," + Thread.currentThread().getName() +
                        " is waiting , size: " + sharedQueue.size());
                sharedQueue.wait();
            }
        }

        synchronized (sharedQueue) {
            sharedQueue.notifyAll();
            return (Integer) sharedQueue.remove(0);
        }
    }
}

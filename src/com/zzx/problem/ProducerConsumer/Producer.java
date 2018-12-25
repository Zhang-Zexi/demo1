package com.zzx.problem.ProducerConsumer;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @ClassName Producer
 * @Description 消费者
 * @Author zhangzx
 * @Date 2018/12/25 14:34
 * Version 1.0
 **/
public class Producer implements Runnable{

    private final Vector sharedQueue;
    private final int SIZE;

    public Producer(Vector sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        SIZE = size;
    }

    @Override
    public void run() {
        for(int i = 0; i < 7; i++) {
            System.out.println("Produced:" + i);
            try {
                produce(i);
            }catch(InterruptedException  ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private void produce(int i) throws InterruptedException {

        //wait if queue is full
        while(sharedQueue.size() == SIZE) {
            // 如果线程区满了，线程等待
            synchronized (sharedQueue) {
                System.out.println("Queue is full ," + Thread.currentThread().getName()+
                        " is waiting, size: "+ sharedQueue.size());
                sharedQueue.wait();
            }
        }
       // 线程区未满，线程唤醒
        synchronized (sharedQueue) {
            sharedQueue.add(i);
            sharedQueue.notifyAll();
        }
    }
}

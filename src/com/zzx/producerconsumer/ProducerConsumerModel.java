package com.zzx.producerconsumer;

import com.zzx.problem.SimpleSinglon.Run;
import java.util.*;

/**
 * @ClassName ProducerConsumerModel
 * @Description 生产者消费者例子复习
 * @Author zhangzx
 * @Date 2019/11/29 15:21
 * Version 1.0
 **/
public class ProducerConsumerModel {

    public static void main(String[] args) {
        EventStorage eventStorage = new EventStorage();
        Producer producer = new Producer(eventStorage);
        Consumer consumer = new Consumer(eventStorage);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

class Producer implements Runnable{

    private EventStorage storage;

    public Producer(EventStorage eventStorage) {
        this.storage = eventStorage;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i ++) {
                storage.put();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable{

    private EventStorage storage;

    public Consumer(EventStorage eventStorage) {
        this.storage = eventStorage;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i ++) {
                storage.take();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class EventStorage {

    private int maxSize;
    private LinkedList<Date> storage;

    public EventStorage() {
        this.maxSize = 10;
        this.storage = new LinkedList<>();
    }

    public synchronized void put() throws InterruptedException {
        while (storage.size() == maxSize) {
            wait();
        }
        storage.add(new Date());
        System.out.println("当前仓库的个数" + storage.size());
        notify();
    }

    public synchronized void take() throws InterruptedException {
        while (storage.size() == 0) {
            wait();
        }
        storage.remove();
        System.out.println("当前仓库的个数" + storage.size());
        notify();
    }
}


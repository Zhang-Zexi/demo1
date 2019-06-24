package com.zzx.thread;

/*
 * 需求:简易买票程序,多个窗口同时卖票
 */
public class Ticket implements Runnable {
    private static int tick = 100;
    Object obj = new Object();
    boolean flag=true;

    public void run() {
        if(flag){
            while (true) {
                synchronized (Ticket.class) {
                    if (tick > 0) {
                        System.out.println(Thread.currentThread().getName()
                                + "code:" + tick--);
                    }
                }
            }
        }else{
            while(true){
                show();
            }
        }

    }

    public static synchronized void show() {
        if (tick > 0) {
            System.out.println(Thread.currentThread().getName() + "show:"
                    + tick--);
        }
    }

}

class ThisLockDemo {
    public static void main(String[] args) {
        Ticket t = new Ticket();

        Thread t1 = new Thread(t);
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            // TODO: handle exception
        }
        t.flag=false;
        Thread t2 = new Thread(t);
        //Thread t3 = new Thread(t);
        //Thread t4 = new Thread(t);

        t1.start();
        t2.start();
        //t3.start();
        //t4.start();
    }
}
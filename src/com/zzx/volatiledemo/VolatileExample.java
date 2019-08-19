package com.zzx.volatiledemo;

/**
 * @ClassName Example
 * @Description volatile变量的使用
 * @Author zhangzx
 * @Date 2019/8/19 11:45
 * Version 1.0
 **/
class Example {
    private volatile boolean stop = false;
    public void execute() {
        int i = 0;
        System.out.println("thread1 start loop.");
        while(!getStop()) {
            i ++;
        }
        System.out.println("thread1 finish loop, i=" + i);
    }

    public boolean getStop() {
        return stop; // 对普通变量的读
    }

    public void setStop(boolean flag) {
        this.stop = flag; // 对普通变量的写
    }
}

public class VolatileExample {
    public static void main(String[] args) throws Exception {
        final Example example = new Example();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                example.execute();
            }
        });
        t1.start();

        Thread.sleep(1000);
        System.out.println("主线程即将置stop为true...");
        example.setStop(true);
        System.out.println("主线程已将stop值为："+ example.getStop());
        System.out.println("主线程等待线程1执行完...");

        t1.join();
        System.out.println("线程1已经执行完毕，整个流程结束...");
    }

}

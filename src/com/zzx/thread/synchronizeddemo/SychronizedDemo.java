package com.zzx.thread.synchronizeddemo;

/**
 * @ClassName SychronizedDemo
 * @Description
 * @Author zhangzx
 * @Date 2019/8/30 15:59
 * Version 1.0
 **/
/*** 定义一个类，包含了线程类需要调用的方法 */
class Compute1{
    //通过同步代码块锁定object1对象进行锁定了其他同样的synchronized代码块
    private Object object1 = new Object();
    public void execute(){
        synchronized(object1){
            for(int i = 0; i<100; i++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("compute1:execute1 " + i++);
            }
        }
    }
    public synchronized void execute2(){
        synchronized(object1){
            for(int i = 0; i<100; i++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("compute1:execute2 " + i++);
            }
        }
    }
}
public class SychronizedDemo {

    public static void main(String[] args) {
        Compute1 compute1 = new Compute1();
        compute1.execute();
        compute1.execute2();
    }
}

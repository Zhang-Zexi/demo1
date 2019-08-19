package com.zzx.staticcodedemo;

/**
 * @ClassName StaticTest02
 * @Description
 * @Author zhangzx
 * @Date 2019/8/19 19:18
 * Version 1.0
 **/
class StaticDemo02 {

    static {
        System.out.println("父类静态代码块被执行");
    }

    void show() {
        System.out.println("父类方法被执行");
    }
}
public class StaticTest02 extends StaticDemo02 {

    static {
        System.out.println("子类静态代码块被执行");
    }

    void show() {
        System.out.println("子类方法被执行");
    }

    public static void main(String[] args) {
        System.out.println("main函数");
        StaticTest02 staticTest02 = new StaticTest02();
    }
}

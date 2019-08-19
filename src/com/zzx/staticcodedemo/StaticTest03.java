package com.zzx.staticcodedemo;

/**
 * @ClassName StaticTest03
 * @Description
 * @Author zhangzx
 * @Date 2019/8/19 19:29
 * Version 1.0
 **/
class StaticDemo03 {

    static {
        System.out.println("父类静态代码块被执行");
    }

    {
        System.out.println("父类非静态代码块被执行");
    }

    StaticDemo03() {
        System.out.println("父类构造方法被执行");
    }
}
public class StaticTest03 extends StaticDemo03{

    static {
        System.out.println("子类的静态代码块被执行");
    }

    {
        System.out.println("子类的非静态代码块被执行");
    }

    StaticTest03() {
        System.out.println("子类构造方法被执行");
    }

    public static void main(String[] args) {
        System.out.println("main函数");
        new StaticTest03();
    }
}

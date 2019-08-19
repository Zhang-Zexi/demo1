package com.zzx.staticcodedemo;

/**
 * @ClassName StaticDemo
 * @Description 静态代码块
 * @Author zhangzx
 * @Date 2019/8/19 18:03
 * Version 1.0
 **/
class StaticDemo {

    static {
        System.out.println("静态代码块被执行");
    }

    void show() {
        System.out.println("方法被执行");
    }
}

public class StaticTest {
    // 静态代码块的特点：随着类的加载而加载，且执行一次
    public static void main(String[] args) {
        new StaticDemo().show();
        new StaticDemo().show();
    }
}

package com.zzx.staticcodedemo;

/**
 * @ClassName StaticTest01
 * @Description  静态代码块是先于main执行的
 * @Author zhangzx
 * @Date 2019/8/19 18:09
 * Version 1.0
 **/
public class StaticTest01 {

    static {
        System.out.println("a");
    }

    public static void main(String[] args) {

        System.out.println("b");
    }
}

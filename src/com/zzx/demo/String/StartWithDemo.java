package com.zzx.demo.String;

/**
 * @ClassName StartWithDemo
 * @Description startWith()方法检测字符串是否以指定前缀开始
 * @Author zhangzx
 * @Date 2018/12/26 16:53
 * Version 1.0
 **/
public class StartWithDemo {

    public static void main(String[] args) {

        String Str = new String("zzx is hero");

        System.out.println("返回值：");
        System.out.println(Str.startsWith("zzx"));

        System.out.println("返回值：");
        System.out.println(Str.startsWith("is"));

        System.out.println("返回值：");
        System.out.println(Str.startsWith("is", 4));
    }
}

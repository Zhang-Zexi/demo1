package com.zzx.demo.fatherandboy;

/**
 * @ClassName Son
 * @Description 通过继承实现功能
 * @Author zhangzx
 * @Date 2019/11/27 14:36
 * Version 1.0
 **/
public class Son extends Father{

    public static void main(String[] args) {
        Son son = new Son();
        String result = son.work();
        System.out.println(result);
    }
}

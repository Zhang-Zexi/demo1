package com.zzx.problem.SimpleSinglon;

/**
 * @ClassName MyObject
 * @Description
 * @Author zhangzx
 * @Date 2018/12/25 16:03
 * Version 1.0
 **/
public class MyObject {
    // 立即加载方式==恶汉模式
    private static MyObject myObject = new MyObject();

    private MyObject() {
    }

    public static MyObject getInstance() {
        // 此代码版本为立即加载
        // 此版本代码的缺点是不能有其他实例变量
        // 因为getInstance()方法没有同步
        // 所以有可能出现非线程安全的问题
        return myObject;
    }
}

package com.zzx.proxydynamic;

/**
 * @ClassName MonitorUtil
 * @Description
 * @Author zhangzx
 * @Date 2019/11/12 15:55
 * Version 1.0
 **/
public class MonitorUtil {

    private static ThreadLocal<Long> tl = new ThreadLocal<>();

    public static void start() {
        tl.set(System.currentTimeMillis());
    }

    //结束时打印耗时
    public static void finish(String methodName) {
        long finishTime = System.currentTimeMillis();
        System.out.println(methodName + "方法耗时" + (finishTime - tl.get()) + "ms");
    }
}

package com.zzx.overrideload;

/**
 * @ClassName Demo
 * @Description 方法重载的复习
 * @Author zhangzx
 * @Date 2019/8/13 11:49
 * Version 1.0
 **/
public class Demo {
    public static void main(String[] args) {
        int sum = sum(10, 10);
        System.out.println(sum);
        double a = 1.0;
        double b = 2.0;
        double sum1 = sum(a, b);
        System.out.println(sum1);
    }

    static int sum(int a, int b) {
        if (a != 0 || b != 0)
            return a + b;
        return 0;
    }

    static double sum(double a, double b) {
        return a + b;
    }
}

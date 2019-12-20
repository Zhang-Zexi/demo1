package com.zzx.javabased.yh;

/**
 * @ClassName Test
 * @Description 异或运算符的使用
 * @Author zhangzx
 * @Date 2019/12/20 14:54
 * Version 1.0
 **/
public class Test {

    public void test2() {
        int a=2;
        int b=3;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a="+a+",b="+b);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.test2();
    }

}

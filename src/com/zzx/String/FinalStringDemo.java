package com.zzx.String;

/**
 * @ClassName FinalStringDemo
 * @Description Final类型的String字符串拼接
 * @Author zhangzx
 * @Date 2019/12/16 17:48
 * Version 1.0
 **/
public class FinalStringDemo {

    public static void main(String[] args) {
        final String a = "zhangzx";
        final String b = " is becoming better";
        String c = a + b;
        System.out.println(c);
    }
}

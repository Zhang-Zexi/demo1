package com.zzx.arrays;

import java.io.UnsupportedEncodingException;

/**
 * @ClassName Demo02
 * @Description
 * @Author zhangzx
 * @Date 2019/8/20 14:34
 * Version 1.0
 **/
public class Demo02 {

    public static String reverse(String originStr) {
        if (originStr == null || originStr.length() <= 1) {
            return originStr;
        }
//        System.out.println(originStr.substring(1));
//        System.out.println(originStr.charAt(0));
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }

    public static void main(String[] args) throws Exception {
//        String s1 = "你好";
//        String s2 = new String(s1.getBytes("GB2312"), "ISO-8859-1");
//        System.out.println(s2);

        String s3 = "ABCDEFG";
        System.out.println(reverse(s3));
    }
}

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

    public static void main(String[] args) throws Exception {
        String s1 = "你好";
        String s2 = new String(s1.getBytes("GB2312"), "ISO-8859-1");
        System.out.println(s2);
    }
}

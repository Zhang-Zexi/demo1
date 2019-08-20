package com.zzx.finallydemo;

/**
 * @ClassName Demo01
 * @Description
 * @Author zhangzx
 * @Date 2019/8/20 11:55
 * Version 1.0
 **/
public class Demo01 {

    public static void main(String[] args) {

        System.out.println("00000000000");

        try {
            System.out.println("11111111");

        } catch (Exception e) {

        } finally {
            System.out.println("222222222222222");
        }

        System.out.println("33333333333333333333");
    }
}

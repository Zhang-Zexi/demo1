package com.zzx.demo.BoxingDemo;

/**
 * @ClassName BoxingDemo
 * @Description 研究==的用法
 * @Author zhangzx
 * @Date 2019/1/2 20:38
 * Version 1.0
 **/
public class BoxingDemo {

    public static void main(String[] args) {
        System.out.println(new Integer(2) == 2 );
        System.out.println(new Integer(2) == new Integer(2));
        System.out.println(Integer.valueOf(1000) == Integer.valueOf(1000));
        System.out.println(Integer.valueOf(2) == Integer.valueOf(2));
        System.out.println(Integer.valueOf(2).intValue() == 2);
        System.out.println(new Integer(2).equals(new Integer(2)));
    }
}

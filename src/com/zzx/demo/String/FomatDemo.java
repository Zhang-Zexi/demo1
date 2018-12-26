package com.zzx.demo.String;

/**
 * @ClassName FomatDemo
 * @Description %06d的使用方式
 * @Author zhangzx
 * @Date 2018/12/26 11:02
 * Version 1.0
 **/
public class FomatDemo {
    /**
     * %06d :
     * %是格式化输入接受参数的标记
     * 0格式化命令：结果将用0填充
     * 6：填充位数
     * d：代表十进制 数据
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("%06d", i));
        }
    }
}

package com.zzx.demo.Math;

/**
 * @ClassName CompareTo
 * @Description TODO
 * @Author zhangzx
 * @Date 2018/12/21 14:12
 * Version 1.0
 **/

//compareTo() 方法用于将 Number 对象与方法的参数进行比较。可用于比较 Byte, Long, Integer等。
//该方法用于两个相同数据类型的比较，两个不同类型的数据不能用此方法来比较。
public class CompareTo {
    public static void main(String[] args) {
        Integer x = 6;
        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(6));
        System.out.println(x.compareTo(9));
    }
}

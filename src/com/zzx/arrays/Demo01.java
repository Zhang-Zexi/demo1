package com.zzx.arrays;

import java.util.Arrays;

/**
 * @ClassName Demo01
 * @Description
 * @Author zhangzx
 * @Date 2019/8/19 19:56
 * Version 1.0
 **/
public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        int[] copied = new int[10];
//        System.arraycopy(arr, 0, copied, 1, 5);
//        System.out.println(Arrays.toString(copied));

//        int[] copied = Arrays.copyOf(arr, 10);2
//        System.out.println(Arrays.toString(copied));
        int[] copied = Arrays.copyOf(arr,3);
        System.out.println(Arrays.toString(copied));
    }
}

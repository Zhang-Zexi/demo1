package com.zzx.collections;

import java.util.Arrays;
import java.util.Collections;

/**
 * @ClassName Main
 * @Description Collections的最大最小值
 * @Author zhangzx
 * @Date 2019/8/14 15:11
 * Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {8, 7, 5, 4, 9, 2, 1};
        int max = Collections.max(Arrays.asList(numbers));
        int min = Collections.min(Arrays.asList(numbers));
        System.out.println(max);
        System.out.println(min);
    }
}

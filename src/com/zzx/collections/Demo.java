package com.zzx.collections;

import java.util.*;

/**
 * @ClassName Demo
 * @Description Collections的两种用法
 * @Author zhangzx
 * @Date 2019/8/14 11:15
 * Version 1.0
 **/
public class Demo {
    static List<Integer> list = Arrays.asList(2, 3, 1);

    private static void sort1() {
        System.out.println("before sort:");
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println("===========================");
        Collections.sort(list);
        System.out.println("after sort:");
        System.out.println(Arrays.toString(list.toArray()));
    }

    private static void sort2() {
        System.out.println("before sort:");
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println("==========================");
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println("after sort:");
        System.out.println(Arrays.toString(list.toArray()));

    }
    public static void main(String[] args) {
//        sort1();
        sort2();
    }
}

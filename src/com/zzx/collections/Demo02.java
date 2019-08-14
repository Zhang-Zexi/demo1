package com.zzx.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @ClassName Demo02
 * @Description Collections的reverse()
 * @Author zhangzx
 * @Date 2019/8/14 14:40
 * Version 1.0
 **/
public class Demo02 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i ++) {
            arrayList.add(i);
        }
        System.out.println(Arrays.toString(arrayList.toArray()));
        Collections.reverse(arrayList);
        System.out.println(Arrays.toString(arrayList.toArray()));
    }
}

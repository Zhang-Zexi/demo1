package com.zzx.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MapDemo
 * @Description 遍历Map的方法
 * @Author zhangzx
 * @Date 2019/12/16 17:18
 * Version 1.0
 **/
public class MapDemo {

    public static void main(String[] args) throws InterruptedException {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>(30);
        for (int i = 0; i < 10; i ++) {
            hashMap.put(i, i);
        }
        System.out.println(hashMap);
        Thread.sleep(10000);
        for (Map.Entry map : hashMap.entrySet()) { // 最常用的一种遍历map的方法
            System.out.println(map);
        }
    }
}

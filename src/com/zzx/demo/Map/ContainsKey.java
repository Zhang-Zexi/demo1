package com.zzx.demo.Map;

import java.util.HashMap;
import java.util.Map;

public class ContainsKey {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("book", "程序员内功心法");
        map.put("computer", "外星人");
        map.put("school", "斯坦福");
        String key = "book";
        boolean contains = map.containsKey(key);
        if(contains == true) {
            System.out.println("程序员内功心法强大");
        }else {
            System.out.println("心法不足");
        }
    }
}

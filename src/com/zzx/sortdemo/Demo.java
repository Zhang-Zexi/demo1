package com.zzx.sortdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName Demo
 * @Description
 * @Author zhangzx
 * @Date 2019/11/5 10:59
 * Version 1.0
 **/
public class Demo {
    public static void main(String[] args) {
//        List<String> list1 = new ArrayList<>();
//        list1.add("3");
//        list1.add("4");
//        list1.add("1");
//        list1.add("2");
//        System.out.println("排序前--:" + list1.toString());
//        Collections.sort(list1);
//        System.out.println("排序前后--:" + list1.toString());
        TestA testA1 = new TestA("老张", 3, false);
        TestA testA2 = new TestA("老李", 1,false);
        TestA testA3 = new TestA("老王", 2, false);
        List<TestA> list  = new ArrayList<>();
        list.add(testA1);
        list.add(testA2);
        list.add(testA3);
        System.out.println("排序前--:"+list.toString());
        Collections.sort(list, new Comparator<TestA>() {
            @Override
            public int compare(TestA o1, TestA o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });
        System.out.println("升序排序后--:"+list.toString());
    }
}

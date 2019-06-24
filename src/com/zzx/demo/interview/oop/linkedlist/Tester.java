package com.zzx.demo.interview.oop.linkedlist;

/**
 * @ClassName Tester
 * @Description
 * @Author zhangzx
 * @Date 2019/1/28 15:22
 * Version 1.0
 **/
public class Tester {

    public static void main(String[] args) {
        LinkedList list = LinkedList.newEmptyList();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        for (Integer value : list) {
            System.out.println(value);
        }

    }
}

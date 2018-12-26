package com.zzx.demo.List;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AddAllDemo
 * @Description addAll()使用
 * @Author zhangzx
 * @Date 2018/12/26 17:44
 * Version 1.0
 **/
public class AddAllDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("add" + "");
        System.out.println(""+list);
        for(int i=0; i<100; i++) {
            list.add(i + "");
        }
        System.out.println(list);
        list.add("add" + "");
        System.out.println("add" +"");


    }
}

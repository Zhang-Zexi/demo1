package com.zzx.memoryleak;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Demo
 * @Description
 * @Author zhangzx
 * @Date 2019/11/11 17:14
 * Version 1.0
 **/
public class Demo {

    static List<Object> list = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Object object = new Object();
            list.add(object);
            object = null;
        }
    }
}

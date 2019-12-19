package com.zzx.map.OverridehashCodeandequals1;

import java.util.HashMap;

/**
 * @ClassName Test
 * @Description 测试类
 * @Author zhangzx
 * @Date 2019/12/19 16:00
 * Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();
        //true
        System.out.println(student.equals(student2));
        //356573597
        System.out.println(student.hashCode());
        //1735600054
        System.out.println(student2.hashCode());
        HashMap<Student, String> map = new HashMap<>(4);
        map.put(student,"123");
        map.put(student2,"456");
        System.out.println(map.get(student));
        System.out.println(map.get(student2));
    }
}


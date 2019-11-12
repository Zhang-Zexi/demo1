package com.zzx.hashcode;

/**
 * @ClassName Test
 * @Description
 * @Author zhangzx
 * @Date 2019/11/12 10:41
 * Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee("chenssy", 23);
        Employee e2 = new Employee("chenssy", 24);
        Person p1 = new Person("chenssy");
        System.out.println(p1.equals(e1));//true
        System.out.println(p1.equals(e2));//true
        System.out.println(e1.equals(e2));//false
    }
}


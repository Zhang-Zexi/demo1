package com.zzx.finalDemo;

/**
 * @ClassName Demo
 * @Description final关键字修饰对象
 * @Author zhangzx
 * @Date 2019/8/12 17:55
 * Version 1.0
 **/
public class Demo02 {
    public static void main(String[] args) {
        final Cat cat1 = new Cat(1);
        cat1.setAge(1);
        System.out.println(cat1.getAge());
    }
}

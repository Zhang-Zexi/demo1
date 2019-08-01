package com.zzx.reflex2;

import java.lang.reflect.Field;

/**
 * @ClassName Fields
 * @Description 反射-成员变量调用测试类
 * @Author zhangzx
 * @Date 2019/8/1 16:20
 * Version 1.0
 **/
public class Fields {

    public static void main(String[] args) throws Exception {
        // 1.获取Class对象
        Class stuClass = Class.forName("com.zzx.reflex2.Student");
        // 2.获取字段
        System.out.println("**********获取所有公有的字段************");
        Field[] fieldArray = stuClass.getFields();
        for (Field f : fieldArray) {
            System.out.println(f);
        }
        System.out.println("**********获取所有字段（包括私有、受保护、默认的）*********");
        fieldArray = stuClass.getDeclaredFields();
        for (Field f : fieldArray) {
            System.out.println(f);
        }

        System.out.println("*********获取共有字段并调用*************");
        Field f = stuClass.getField("name");
        System.out.println(f);
        // 获取一个对象
        Object obj = stuClass.getConstructor().newInstance();// 产生Student对象
        // 为字段设置值
        f.set(obj, "刘德华");
        // 验证
        Student stu = (Student) obj;
        System.out.println("验证姓名: " + stu);

        System.out.println("**************获取私有字段****并调用********************************");
        f = stuClass.getDeclaredField("phoneNum");
        System.out.println(f);
        f.setAccessible(true);//暴力反射，解除私有限定
        f.set(obj, "13723059988");
        System.out.println("验证电话：" + stu);
    }
}

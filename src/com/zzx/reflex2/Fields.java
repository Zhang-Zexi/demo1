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

/*
 * 获取成员变量并调用：
 *
 * 1.批量的
 *      1).Field[] getFields():获取所有的”公有字段”
 *      2).Field[] getDeclaredFields():获取所有字段，包括：私有、受保护、默认、公有；
 * 2.获取单个的：
 *      1).public Field getField(String fieldName):获取某个”公有的”字段；
 *      2).public Field getDeclaredField(String fieldName):获取某个字段(可以是私有的)
 *
 *   设置字段的值：
 *      Field –> public void set(object obj,object value):
 *                  参数说明：
 *                  1.obj:要设置的字段所在的对象；
 *                  2.value:要为字段设置的值；
 *
 */

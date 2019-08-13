package com.zzx.reflecxdemo;

/**
 * @ClassName classD
 * @Description
 * @Author zhangzx
 * @Date 2019/8/13 15:28
 * Version 1.0
 **/
public class classD {

    public static void main(String[] args) {
        //        System.out.println(classA.getClazzName());
        try {
            Class clazz = Class.forName("com.zzx.reflecxdemo.classA");
            duang duang = (duang) clazz.newInstance();
            System.out.println(duang.getClazzName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
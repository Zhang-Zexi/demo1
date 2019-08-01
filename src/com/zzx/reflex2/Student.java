package com.zzx.reflex2;

/**
 * @ClassName Student
 * @Description
 * @Author zhangzx
 * @Date 2019/8/1 16:16
 * Version 1.0
 **/
public class Student {

    public String name;

    protected int age;

    char sex;

    private String phoneNum;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}

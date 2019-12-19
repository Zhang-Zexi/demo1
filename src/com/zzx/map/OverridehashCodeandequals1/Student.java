package com.zzx.map.OverridehashCodeandequals1;

import java.util.Objects;

/**
 * @ClassName Student
 * @Description 定义一个简单的Student
 * @Author zhangzx
 * @Date 2019/12/19 15:57
 * Version 1.0
 **/
public class Student {

    private String name;
    private int age;
    private String QQ;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(QQ, student.QQ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, QQ);
    }

//    先上Objects.hash的源码，当equals为true，对象间的name、age、QQ这三个值必各自相等，
//    值相等的话基本数据类型和string引用类型的hashCode值也相等，返回的result就会一样。
//    public static int hashCode(Object a[]) {
//        if (a == null)
//            return 0;
//
//        int result = 1;
//
//        for (Object element : a)
//            result = 31 * result + (element == null ? 0 : element.hashCode());
//
//        return result;
//    }
}


package com.zzx.finalDemo;

/**
 * @ClassName Demo
 * @Description final关键字修饰对象
 * @Author zhangzx
 * @Date 2019/8/12 17:55
 * Version 1.0
 **/
public class Demo {
    public static void main(String[] args) {
        final Cat cat1 = new Cat(1);
        Cat cat2 = new Cat(2);
//        cat1 = cat2;
       // PS ： 使用final修饰的对象是无法更改引用的
    }
}

class Cat {
    private int id = 0;
    private int age = 0;

    Cat (int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
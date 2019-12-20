package com.zzx.javabased.yh;

/**
 * @ClassName HashMapTest
 * @Description HashMap中hash的异或操作
 * @Author zhangzx
 * @Date 2019/12/20 15:02
 * Version 1.0
 **/
public class HashMapTest {
    public static void main(String[] args) {

        int i  = "yang".hashCode();
        System.out.println(i);

        System.out.println(i+" >>> 16 = "+( "yang".hashCode()>>>16));
        int off = i^(i>>>16);
        System.out.println(off);
    }
}

//没有lombok 可以自己敲set get construct
//@Data
//@AllArgsConstructor
//@ToString
class  Student{

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

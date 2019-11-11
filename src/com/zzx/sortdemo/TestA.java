package com.zzx.sortdemo;

/**
 * @ClassName TestA
 * @Description
 * @Author zhangzx
 * @Date 2019/11/5 11:04
 * Version 1.0
 **/
public class TestA {
    private String name;

    private Integer age;

    private boolean gender;

    public TestA(String name, Integer age, boolean gender) {
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "TestA{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

//    @Override
//    public int compareTo(TestA o) {
//        return this.age.compareTo(o.getAge());
//    }
}

package com.zzx.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @ClassName UserBean
 * @Description
 * @Author zhangzx
 * @Date 2019/12/9 11:17
 * Version 1.0
 **/
public class UserBean implements Comparable<UserBean> {
    private String id;
    private String username;
    private Integer age;

    public UserBean(String id, String username, Integer age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(UserBean o) {
        if (this.age > o.getAge()) {
            return 1;
        } else if(this.age < o.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        UserBean[] array = new UserBean[3];
        array[0] = new UserBean("1","zhangsan",11);
        array[1] = new UserBean("2","lisi",12);
        array[2] = new UserBean("3","wangwu",13);
//        Arrays.sort(array);// 想要使用这个方法对对象进行排序，必须在对象类里继承Comparable
        Arrays.sort(array,(o1, o2) -> {
            if (o1.getAge() > o2.getAge()) {
                return 1;
            } else {
                return -1;
            }
        });
        System.out.println(Arrays.toString(array));
    }
}

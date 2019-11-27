package com.zzx.demo.fatherandboy;

/**
 * @ClassName Daughter
 * @Description 通过接口实现功能
 * @Author zhangzx
 * @Date 2019/11/27 14:43
 * Version 1.0
 **/
public class Daughter implements Mother{

    public static void main(String[] args) {
        Mother mother = new Father();
        String result = ((Father) mother).work();
        System.out.println(result);
    }
}

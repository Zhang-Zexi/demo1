package com.zzx.demo.fatherandboy;

/**
 * @ClassName Father
 * @Description
 * @Author zhangzx
 * @Date 2019/11/27 14:35
 * Version 1.0
 **/
public class Father implements Mother{

    public String work() {
        System.out.println("我可以工作");
        return "success";
    }
}

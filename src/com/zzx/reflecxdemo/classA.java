package com.zzx.reflecxdemo;

/**
 * @ClassName classA
 * @Description
 * @Author zhangzx
 * @Date 2019/8/13 15:28
 * Version 1.0
 **/
public class classA implements duang{
    @Override
    public String getClazzName() {
        return "A类" + this.getClass().getName();
    }
}
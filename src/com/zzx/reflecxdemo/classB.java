package com.zzx.reflecxdemo;

/**
 * @ClassName classB
 * @Description
 * @Author zhangzx
 * @Date 2019/8/13 15:30
 * Version 1.0
 **/
public class classB implements duang{
    @Override
    public String getClazzName() {
        return "B类"+this.getClass().getName();
    }
}

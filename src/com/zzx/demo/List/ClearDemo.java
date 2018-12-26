package com.zzx.demo.List;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ClearDemo
 * @Description list中clear()清空数据
 * @Author zhangzx
 * @Date 2018/12/26 17:31
 * Version 1.0
 **/
public class ClearDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("google");
        list.add("baidu");
        list.add("tencent");
        list.add("alibaba");
        System.out.println("未clear之前: "+list);
        list.clear();
        System.out.println("clear之后: "+list);
    }
}

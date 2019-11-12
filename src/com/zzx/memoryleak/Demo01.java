package com.zzx.memoryleak;

import java.util.HashSet;

/**
 * @ClassName Demo01
 * @Description
 * @Author zhangzx
 * @Date 2019/11/12 11:01
 * Version 1.0
 **/
public class Demo01 {
    public static void main(String[] args){
        HashSet<RectObject> set = new HashSet<RectObject>();
        RectObject r1 = new RectObject(3,3);
        RectObject r2 = new RectObject(5,5);
        RectObject r3 = new RectObject(3,3);
        set.add(r1);
        set.add(r2);
        set.add(r3);
        r3.y = 7;
        System.out.println("删除前的大小size:"+set.size());//3
        set.remove(r3);
        System.out.println("删除后的大小size:"+set.size());//3
    }
}

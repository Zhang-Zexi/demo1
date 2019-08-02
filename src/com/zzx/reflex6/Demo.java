package com.zzx.reflex6;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @ClassName Demo
 * @Description 通过反射越过泛型检查 例如：有一个String泛型的集合，怎样能向这个集合中添加一个Integer类型的值？
 * @Author zhangzx
 * @Date 2019/8/2 10:21
 * Version 1.0
 **/
public class Demo {

    public static void main(String[] args) throws Exception {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("aaa");
        strList.add("bbb");

        // 获取ArrayList的Class对象，反向调用add方法添加对象
        Class listClass = strList.getClass();
        Method m = listClass.getMethod("add", Object.class);
        m.invoke(strList,1111);

        for (Object obj : strList) {
            System.out.println(obj);
        }
    }
}

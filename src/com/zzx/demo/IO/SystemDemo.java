package com.zzx.demo.IO;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp;
import sun.security.smartcardio.SunPCSC;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

/**
 * @ClassName SystemDemo
 * @Description 获得系统时间
 * @Author zhangzx
 * @Date 2018/12/26 20:08
 * Version 1.0
 **/
public class SystemDemo {
//    Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {

        long time = System.currentTimeMillis();
        Long time2 = time;
//        long time1 = time;
        Date date = new Date(time2);
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(s.format(date));

        int age = 18;
        Integer age2 = age;
        System.out.println(age2);

        Integer age1 = 19;
        System.out.println(age1);
        int age3  = age1;
        System.out.println(age3);
        Integer age4 = Integer.valueOf(33);
        System.out.println(age4);
        Integer age5 = 144;
        System.out.println(age5);

        //
        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println(i1 == i2);
        Integer i3 = 200;
        Integer i4 = 200;
        System.out.println(i3 == i4);
    }
}

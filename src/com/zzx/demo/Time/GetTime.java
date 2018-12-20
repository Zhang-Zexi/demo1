package com.zzx.demo.Time;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTime {
    public static void main(String[] args) {
        Long a = System.currentTimeMillis();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        Date date = new Date(a);
        System.out.println(formatter.format(date));
    }



}

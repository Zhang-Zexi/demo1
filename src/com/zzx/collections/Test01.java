package com.zzx.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Test01
 * @Description
 * @Author zhangzx
 * @Date 2019/8/14 14:54
 * Version 1.0
 **/
public class Test01 {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        one.add("111");
        one.add("222");
        one.add("333");
        List<String> two = new ArrayList<>(Arrays.asList(new String[one.size()]));
        Collections.copy(two, one);
        System.out.println(Arrays.toString(two.toArray()));
    }
}

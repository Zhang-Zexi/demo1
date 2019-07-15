package com.zzx.set;

import java.util.*;

/**
 * @ClassName SetDemo
 * @Description
 * @Author zhangzx
 * @Date 2019/6/26 14:08
 * Version 1.0
 **/
public class SetDemo {
    // 探究Set的源码
    Set s = new LinkedHashSet();// 底层实现是LinkedHashMap()--HashMap()--数组+对象/LinkedList/NULL;
    Set s1 = new HashSet();
    Set s2 = new TreeSet();

}

package com.zzx.hashcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName HashTest
 * @Description
 * @Author zhangzx
 * @Date 2019/11/12 14:21
 * Version 1.0
 **/
public class HashTest {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int hashCode() {
        return i % 10;
    }

    public final static void main(String[] args) {
        HashTest a = new HashTest();
        HashTest b = new HashTest();
        a.setI(1);
        b.setI(1);
        Set<HashTest> set = new HashSet<HashTest>();
        set.add(a);
        set.add(b);
        System.out.println(a.hashCode() == b.hashCode());
        System.out.println(a.equals(b));
        System.out.println(set);
    }
}

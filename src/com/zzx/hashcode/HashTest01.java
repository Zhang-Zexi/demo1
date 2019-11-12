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
public class HashTest01 {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof HashTest01)) {
            return false;
        }
        HashTest01 other = (HashTest01) object;
        if (other.getI() == this.getI()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return i % 10;
    }

    public final static void main(String[] args) {
        HashTest01 a = new HashTest01();
        HashTest01 b = new HashTest01();
        a.setI(1);
        b.setI(1);
        Set<HashTest01> set = new HashSet<HashTest01>();
        set.add(a);
        set.add(b);
        System.out.println(a.hashCode() == b.hashCode());
        System.out.println(a.equals(b));
        System.out.println(set);
    }
}
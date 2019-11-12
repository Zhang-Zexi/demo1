package com.zzx.hashcode;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @ClassName HashCodeTest
 * @Description
 * @Author zhangzx
 * @Date 2019/11/12 10:10
 * Version 1.0
 **/
public class HashCodeTest01 {
    public static void main(String[] args) {
        Collection set = new HashSet();
        Point1 p1 = new Point1(1, 1);
        Point1 p2 = new Point1(1, 1);

        System.out.println(p1.equals(p2));
        set.add(p1);   //(1)
        set.add(p2);   //(2)
        set.add(p1);   //(3)

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object);
        }
    }
}

class Point1 {
    private int x;
    private int y;

    public Point1(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "x:" + x + ",y:" + y;
    }
}


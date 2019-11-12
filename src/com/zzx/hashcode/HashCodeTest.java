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
public class HashCodeTest {
    public static void main(String[] args) {
        Collection set = new HashSet();
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 1);

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

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "x:" + x + ",y:" + y;
    }
}


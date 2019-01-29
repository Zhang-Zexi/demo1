package com.zzx.demo.interview.oop.linkedlist;

import com.zzx.demo.interview.common.Node;

import java.util.Iterator;

/**
 * @ClassName LinkedList
 * @Description
 * @Author zhangzx
 * @Date 2019/1/15 23:23
 * Version 1.0
 **/
public class LinkedList implements Iterable<Integer>{

    Node head;
    Node tail;

    public LinkedList() {
        head = null;
    }

    public void add(int value) {
        Node node = new Node(value);
        if(node == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
    }

//    class ListIterator implements Iterable<Integer> {
//
//        @Override
//        public boolean hasNext() {
//            return  false;
//        }
//        @Override
//        public Iterator next() {
//            return null;
//        }
//    }



    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}

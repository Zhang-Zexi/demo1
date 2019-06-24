package com.zzx.demo.interview.oop.linkedlist;

import com.zzx.demo.interview.common.Node;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @ClassName LinkedList
 * @Description
 * @Author zhangzx
 * @Date 2019/1/15 23:23
 * Version 1.0
 **/
public class LinkedList implements Iterable<Integer>{

    private Node head;
    private Node tail;

    public static LinkedList newEmptyList() {
        return new LinkedList();
    }

    public LinkedList() {
        head = null;
        tail = null;
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

    private class ListIterator implements Iterable<Integer> {
        private Node currenntNode;

        public ListIterator(Node head) {
            currenntNode = head;
        }

        public boolean hasNext() {
            return currenntNode != null;
        }

        public Integer next() {
            if (currenntNode == null) {
                throw new NoSuchElementException();
            }
            int value = currenntNode.getValue();
            currenntNode = currenntNode.getNext();
            return value;
        }

        @Override
        public Iterator<Integer> iterator() {
            return (Iterator<Integer>) new ListIterator(head);
        }
    }



    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}

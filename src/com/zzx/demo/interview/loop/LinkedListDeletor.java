package com.zzx.demo.interview.loop;

import com.zzx.demo.interview.common.Node;
import com.zzx.demo.interview.recusrion.LinkedListCreator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName LinkedListDeletor
 * @Description
 * @Author zhangzx
 * @Date 2019/1/29 16:06
 * Version 1.0
 **/
public class LinkedListDeletor {

    public Node deleteIfEquals(Node head, int value) {
        if (head == null) {
            return null;
        }
        Node prev = head;
        while(prev.getNext() != null) {
            if (prev.getNext().getValue() == value){
                prev.setNext(prev.getNext().getNext());
            } else {
                prev = prev.getNext();

            }
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListCreator creator = new LinkedListCreator();
        com.zzx.demo.interview.recusrion.LinkedListReverser reverser = new com.zzx.demo.interview.recusrion.LinkedListReverser();
        Node.printLinkeList(reverser.reverseLinkedList(
                creator.createdLinkedList(Arrays.asList(1, 2, 3, 2, 5))));
        Node.printLinkeList(reverser.reverseLinkedList(
                creator.createdLinkedList(Arrays.asList(1, 2, 3, 4, 5))));

    }
}

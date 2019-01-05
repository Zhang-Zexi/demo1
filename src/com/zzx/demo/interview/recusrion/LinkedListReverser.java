package com.zzx.demo.interview.recusrion;

import com.sun.scenario.effect.impl.state.LinearConvolveKernel;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName LinkedListReverser
 * @Description 链表的反转
 * @Author zhangzx
 * @Date 2019/1/5 16:24
 * Version 1.0
 **/
public class LinkedListReverser {

    public Node reverseLinkedList(Node head) {
        // size == 0 or size == 1
        if(head == null || head.getNext() == null){
            return head;
        }
        Node newHead = reverseLinkedList(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return newHead;
    }

    public static void main(String[] args) {
        LinkedListCreator creator = new LinkedListCreator();
        LinkedListReverser reverser = new LinkedListReverser();

        Node.printLinkeList(reverser.reverseLinkedList(
                creator.createdLinkedList(new ArrayList<>())));
        Node.printLinkeList(reverser.reverseLinkedList(
                creator.createdLinkedList(Arrays.asList(1))));
        Node.printLinkeList(reverser.reverseLinkedList(
                creator.createdLinkedList(Arrays.asList(1, 2, 3, 4, 5))));
    }
}

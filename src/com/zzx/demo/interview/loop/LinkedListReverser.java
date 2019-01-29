package com.zzx.demo.interview.loop;

import com.zzx.demo.interview.common.Node;
import com.zzx.demo.interview.recusrion.LinkedListCreator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName LinkedListReverser
 * @Description
 * @Author zhangzx
 * @Date 2019/1/29 14:33
 * Version 1.0
 **/
public class LinkedListReverser {

    public Node reverseLinkedList(Node head) {
        Node newHead = null;
        Node curHead = head;
        while(curHead != null) {
            Node next = curHead.getNext();
            curHead.setNext(newHead);
            newHead = curHead;
            curHead = next;
        }
        return newHead;

    }

    public static void main(String[] args) {

        LinkedListCreator creator = new LinkedListCreator();
        com.zzx.demo.interview.recusrion.LinkedListReverser reverser = new com.zzx.demo.interview.recusrion.LinkedListReverser();
        Node.printLinkeList(reverser.reverseLinkedList(
                creator.createdLinkedList(new ArrayList<>())));
        Node.printLinkeList(reverser.reverseLinkedList(
                creator.createdLinkedList(Arrays.asList(1))));
        Node.printLinkeList(reverser.reverseLinkedList(
                creator.createdLinkedList(Arrays.asList(1, 2, 3, 4, 5))));
    }
}

package com.zzx.demo.interview.recusrion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName LinkedListCreator
 * @Description 链表相关demo
 * @Author zhangzx
 * @Date 2019/1/5 14:20
 * Version 1.0
 **/
public class LinkedListCreator {

    /**
     * create a link list.
     * @param data
     * @return head of the linked list
     */
    public Node createdLinkedList(List<Integer> data) {
        if(data.isEmpty()) {
            return null;
        }
        Node firstNode = new Node(data.get(0));
        firstNode.setNext(createdLinkedList(data.subList(1, data.size())));
        return firstNode;
    }

    public static void main(String[] args) {

        LinkedListCreator creator = new LinkedListCreator();

        Node.printLinkeList(creator.createdLinkedList(new ArrayList<>()));
        Node.printLinkeList(creator.createdLinkedList(Arrays.asList(1)));
        Node.printLinkeList(creator.createdLinkedList(Arrays.asList(1, 2, 3, 4, 5)));

    }
}

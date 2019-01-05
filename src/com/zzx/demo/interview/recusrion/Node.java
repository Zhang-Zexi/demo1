package com.zzx.demo.interview.recusrion;

/**
 * @ClassName Node
 * @Description
 * @Author zhangzx
 * @Date 2019/1/5 14:21
 * Version 1.0
 **/
public class Node {
    // 我们想要value不能被改变，加final
    private final int value;
    private Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue(){
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public static void printLinkeList(Node head){
        while(head != null){
            System.out.print(head.getValue());
            System.out.print(" ");
            head = head.getNext();
        }
        System.out.println();
    }
}

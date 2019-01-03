package com.deshmukh.linkedlist;


public class SampleLinkedList {


    public LinkedListNode head;


    public static class LinkedListNode {

        int data;
        LinkedListNode next;

        LinkedListNode(int d) {
            this.data = d;
        }
    }


    public static void main(String[] args) {


        SampleLinkedList linkedList = new SampleLinkedList();
        linkedList.head = new LinkedListNode(1);
        LinkedListNode second = new LinkedListNode(2);
        LinkedListNode third = new LinkedListNode(3);
        LinkedListNode fourth = new LinkedListNode(4);

        linkedList.head.next = second;
        second.next = third;
        third.next = fourth;


        printLinkedList(linkedList);


    }

    private static void printLinkedList(SampleLinkedList linkedList) {

        LinkedListNode n = linkedList.head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }

    }
}

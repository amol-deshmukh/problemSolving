package com.deshmukh.linkedlist;

/**
 * @author Amol Deshmukh
 * @Created 06/01/19
 */
public class LinkedListGetCountRecusion {

    //with recursion

    public int getcount(Node node) {

        if (node == null) {
            return 0;
        }
        return 1 + getcount(node.next);

    }


    public static class Node {

        int data;
        Node next;

        Node(int d) {
            this.data = d;
        }
    }
}

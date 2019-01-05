package com.deshmukh.linkedlist;

/**
 * @author Amol Deshmukh
 * @Created 06/01/19
 */
public class LinkedListGetCount {

    public int getCount(Node node) {
        int count = 0;

        while (node != null) {
            count++;
            node = node.next;
        }

        return count;
    }


    public static class Node {

        int data;
        Node next;

        Node(int d) {
            this.data = d;
        }
    }

}

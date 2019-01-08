package com.deshmukh.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Amol Deshmukh
 * @Created 08/01/19
 */
public class PrintLeftViewOfBinaryTree {
    static class Node {
        int data;
        Node right, left;

        Node(int d) {
            data = d;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(8);
        root.right.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right.left = new Node(14);
        printLeftView(root);

        // answer is
        //10
        //2
        //7
        //14

        //TODO check answer once
    }


    private static void printLeftView(Node root) {

        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);


        while (!queue.isEmpty()) {

            int n = queue.size();

            for (int i = 0; i < n; i++) {
                Node temp = queue.poll();


                if (i == 0) {
                    System.out.println(temp.data);
                }
                if (temp.left != null) {
                    queue.offer(temp.left);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                }


            }

        }
    }
}

package com.deshmukh.tree;

/**
 * @author Amol Deshmukh
 * @Created 14/01/19
 */
public class HeightOfTree {

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.right.left = new Node(6);
        root.right.right = new Node(41);


        System.out.println("Height if tree is : " + getHeight(root));

    }

    public static int getHeight(Node root) {
        if (root == null) {
            return 0;
        }

        int left = getHeight(root.left);
        int right = getHeight(root.right);

        if (left > right) {
            return left + 1;
        } else {
            return right + 1;
        }

    }

}

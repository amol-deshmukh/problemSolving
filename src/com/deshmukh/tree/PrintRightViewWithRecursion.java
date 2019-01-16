package com.deshmukh.tree;

/**
 * @author Amol Deshmukh
 * @Created 16/01/19
 */
public class PrintRightViewWithRecursion {

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(8);
        root.right.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right.left = new Node(14);
        printRightViewOfTree(root);
        // answer is 10,3,15,14


    }

    static class Node {
        int data;
        Node right, left;

        Node(int d) {
            data = d;
        }
    }

    static int maxLevel = 0;

    public static String printRightViewOfTree(Node root) {
        sb = new StringBuilder();
        return rightViewUtil(root, 1);
    }

    static StringBuilder sb = new StringBuilder();

    private static String rightViewUtil(Node node, int level) {
        if (node == null) {
            return "";
        }
        // System.out.println("Current node is : "+node.data);
        if (maxLevel < level) {

            sb.append(node.data + " ");
            maxLevel = level;
        }
        rightViewUtil(node.right, level + 1);

        rightViewUtil(node.left, level + 1);

        return sb.toString();
    }


}

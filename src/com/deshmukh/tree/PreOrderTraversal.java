package com.deshmukh.tree;

public class PreOrderTraversal {
    /***
     *
     *
     *
     */
    Node root;



    public static void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.key);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);


    }


    public static void main(String[] args) {
        PreOrderTraversal tree= new PreOrderTraversal();
        tree.root= new Node(1);
        tree.root.left= new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.left.right= new Node(5);
        preOrderTraversal(tree.root);


    }


    static class Node {
        int key;
        Node right, left;
        Node(int key){
            this.key=key;

        }
    }


}
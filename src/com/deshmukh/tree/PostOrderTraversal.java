package com.deshmukh.tree;

import javafx.geometry.Pos;

public class PostOrderTraversal {
    Node root;

    /***
     *
     * postorder
     * Left-Right-Root
     */



    public static void main(String[] args) {
        PostOrderTraversal tree= new PostOrderTraversal();
        tree.root= new PostOrderTraversal.Node(1);
        tree.root.left= new PostOrderTraversal.Node(2);
        tree.root.right= new PostOrderTraversal.Node(3);
        tree.root.left.left= new PostOrderTraversal.Node(4);
        tree.root.left.right= new PostOrderTraversal.Node(5);
        printPostOrderTravels(tree.root);
    }


    public static void printPostOrderTravels(Node node){
        if (node==null)
            return;
        printPostOrderTravels(node.left);
        printPostOrderTravels(node.right);
        System.out.println(node.key);

    }







    static class Node {
        int key;
        Node right, left;
        Node(int key){
            this.key=key;

        }
    }
}

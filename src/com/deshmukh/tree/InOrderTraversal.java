package com.deshmukh.tree;

public class InOrderTraversal {
    Node root;

    /***
     *
     * postorder
     * Left-Right-Root
     */



    public static void main(String[] args) {
        InOrderTraversal tree= new InOrderTraversal();
        tree.root= new InOrderTraversal.Node(1);
        tree.root.left= new InOrderTraversal.Node(2);
        tree.root.right= new InOrderTraversal.Node(3);
        tree.root.left.left= new InOrderTraversal.Node(4);
        tree.root.left.right= new InOrderTraversal.Node(5);
        printInOrderTravels(tree.root);
    }


    public static void printInOrderTravels(Node node){
        if (node==null)
            return;
        printInOrderTravels(node.left);
        System.out.println(node.key);

        printInOrderTravels(node.right);

    }







    static class Node {
        int key;
        Node right, left;
        Node(int key){
            this.key=key;

        }
    }
}

package com.deshmukh.tree;

/**
 * @author Amol Deshmukh
 * @Created 07/01/19
 */
public class LevelOrderTraversal {


    Node root;

    public LevelOrderTraversal() {
        root = null;
    }

    public static void main(String[] args) {

        LevelOrderTraversal tree = new LevelOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder(tree.root);

    }

    private void printLevelOrder(Node root) {

        int h = getHeightOfNode(root);
        printNodesAtGivenLevel(root, h);
    }


    /***
     * Get the height of node
     * @param root
     * @return integer hight
     */
    int getHeightOfNode(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = getHeightOfNode(root.left);
            int rightHeight = getHeightOfNode(root.right);

            if (leftHeight > rightHeight) {
                return leftHeight + 1;
            } else return rightHeight + 1;
        }
    }


    static void printNodesAtGivenLevel(Node root, int level) {

        if (root == null) {
            return;
        }

        if (level == 1) {
            System.out.println(root.data + "");
            System.out.println("Level data  is : " + root.data);


        } else if (level > 1) {
            System.out.println("Level data  is : " + root.data);


            printNodesAtGivenLevel(root.left, level - 1);

            printNodesAtGivenLevel(root.right, level - 1);
        }


    }


    static class Node {
        int data;
        Node left, right;


        Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }
}

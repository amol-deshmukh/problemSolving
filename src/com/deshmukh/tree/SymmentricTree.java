package com.deshmukh.tree;

/**
 * @author Amol Deshmukh
 * @Created 08/01/19
 */
public class SymmentricTree {

    //TODO check answer  . Modify program

    static class Node {
        int data;
        Node left, right;


        Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }

    /*
     *
     *              10
     *             /  \
     *            2    2
     *           / \  / \
     *          4   5 4  5
     *
     */


    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(2);
        root.right = new Node(2);

        root.left.left = new Node(4);
        root.left.right = new Node(6);


        root.right.left = new Node(6);
        root.right.right = new Node(41);

        if (isSymmetric(root)) {
            System.out.println("Symmetric Tree");
        } else {
            System.out.println("Not a Symmetric Tree");
        }
    }

    private static boolean isSymmetric(Node root) {
// check if is mirror od itself
        return isMirror(root, root);
    }

    private static boolean isMirror(Node root1, Node root2) {

        if (root1 == null && root2 == null) {
            return true;
        } else if (root1 != null && root2 != null && root1.data == root2.data) {
            return (isMirror(root1.left, root2.left) && isMirror(root1.right, root2.right));

        } else return false;

    }
}

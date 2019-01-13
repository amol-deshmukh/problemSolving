package com.deshmukh.tree;

/**
 * @author Amol Deshmukh
 * @Created 13/01/19
 */
public class LowestCommonAncestorInBinaryTree {
    Node root;


    static class Node {
        int data;
        Node right, left;

        Node(int d) {
            data = d;
        }

        @Override
        public String toString() {
            return String.valueOf(data);
        }
    }


    public static Node lca(Node root, Node n1, Node n2) {
        if (root == null) {
            return null;
        }
        if (root.data == n1.data || root.data == n2.data) {
            return root;
        }

        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);

        if (left != null && right != null) {
            return root;
        }
        return left != null ? left : right;
    }

    public static void main(String[] args) {
        LowestCommonAncestorInBinaryTree tree = new LowestCommonAncestorInBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        System.out.println(lca(tree.root, new Node(6), new Node(7)).data);
    }
}

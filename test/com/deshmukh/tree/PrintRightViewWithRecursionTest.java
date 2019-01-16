package com.deshmukh.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Amol Deshmukh
 * @Created 16/01/19
 */
class PrintRightViewWithRecursionTest {

    @Test
    void printRightViewOfTree() {
        PrintRightViewWithRecursion.Node root = new PrintRightViewWithRecursion.Node(10);
        root.left = new PrintRightViewWithRecursion.Node(2);
        root.right = new PrintRightViewWithRecursion.Node(3);
        root.left.left = new PrintRightViewWithRecursion.Node(7);
        root.left.right = new PrintRightViewWithRecursion.Node(8);
        root.right.right = new PrintRightViewWithRecursion.Node(15);
        root.right.left = new PrintRightViewWithRecursion.Node(12);
        root.right.right.left = new PrintRightViewWithRecursion.Node(14);
        assertEquals("10 3 15 14 ", PrintRightViewWithRecursion.printRightViewOfTree(root));
    }
}
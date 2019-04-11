package com.deshmukh.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Amol Deshmukh
 * @Created 11/04/19
 */
class Ex01ParenthesisCheckTest {

    @Test
    void isBalanced() {
        assertEquals("YES", Ex01ParenthesisCheck.isBalanced("{[()]}"));
        assertEquals("NO", Ex01ParenthesisCheck.isBalanced("{[(])}"));
        assertEquals("YES", Ex01ParenthesisCheck.isBalanced("{{[[(())]]}}"));
    }
}
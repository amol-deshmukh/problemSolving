package com.deshmukh.stacks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/**
 * @author Amol Deshmukh
 * @Created 11/04/19
 */
public class Ex01ParenthesisCheck {

    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) {
        //System.out.println(isBalanced(""));
    }


    public static String isBalanced(String s) {


        HashMap<Character, Character> map = new HashMap<>();

        java.util.Set<Character> openBrackets = new HashSet<>();
        openBrackets.add('(');
        openBrackets.add('[');
        openBrackets.add('{');

        java.util.Set<Character> closeBrackets = new HashSet<>();
        closeBrackets.add(')');
        closeBrackets.add(']');
        closeBrackets.add('}');

        if (s == null || s.length() % 2 != 0) {
            return NO;
        } else {
            Stack<Character> stack = new Stack<Character>();
            for (int i = 0; i < s.toCharArray().length - 1; i++) {


                if (openBrackets.contains(s.charAt(i))) {
                    stack.push(s.charAt(i));


                } else {
                    if (!stack.empty() && isMatchingPair(stack.peek(), s.charAt(i))) {
                        stack.pop();
                    } else {
                        return NO;
                    }
                }


            }
            return YES;


        }

    }

    private static boolean isMatchingPair(Character ch1, char ch2) {

        if (ch1 == '(' && ch2 == ')')
            return true;
        if (ch1 == '{' && ch2 == '}')
            return true;
        if (ch1 == '[' && ch2 == ']')
            return true;
        return false;
    }

}

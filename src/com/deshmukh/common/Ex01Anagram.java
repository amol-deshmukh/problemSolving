package com.deshmukh.common;

import java.util.HashMap;

/**
 * @author Amol Deshmukh
 * @Created 10/04/19
 */
public class Ex01Anagram {


    public static void main(String[] args) {


        System.out.println(isAnagram("margana", "anagram"));

    }


    static boolean isAnagram(String a, String b) {
        // Complete the function

        if (a == null && b == null) {
            return true;
        } else if (a == null && b != null) {
            return false;
        } else if (b == null && a != null) {
            return false;
        } else if (a.length() != b.length()) {
            return false;
        }

        HashMap<Character, Integer> aMap = new HashMap<>();
        HashMap<Character, Integer> bMap = new HashMap<>();

        a = a.toLowerCase();
        b = b.toLowerCase();
        for (int i = 0; i < a.length(); i++) {

            if (aMap.containsKey(a.charAt(i))) {
                aMap.put(a.charAt(i), aMap.get(a.charAt(i)) + 1);
            } else {
                aMap.put(a.charAt(i), 1);
            }


            if (bMap.containsKey(b.charAt(i))) {
                bMap.put(b.charAt(i), bMap.get(b.charAt(i)) + 1);
            } else {
                bMap.put(b.charAt(i), 1);
            }


        }

        if (aMap.size() == bMap.size()) {
            for (Character character : aMap.keySet()) {
                if (aMap.get(character.charValue()) != bMap.get(character.charValue())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

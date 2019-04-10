package com.deshmukh.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Amol Deshmukh
 * @Created 10/04/19
 */
class Ex01AnagramTest {

    @Test
    void isAnagram() {
        assertEquals(Ex01Anagram.isAnagram("anagram", "margana"), true);
        assertEquals(Ex01Anagram.isAnagram("anagramm", "marganaa"), false);
        assertEquals(Ex01Anagram.isAnagram("Hello", "hello"), true);

    }
}
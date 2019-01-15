package com.deshmukh.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Amol Deshmukh
 * @Created 15/01/19
 */
class Ex02MissingNumberTest {

    @Test
    void getMissingNumber() {


        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        assertEquals(9, Ex02MissingNumber.getMissingNumber(a));

    }
}
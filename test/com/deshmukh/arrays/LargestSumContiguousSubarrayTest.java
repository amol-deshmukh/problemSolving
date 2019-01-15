package com.deshmukh.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Amol Deshmukh
 * @Created 15/01/19
 */
class LargestSumContiguousSubarrayTest {


    @Test
    void getLargestSum() {
        int[] a = {1, 2, 3, -2, 7};
        assertEquals(7, new LargestSumContiguousSubarray().getLargestSum(a));

        int[] b = {1, 2, 3, -2, 9};
        assertEquals(9, new LargestSumContiguousSubarray().getLargestSum(b));

        int[] c = {1, 2, 3, -2, 5};
        assertEquals(6, new LargestSumContiguousSubarray().getLargestSum(c));

    }
}
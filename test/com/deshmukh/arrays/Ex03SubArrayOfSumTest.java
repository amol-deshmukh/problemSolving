package com.deshmukh.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Amol Deshmukh
 * @Created 15/01/19
 */
class Ex03SubArrayOfSumTest {

    @Test
    void getSubarrayForGivenSurm() {
        int[] a = {5, 4, 1, 0, 12};
        assertEquals("2 4", Ex03SubArrayOfSum.getSubarrayForGivenSurm(a, 13));


        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals("0 4", Ex03SubArrayOfSum.getSubarrayForGivenSurm(b, 15));


        int[] c = {1, 2, 3, 7, 5};
        assertEquals("1 3", Ex03SubArrayOfSum.getSubarrayForGivenSurm(c, 12));
        assertEquals("", Ex03SubArrayOfSum.getSubarrayForGivenSurm(c, 115));

    }
}
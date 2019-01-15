package com.deshmukh.arrays;

/**
 * @author Amol Deshmukh
 * @Created 15/01/19
 */
public class Ex02MissingNumber {
    public static int getMissingNumber(int[] a) {


        for (int i = 0; i < a.length - 1; i++) {
            int diff = a[i] - a[i + 1];
            if (diff != -1) {
                return a[i] + 1;
            }
        }


        return -1;


    }
}

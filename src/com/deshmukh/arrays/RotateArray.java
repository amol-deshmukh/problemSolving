package com.deshmukh.arrays;

import java.util.Arrays;

/**
 * @author Amol Deshmukh
 * @Created 09/01/19
 */
public class RotateArray {


    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(rotateArray(input, 3)));
    }

    private static int[] rotateArray(int[] input, int i) {

        for (int i1 = 0; i1 < i; i1++) {
            rotateArrayByOne(input);

        }
        return input;


    }

    private static void rotateArrayByOne(int[] input) {
        if (input != null && input.length > 1) {
            int temp = input[0];
            input[0] = input[input.length - 1];
            input[input.length - 1] = temp;
        }
    }
}

package com.deshmukh.arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] input) {
        int counter = 0;
        for (int j = 0; j < input.length - 1; j++) {
            for (int i = 0; i < input.length - 1 - j; i++) {
                int temp = 0;
                if (input[i] > input[i + 1]) {
                    temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    counter++;

                }
            }

        }
        System.out.println("Total number of iterations : " + counter);
        System.out.println("Array Length : " + input.length);

        return input;

    }
}

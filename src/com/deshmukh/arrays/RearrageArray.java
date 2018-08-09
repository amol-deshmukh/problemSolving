package com.deshmukh.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RearrageArray {

    /******
     * Find problem here. https://www.geeksforgeeks.org/rearrange-array-arri/
     *
     * Problem-
     *
     * Given an array of elements of length N, ranging from 1 to N. All elements may not be present in the array. If element is not present then there will be -1 present in the array. Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.
     *
     * Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
     * Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
     *
     *
     */


    public  static int[] getRearrangedArray(int[] input) {


        HashSet<Integer> intergerSet = new HashSet<>();

        for (int i = 0; i < input.length; i++) {
            intergerSet.add(input[i]);
        }
        for (int i = 0; i < input.length; i++) {
            if (intergerSet.contains(i)) {
                input[i] = i;
            } else {
                input[i] = -1;
            }
        }
        return input;

    }


    public static void main(String [] args){

        int[] input1= {1,54,3,2,66,3,33,543,234,234342,0};
        int[] input2= {0,1,2,3,4};

        System.out.println(Arrays.toString(RearrageArray.getRearrangedArray(input1)));
        System.out.println("--------------------------------------------");
        System.out.println(Arrays.toString(RearrageArray.getRearrangedArray(input2)));
    }






    /***
     * Points to remember,
     *
     * 1. The max number in array should be less than size of array, otherwise it will be difficult to rearrange it.
     *
     *
     *
     *
     * *******/

}

package com.deshmukh.arrays;

/**
 * @author Amol Deshmukh
 * @Created 15/01/19
 */
public class LargestSumContiguousSubarray {


    public int getLargestSum(int[] a) {
        int currentSum = a[0];
        int largestSum = a[0];
        for (int i = 1; i < a.length; i++) {

            if (currentSum + a[i] > a[i]) {
                currentSum = (currentSum + a[i]) > currentSum ? currentSum + a[i] : a[i];
            } else {
                currentSum = a[i];
            }

            largestSum = currentSum > largestSum ? currentSum : largestSum;


        }
        return largestSum;

    }

}

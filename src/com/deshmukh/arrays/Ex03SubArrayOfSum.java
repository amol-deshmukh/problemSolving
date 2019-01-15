package com.deshmukh.arrays;

/**
 * @author Amol Deshmukh
 * @Created 15/01/19
 */
public class Ex03SubArrayOfSum {
    public static String getSubarrayForGivenSurm(int[] a, int sum) {
        int startCounter = 0;
        int endCounter = 0;
        int currentSum = 0;
        while (startCounter <= endCounter && endCounter <= a.length) {

            //currentSum+=a[endCounter];
            if (currentSum == sum) {
                return startCounter + " " + (endCounter - 1);


            } else if (currentSum < sum) {

                if (endCounter == a.length) {
                    return "";
                } else {
                    currentSum += a[endCounter];
                    endCounter++;
                }
            } else if (currentSum > sum) {
                currentSum -= a[startCounter];
                startCounter++;
            }


        }


        return "";
    }
}

package com.deshmukh.arrays;

import java.util.Arrays;

public class Test {

    public static void main(String [] args){

        int[] input1= {1,54,3,2,66,3,33,543,234,234342,0};
        int[] input2= {0,1,2,3,4};

        System.out.println(Arrays.toString(BubbleSort.bubbleSort(input1)));
        System.out.println("--------------------------------------------");
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(input2)));
    }
}

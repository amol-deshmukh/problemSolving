package com.deshmukh.common;

public class Fibonacci {

//TODO add program to print fibonacci series with recursion


    public static void printFibonacciNumbers(int n) {
        int p = 0, q = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                printNumber(0);
                p = 0;
            } else if (i == 1) {
                printNumber(1);
                q = 01;
            } else {


                printNumber(p + q);

                int temp = p + q;
                p = q;
                q = temp;


            }

        }


    }

    private static void printNumber(int i) {
        System.out.println(" " + i);
    }


    public static void main(String[] args) {
        printFibonacciNumbers(14);
    }
}

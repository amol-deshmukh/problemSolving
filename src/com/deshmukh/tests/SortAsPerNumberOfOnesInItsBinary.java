package com.deshmukh.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortAsPerNumberOfOnesInItsBinary {

    /*****
     * Sort given array of integer as per count of 1's in their binary.
     *
     */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(12);
        list.add(13);

        SortAsPerNumberOfOnesInItsBinary s1 = new SortAsPerNumberOfOnesInItsBinary();
        System.out.println("Input : " + list.toString());

        System.out.println("Output : " + s1.rearrangeList(list).toString());

    }

    public List<Integer> rearrangeList(List<Integer> integerList) {

        Collections.sort(integerList, new Comparator<Integer>() {

            @Override
            public int compare(Integer INTEGER1, Integer INTEGER2) {

                int result = 0;
                if (INTEGER1 == INTEGER2) {
                    result = 0;
                } else if (Integer.bitCount(INTEGER1) < Integer.bitCount(INTEGER2)) {

                    result = -1;
                } else if (Integer.bitCount(INTEGER1) > Integer.bitCount(INTEGER2)) {

                    result = 1;
                } else if (Integer.bitCount(INTEGER1) == Integer.bitCount(INTEGER2)) {

                    result = (INTEGER1 < INTEGER2) ? -1 : 1;// sort in natural order
                }
                return result;
            }
        });

        return integerList;
    }

}
package com.deshmukh.heap;

import java.util.PriorityQueue;

/**
 * @author Amol Deshmukh
 * @Created 07/01/19
 */
public class MedianOfStream {

    //Problem- Find the median of stream.

    /****
     * solutions
     * 1.
     *
     *
     *
     */
    // Median is, sort array and pick the middle element.
    // First basic approch would be , sort stream with insersion sort and pick up the middle element.
    // Second aproch would be, self balanced trees.
    // Such as , root will be median element, one side contains lesser elements than root and other side contains larger element than root.
    // Hence root is always a median.

    //** Third common approach is use heap.
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = null;//lower half
        maxHeap.add(1);
        maxHeap.offer(1);

    }
}

package com.deshmukh.designs.lrucache;

public class TestClass {

    public static void main(String[] args){

        LRUCache cache= new LRUCache();
        cache.putValue(1,1);
        cache.putValue(2,2);
        cache.putValue(3,3);
        cache.putValue(4,4);
        cache.putValue(5,5);
        cache.putValue(6,6);
        cache.putValue(7,7);


        for(int i=1;i<10;i++) {
            if (cache.contains(i)) {
                System.out.println(cache.getValue(i));
            } else {
                System.out.println("Key "+i+"not present");
            }
        }

    }

}

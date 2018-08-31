package com.deshmukh.designs.lrucache;

public interface LRUContract {

    int getValue(int key);
    int putValue(int key, int value);
    void removeNode(int key);
    void setNodeToFirst(Node node);
    boolean contains(int key);



}

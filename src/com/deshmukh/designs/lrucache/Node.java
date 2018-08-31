package com.deshmukh.designs.lrucache;

public class Node {
    private int key;
    private int value;
     Node left;
     Node right;


    Node(int key, int value) {
        super();
        this.key = key;
        this.value = value;

    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

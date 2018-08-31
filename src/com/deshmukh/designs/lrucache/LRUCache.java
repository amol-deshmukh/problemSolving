package com.deshmukh.designs.lrucache;

import java.util.HashMap;

public class LRUCache implements LRUContract {


    private HashMap<Integer, Node> hashMap;
    private Node start, end;
    private static final int MAX_SIZE = 5;

    public LRUCache() {
        hashMap = new HashMap<Integer, Node>();
    }

    @Override
    public int getValue(int key) {


        if (hashMap.containsKey(key)) {

            removeNode(key);
            setNodeToFirst(hashMap.get(key));
            return hashMap.get(key).getValue();

        } else {
            return -1;
        }
    }

    @Override
    public int putValue(int key, int value) {

        if (hashMap.containsKey(key)) // Key Already Exist, just update the value and move it to top
        {
            Node entry = hashMap.get(key);
            entry.setValue(value);
            removeNode(key);
            setNodeToFirst(entry);
        } else {
            Node node = new Node(key,value);
            node.left = null;
            node.right = null;
            node.setValue(value);

            node.setKey( key);
            if (hashMap.size() > MAX_SIZE) // We have reached maxium size so need to make room for new element.
            {
               // removeNode(key);
                hashMap.put(key, node);

                setNodeToFirst(node);
                if (end!=null)
                removeNode(end.getKey());

            } else {
                setNodeToFirst(node);
                hashMap.put(key, node);

            }

        }

return 1;
    }

    @Override
    public void removeNode(int key) {
        Node node = hashMap.get(key);
        if (node.left != null) {
            node.left.right = node.right;
        } else {
            start = node.right;
        }

        if (node.right != null) {
            node.right.left = node.left;
        } else {
            end = node.left;
        }

    }

    @Override
    public void setNodeToFirst(Node node) {

        node.right = start;
        node.left = null;
        if (start != null)
            start.left = node;
        start = node;
        if (end == null)
            end = start;

    }

    @Override
    public boolean contains(int key) {
        return  (hashMap.containsKey(key));
    }


}

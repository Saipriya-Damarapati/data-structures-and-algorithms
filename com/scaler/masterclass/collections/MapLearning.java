package com.scaler.masterclass;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapLearning {
    public static void main(String[] args) {
        // Map takes {Key, Value}
        // Hence it is not under Collection interface

        // HashMap : Non thread safe
        // allows null key

        // HashTable: Thread safe
        // Does not allow null key
        // locks complete data structure
        // read operations are also blocked
        // too much usage of resources

        // Better option compared to HashTable - ConcurrentHashMap
        // complete structure is not locked
        // reads are not blocked
        // complete hashmap is divided into buckets, only the bucket is locked,
        // more optimized version compared to hashtable

        // LinkedHashMap - Doubly Linked List - maintains insertion order with HashMap
    }
}

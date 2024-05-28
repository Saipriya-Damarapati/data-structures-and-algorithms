package com.scaler.masterclass.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetLearning {

    public static void main(String[] args) {

        // Set : does not allow duplicate elements
        // not ordered
        // specific sets which are ordered
        // searching an element very faster
        // O(1) = Hashing techniques are used behind the scenes for faster search

        // Random order - no order at all
        // O(1) time complexity
        Set set1 = new HashSet();
        set1.add(5);
        set1.add(6);
        set1.add(2);
        set1.add(8);
        set1.add(4);

        // Preserves the insertion order
        // data structure implementation: combination of doubly linked list and hash map
        // doubly linked list - maintains insertion order
        // hash map helps in searching faster
        Set set2 = new LinkedHashSet();
        set2.add(5);
        set2.add(6);
        set2.add(2);
        set2.add(8);
        set2.add(4);

        // sorted order - natural ordering
        // BBST - Balanced Binary Search Trees - in order traversal
        // AVL trees and Red Black Trees - Types of BBST
        // TreeSet uses Red Black Trees implementation
        // Searching and insertion - O(log n)
        Set set3 = new TreeSet();
        set3.add(5);
        set3.add(6);
        set3.add(2);
        set3.add(8);
        set3.add(4);

        System.out.println("Set1 HashSet: " + set1);
        System.out.println("Set2 LinkedHashSet: " + set2);
        System.out.println("Set3 TreeSet: " + set3);
    }
}

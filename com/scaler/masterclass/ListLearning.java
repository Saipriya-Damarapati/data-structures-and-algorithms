package com.scaler.masterclass;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListLearning {

    public static void main(String[] args) {

        //Collection
        //Collections

        // List is an array which is dynamic and growable

        // arraylist is not thread safe : not synchronized
        // every time that memory is full, size of the array list is doubled and every element is copied into newly created array list.
        // random access any element - with the help of index - O(1)
        List<Integer> arrayList = new ArrayList<>();

        // Linked list is used for implementation
        // a doubly linked list is implemented
        // random access is not possible
        // usage: insertion and removal is easy in LinkedList
        // LinkedList is not thread safe : not synchronized
        // browser back and front button is implemented using stack which in turn uses linked inst
        List<Integer> linkedList = new LinkedList<>();

        // Thread Safe + Array List
        // every method in vector is synchronized
        // not frequently used after concurrent package - which provide much better optimizations compared to vector
        // example: CopyOnWriteArrayList in concurrent package
        List<Integer> vectorList = new Vector<>();

        // LIFO = Last In First Out behavior
        // Push, Pop and Peek
        // this extends Vector class --> thread safe like vector
        // push method is not synchronized or thread safe because they are calling addElement which is already synchronized
        List<Integer> stackList = new Stack<>();
    }
}

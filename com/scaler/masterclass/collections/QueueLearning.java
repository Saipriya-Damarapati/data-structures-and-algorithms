package com.scaler.masterclass.collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueLearning {

    // line where you are waiting for your turn
    public static void main(String[] args) {

        //Queue: holds the element before it is processed

        // Priority Queue maintains natural ordering under priority
        // Custom priority can be implemented using comparator and comparable
        System.out.println("Implementation of PriorityQueue");
        Queue<Integer> queue1 = new PriorityQueue<>();
        queue1.add(5);
        queue1.add(6);
        queue1.add(2);
        queue1.add(8);
        queue1.add(4);

        while (!queue1.isEmpty()) {
            System.out.println(queue1.stream().toList());
            queue1.poll();
        }

        // Queue - implemented by Deque - Double ended queue - insertion and removal from both the ends
        // Insert / Removal in particular order
        System.out.println("Implementation of LinkedList / Deque");
        Queue<Integer> queue2 = new LinkedList<>();
        queue2.add(5);
        queue2.add(6);
        queue2.add(2);
        queue2.add(8);
        queue2.add(4);

        while (!queue2.isEmpty()) {
            System.out.println(queue2.stream().toList());
            queue2.poll();
        }

    }
}

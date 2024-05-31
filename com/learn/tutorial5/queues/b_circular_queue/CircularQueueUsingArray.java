package com.learn.tutorial5.queues.b_circular_queue;

import com.learn.tutorial5.queues.b_circular_queue.impl.ArrayQueue;
import com.learn.tutorial5.queues.pojo.Employee;

public class CircularQueueUsingArray {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayQueue queue = new ArrayQueue(3);
        queue.add(janeJones);
        queue.add(johnDoe);
        System.out.println("removing Jane --> " + queue.remove()); // Jane is removed
        queue.add(marySmith); // queue wrap happens
        System.out.println("removing John --> " + queue.remove()); // John
        queue.add(mikeWilson);
        System.out.println("removing Mary --> " + queue.remove()); // Mary
        queue.add(billEnd);
        System.out.println("removing Mike --> " + queue.remove()); // Mike
        queue.printQueue(); // Only Bill is printed

        queue.add(mikeWilson);
        queue.add(marySmith);
        queue.printQueue(); // check the positions after wrap and resize
        System.out.println("removing --> " + queue.remove()); // Bill
        queue.add(janeJones);
        queue.printQueue(); // Mike, Mary, Jane
    }
}

package com.learn.tutorial5.queues.b_circular_queue.impl;

import com.learn.tutorial5.queues.pojo.Employee;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public int getSize() {
        if(back >= front) {
            return back - front;
        }
        return (back + queue.length - front);
    }

    public boolean isEmpty() {
        return (back - front == 0);
    }

    // when we add the first item on the queue, front is 0 and back is 1
    public void add(Employee employee) {
        if(getSize() == queue.length - 1) { // check if queue is full, if so, resize the queue
            System.out.println("Queue is full and resizing happens while inserting " + employee.getFirstName());
            int currentSize = getSize();
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            System.arraycopy(queue, 0, newArray, queue.length - front, back);
            back = currentSize;
            front = 0;
            queue = newArray;
        }
        // add an element at the back and then increment back
        queue[back] = employee;
        if(back < queue.length - 1) {
            back++;
        } else {
            System.out.println("Queue wrap happens while inserting " + employee.getFirstName());
            back = 0;
        }
    }

    public Employee remove() {
        if(getSize() == 0) {
           throw new NoSuchElementException();
        }
        Employee removedEmployee = queue[front];
        queue[front] = null;
        front++;

        if(getSize() == 0) {
            front = 0;
            back = 0;
        } else if(front == queue.length) {
            front = 0;
        }

        return removedEmployee;
    }

    public Employee peek() {
        if(getSize() == 0) {
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public void printQueue() {
        System.out.println("---------------------------------------");
        if(front < back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        } else {
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = 0; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
        System.out.println("---------------------------------------");
    }


}

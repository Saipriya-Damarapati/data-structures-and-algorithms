package com.learn.tutorial5.queues.a_queue_impl_array.impl;

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
        return back - front;
    }

    public boolean isEmpty() {
        return (back - front == 0);
    }

    // when we add the first item on the queue, front is 0 and back is 1
    public void add(Employee employee) {
        if(back == queue.length) { // check if queue is full, if so, resize the queue
            if(front == 0) {
                Employee[] newArray = new Employee[2 * queue.length];
                System.arraycopy(queue, 0, newArray, 0, queue.length);
                queue = newArray;
            } else { // copying array forward manually when front is moved after removing some elements
                System.arraycopy(queue, front, queue, 0, getSize());
                back = back - front;
                front = 0;

                for(int i = front+getSize(); i < queue.length; i++) {
                    queue[i] = null;
                }
            }
        }
        // add an element at the back and then increment back
        queue[back++] = employee;
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
        for(int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
        System.out.println("---------------------------------------");
    }


}

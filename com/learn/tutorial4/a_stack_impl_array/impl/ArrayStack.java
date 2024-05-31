package com.learn.tutorial4.a_stack_impl_array.impl;

import com.learn.tutorial4.pojo.Employee;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {
        // capacity is the maximum number of items that we can store on the stack
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        if(top == stack.length) {
            // need to resize the backing array
            // O(n) time complexity
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = employee; // O(1) time complexity
    }

    public Employee pop() {
        if(isEmpty()) {
            // no elements are available on the stack to pop
            throw new EmptyStackException();
        }
        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public Employee peek() {
        if(isEmpty()) {
            // no elements are available on the stack to peek
            throw new EmptyStackException();
        }
        return stack[top-1];
    }

    public int getSize() {
        return top;
    }

    public void printStack() {
        System.out.println("--------------------------------------");
        for(int i = top - 1; i >= 0; i-- ) {
            System.out.println(stack[i]);
        }
        System.out.println("--------------------------------------");
    }

    public boolean isEmpty() {
        return top == 0;
    }
}

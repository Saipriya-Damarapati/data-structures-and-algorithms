package com.learn.tutorial4.b_stack_impl_linked_list;

import com.learn.tutorial4.pojo.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

/*
    This class restricts the use of other methods of linked list
    we want stack to strictly operate on push, pop and peek methods
    and hence the following implementation
 */
public class LinkedStack {

    private LinkedList<Employee> stack;

    public LinkedStack() {
        stack = new LinkedList<Employee>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        System.out.println("--------------------------------------");
        /*for(Employee emp : stack) {
            System.out.println(emp);
        }*/
        ListIterator iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("--------------------------------------");
    }
}

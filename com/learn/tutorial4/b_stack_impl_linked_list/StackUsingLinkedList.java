package com.learn.tutorial4.b_stack_impl_linked_list;

import com.learn.tutorial4.pojo.Employee;

public class StackUsingLinkedList {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedStack stack = new LinkedStack();
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);
        stack.push(billEnd);
        System.out.println("Peek --> " + stack.peek());
        stack.printStack();
        System.out.println("Pop --> " + stack.pop());
        System.out.println("Peek --> " + stack.peek());
    }
}

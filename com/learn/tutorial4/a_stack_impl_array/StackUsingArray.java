package com.learn.tutorial4.a_stack_impl_array;

import com.learn.tutorial4.a_stack_impl_array.impl.ArrayStack;
import com.learn.tutorial4.pojo.Employee;

public class StackUsingArray {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayStack stack = new ArrayStack(3);
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

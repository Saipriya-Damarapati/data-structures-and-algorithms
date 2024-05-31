package com.learn.tutorial4.challenges.challenge_01;

import com.learn.tutorial4.pojo.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

/*
    This class restricts the use of other methods of linked list
    we want stack to strictly operate on push, pop and peek methods
    and hence the following implementation
 */
public class LinkedStack {

    private LinkedList<Character> stack;

    public LinkedStack() {
        stack = new LinkedList<Character>();
    }

    public void push(Character character) {
        stack.push(character);
    }

    public Character pop() {
        return stack.pop();
    }

    public Character peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int getSize() {
        return stack.size();
    }
}

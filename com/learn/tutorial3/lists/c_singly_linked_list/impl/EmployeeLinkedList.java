package com.learn.tutorial3.lists.c_singly_linked_list.impl;

import com.learn.tutorial3.lists.c_singly_linked_list.pojo.EmployeeNode;
import com.learn.tutorial3.pojo.Employee;

import java.util.Objects;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public int getSize() {
        return size;
    }

    public EmployeeNode deleteFirst() {
        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD --> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" --> ");
            current = current.getNext();
        }
        System.out.print(" NULL");
    }

    public int getLinkedListSize() {
        EmployeeNode current = head;
        int size = 0;
        while (current != null) {
            current = current.getNext();
            size++;
        }
        return size;
    }

    public boolean isEmpty() {
        return Objects.isNull(head);
    }
}

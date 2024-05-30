package com.learn.tutorial3.lists.d_doubly_linked_list.impl;

import com.learn.tutorial3.lists.d_doubly_linked_list.pojo.EmployeeNode;
import com.learn.tutorial3.pojo.Employee;

import java.util.Objects;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return Objects.isNull(head) && Objects.isNull(tail);
    }

    public void insertAtHead(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        if(Objects.isNull(head)) {
            tail = node;
        } else {
            head.setPrevious(node);
        }
        head = node;
        size++;
    }

    public void insertAtTail(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setPrevious(tail);
        if(Objects.isNull(tail)) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    public EmployeeNode deleteAtHead() {
        if(isEmpty()) {
            return null;
        }
        if(head.getNext() == null) { // to handle if there is only one element in the list
            tail = null;
        }
        EmployeeNode removedNode = head;
        EmployeeNode nextField = head.getNext();
        nextField.setPrevious(removedNode.getPrevious());
        removedNode.setNext(null);
        head = nextField;
        size--;
        return removedNode;
    }

    public EmployeeNode deleteAtTail() {
        if(isEmpty()) {
            return null;
        }
        if(tail.getPrevious() == null) { // to handle if there is only one element in the list
            head = null;
        }
        EmployeeNode removedNode = tail;
        EmployeeNode previousField = tail.getPrevious();
        previousField.setNext(removedNode.getNext());
        removedNode.setPrevious(null);
        tail = previousField;
        size--;
        return removedNode;
    }

    public void printListFromLeftToRight() {
        EmployeeNode current = head;
        System.out.print("HEAD --> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <==> ");
            current = current.getNext();
        }
        System.out.println(" NULL");
    }

    public void printListFromRightToLeft() {
        EmployeeNode current = tail;
        System.out.print("TAIL <-- ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <==> ");
            current = current.getPrevious();
        }
        System.out.println(" NULL");
    }
}

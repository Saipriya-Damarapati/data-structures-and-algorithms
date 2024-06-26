package com.learn.tutorial3.challenges.challenge_01;

import com.learn.tutorial3.challenges.challenge_01.pojo.Employee;
import com.learn.tutorial3.challenges.challenge_01.impl.EmployeeDoublyLinkedList;
public class Solution {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        list.printList();

        list.addBefore(billEnd, johnDoe);
        list.printList();
        list.addBefore(new Employee("Someone", "Else", 1111), mikeWilson);
        list.printList();
    }
}

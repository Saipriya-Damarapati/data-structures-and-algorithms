package com.learn.tutorial3.lists.c_singly_linked_list;

import com.learn.tutorial3.pojo.Employee;
import com.learn.tutorial3.lists.c_singly_linked_list.impl.EmployeeLinkedList;

public class SinglyLinkedListImpl {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
        employeeLinkedList.addToFront(janeJones);
        employeeLinkedList.addToFront(johnDoe);
        employeeLinkedList.addToFront(marySmith);
        employeeLinkedList.addToFront(mikeWilson);
        System.out.println("Size of the linked list : " + employeeLinkedList.getSize());
        employeeLinkedList.printList();
        System.out.println("-----------------------------------------------------");
        if(!employeeLinkedList.isEmpty()) {
            System.out.println("employeeLinkedList is not empty");
            employeeLinkedList.deleteFirst();
            System.out.println("Size of the linked list : " + employeeLinkedList.getLinkedListSize());
            employeeLinkedList.printList();
            System.out.println("-----------------------------------------------------");
        }
    }
}

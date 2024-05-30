package com.learn.tutorial3.lists.d_doubly_linked_list;

import com.learn.tutorial3.lists.d_doubly_linked_list.pojo.EmployeeDoublyLinkedList;
import com.learn.tutorial3.lists.d_doubly_linked_list.pojo.EmployeeNode;
import com.learn.tutorial3.pojo.Employee;

public class DoublyLinkedListImpl {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeDoublyLinkedList employeeDoublyLinkedList = new EmployeeDoublyLinkedList();
        employeeDoublyLinkedList.insertAtTail(mikeWilson);
        employeeDoublyLinkedList.insertAtTail(marySmith);

        System.out.println("Size of the linked list : " + employeeDoublyLinkedList.getSize());
        employeeDoublyLinkedList.printListFromLeftToRight();
        employeeDoublyLinkedList.printListFromRightToLeft();
        System.out.println("-----------------------------------------------------");

        employeeDoublyLinkedList.insertAtHead(johnDoe);
        employeeDoublyLinkedList.insertAtHead(janeJones);

        System.out.println("Size of the linked list : " + employeeDoublyLinkedList.getSize());
        employeeDoublyLinkedList.printListFromLeftToRight();
        System.out.println("-----------------------------------------------------");

        EmployeeNode employeeNodeHead = employeeDoublyLinkedList.deleteAtHead();
        System.out.println(employeeNodeHead + " is deleted from head");
        System.out.println("Size of the linked list : " + employeeDoublyLinkedList.getSize());
        employeeDoublyLinkedList.printListFromLeftToRight();
        System.out.println("-----------------------------------------------------");

        EmployeeNode employeeNodeTail = employeeDoublyLinkedList.deleteAtTail();
        System.out.println(employeeNodeTail + " is deleted from head");
        System.out.println("Size of the linked list : " + employeeDoublyLinkedList.getSize());
        employeeDoublyLinkedList.printListFromLeftToRight();
        System.out.println("-----------------------------------------------------");
    }
}

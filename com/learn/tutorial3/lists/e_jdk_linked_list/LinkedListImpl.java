package com.learn.tutorial3.lists.e_jdk_linked_list;

import com.learn.tutorial3.pojo.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImpl {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 32);

        LinkedList<Employee> employeeList = new LinkedList<>();
        employeeList.addFirst(janeJones);
        employeeList.addFirst(johnDoe);
        employeeList.addFirst(marySmith);
        employeeList.addFirst(mikeWilson);
        employeeList.add(billEnd);

        displayLinkedList(employeeList);
        employeeList.removeFirst();
        displayLinkedList(employeeList);
        employeeList.remove();
        displayLinkedList(employeeList);
    }

    private static void displayLinkedList(LinkedList<Employee> employeeList) {
        Iterator iter = employeeList.iterator();
        System.out.print("HEAD");
        while (iter.hasNext()) {
            System.out.print( " <==> " + iter.next());
        }
        System.out.println(" <==> TAIL");
        System.out.println("Number of elements in the linked list --> " + employeeList.size());
        System.out.println("-----------------------------------------------------");
    }
}

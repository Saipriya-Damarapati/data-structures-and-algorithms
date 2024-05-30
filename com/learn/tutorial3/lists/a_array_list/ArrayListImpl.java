package com.learn.tutorial3.lists.a_array_list;

import com.learn.tutorial3.pojo.Employee;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImpl {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println("---------------------------------------------------");

        System.out.println(employeeList.get(1)); // index is known - O(1) time complexity

        System.out.println(employeeList.isEmpty());

        // adds a new element at the given index and pushes other elements, a step forward
        employeeList.add(1, new Employee("John", "Adams", 4568));

        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println("---------------------------------------------------");

        // updates the element at the given index with this new value
        employeeList.set(1, new Employee("John", "Allen", 4569));

        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println("---------------------------------------------------");

        System.out.println(employeeList.size()); // no. of elements
        System.out.println("---------------------------------------------------");
        // convert the arraylist to array
        Object[] objArray = employeeList.toArray(); // gives Object as return data
        for(Object obj : objArray) {
            System.out.println(obj);
        }
        System.out.println("---------------------------------------------------");

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]); // gives Employee as return data
        for (Employee employee: employeeArray) {
            System.out.println(employee);
        }
        System.out.println("---------------------------------------------------");

        // to check contains on object, we have to implement equals method



    }
}

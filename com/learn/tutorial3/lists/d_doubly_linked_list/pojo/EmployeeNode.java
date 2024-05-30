package com.learn.tutorial3.lists.d_doubly_linked_list.pojo;

import com.learn.tutorial3.pojo.Employee;

public class EmployeeNode {
    private Employee employee;
    private EmployeeNode previous;
    private EmployeeNode next;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}

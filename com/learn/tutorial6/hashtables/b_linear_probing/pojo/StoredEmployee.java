package com.learn.tutorial6.hashtables.b_linear_probing.pojo;

public class StoredEmployee {

    public String key; // raw key and not hashedkey
    public Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}

package com.learn.tutorial6.hashtables.b_linear_probing;

import com.learn.tutorial6.hashtables.b_linear_probing.impl.HashTableWithLinearProbing;
import com.learn.tutorial6.hashtables.b_linear_probing.pojo.Employee;

public class HashTableUsingLinearProbing {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnnyDoe = new Employee("Johnny", "Doe", 4567);
        Employee johnWilliams = new Employee("John", "Williams", 5687);
        Employee sunnyWilliams = new Employee("Sunny", "Williams", 5688);
        Employee georgeWilliams = new Employee("George", "Williams", 5689);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        HashTableWithLinearProbing hashTable = new HashTableWithLinearProbing();
        hashTable.add("Jones", janeJones);
        hashTable.add("Doe", johnnyDoe);
        hashTable.add("Williams", johnWilliams);
        hashTable.add("Wilson", mikeWilson);
        hashTable.add("Smith", marySmith);
        hashTable.add("Williamz", sunnyWilliams); // to validate add method
        hashTable.add("Williamx", georgeWilliams); // to validate add method
        hashTable.printHashTable();

        System.out.println(hashTable.get("Smith"));
    }
}

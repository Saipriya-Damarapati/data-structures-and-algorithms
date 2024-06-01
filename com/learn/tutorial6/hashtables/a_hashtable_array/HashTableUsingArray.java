package com.learn.tutorial6.hashtables.a_hashtable_array;

import com.learn.tutorial6.hashtables.a_hashtable_array.pojo.Employee;
import com.learn.tutorial6.hashtables.a_hashtable_array.impl.SimpleHashTable;

public class HashTableUsingArray {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnnyDoe = new Employee("Johnny", "Doe", 4567);
        Employee johnWilliams = new Employee("John", "Williams", 5687);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.add("Jones", janeJones);
        hashTable.add("Doe", johnnyDoe);
        hashTable.add("Williams", johnWilliams);
        hashTable.add("Smith", marySmith);
        hashTable.printHashTable();

        System.out.println(hashTable.get("Williams"));
    }
}

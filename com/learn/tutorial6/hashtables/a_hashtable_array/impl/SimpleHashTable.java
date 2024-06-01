package com.learn.tutorial6.hashtables.a_hashtable_array.impl;

import com.learn.tutorial6.hashtables.a_hashtable_array.pojo.Employee;

// Hashtable backed by array, that does not handle collisions
// Simple hashing with possibility of collisions
public class SimpleHashTable {

    private Employee[] hashtable;

    public SimpleHashTable() {
        // capacity declared as 10
        hashtable = new Employee[10];
    }

    public void add(String key, Employee employee) {
        int hashedKey = hashkey(key);
        if(hashtable[hashedKey] != null) {
            // collisions are not handled in this implementation
            System.out.println("Sorry, there is already an employee at the position: "
                    + hashedKey + " genertaed from key: " + key);
        } else {
            hashtable[hashedKey] = employee;
        }
    }

    // Use non integer key to retrieve data in constant time O(1)
    public Employee get(String key) {
        int hashedKey = hashkey(key);
        return hashtable[hashedKey];
    }

    public void printHashTable() {
        System.out.println("-----------------------------------------------");
        System.out.println("Print hashtable");
        for(int i = 0; i < hashtable.length; i++) {
            System.out.println("Index: " + i + " --> " + hashtable[i]);
        }
        System.out.println("-----------------------------------------------");
    }

    public int getSize() {
        int count = 0;
        for(int i = 0; i < hashtable.length; i++) {
            if(hashtable[i] != null) {
                count++;
            }
        }
        return count;
    }

    public int getLoadFactor() {
        return getSize() / hashtable.length;
    }

    public int hashkey(String key) {
        return key.length() % hashtable.length;
    }
}

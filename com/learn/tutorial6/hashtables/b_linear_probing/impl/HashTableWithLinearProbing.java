package com.learn.tutorial6.hashtables.b_linear_probing.impl;

import com.learn.tutorial6.hashtables.b_linear_probing.pojo.Employee;
import com.learn.tutorial6.hashtables.b_linear_probing.pojo.StoredEmployee;

import java.util.Objects;

// Hashtable backed by array, that handles collisions
// by linear probing approach
public class HashTableWithLinearProbing {

    private StoredEmployee[] hashtable;

    public HashTableWithLinearProbing() {
        // capacity declared as 10
        hashtable = new StoredEmployee[10];
    }

    public boolean isOccpied(int index) {
        return Objects.nonNull(hashtable[index]);
    }

    public void add(String key, Employee employee) {
        int hashedKey = hashkey(key);

        if(isOccpied(hashedKey)) {
            int stopIndex = hashedKey; // to stop incrementing if array is full
            if(isOccpied(hashedKey)) { // checking using if for first time, because first time we should not check stopIndex
                if(hashedKey == hashtable.length - 1) {
                    hashedKey = 0;
                } else {
                    hashedKey++;
                }
            }
            while (isOccpied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }
        if(hashtable[hashedKey] != null) {
            // collisions are handled by linear probing to an extent,
            // if array is full, then new employee cannot be added
            System.out.println("Sorry, there is already an employee at the position: "
                    + hashedKey + " genertaed from key: " + key);
        } else {
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    // Use non integer key to retrieve data in constant time O(1)
    /*public Employee get(String key) {
        int hashedKey = hashkey(key);
        StoredEmployee storedEmployee = hashtable[hashedKey];
        if(storedEmployee != null) {
            if (!key.equals(storedEmployee.key)) {
                int stopIndex = hashedKey;
                if (hashedKey == hashtable.length - 1) {
                    hashedKey = 0;
                } else {
                    hashedKey++;
                }
                while (hashedKey != stopIndex) {
                    storedEmployee = hashtable[hashedKey];
                    if(storedEmployee != null) {
                        if (key.equals(storedEmployee.key)) {
                            return hashtable[hashedKey].employee;
                        }
                    } else {
                        return null;
                    }
                    hashedKey = (hashedKey + 1) % hashtable.length;
                }
            }
        }
        return null;
    }*/

    public Employee get(String key) {
        int index = getIndex(key);
        if(index < 0) {
            return null;
        }
        return hashtable[index].employee;
    }

    public int getIndex(String key) {
        int hashedKey = hashkey(key);
        StoredEmployee storedEmployee = hashtable[hashedKey];
        if(storedEmployee != null) {
            if (!key.equals(storedEmployee.key)) {
                int stopIndex = hashedKey;
                if (hashedKey == hashtable.length - 1) {
                    hashedKey = 0;
                } else {
                    hashedKey++;
                }
                while (hashedKey != stopIndex) {
                    storedEmployee = hashtable[hashedKey];
                    if(storedEmployee != null && key.equals(storedEmployee.key)) {
                        return hashedKey;
                    } else {
                        if(Objects.isNull(storedEmployee)) {
                            return -1;
                        }
                    }
                    hashedKey = (hashedKey + 1) % hashtable.length;
                }
            }
        }
        return -1;
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

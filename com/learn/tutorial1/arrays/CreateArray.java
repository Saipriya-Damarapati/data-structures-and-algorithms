package com.learn.tutorial1.arrays;

public class CreateArray {

    // Array: Contiguous block of memory, homogeneous collection
    // Pre-defined length
    // Every element occupies the same amount of memory for primitive data types
    // String on the other hand, for example, is an object,
    // and the address (object references) of the object is stored in the array

    // for example, starting address is x, and size of each element is y,
    // to find out 'i' th element memory address, calculate using x + ( i * y )

    // if we know the element index in the array, no matter where it is in the array,
    // the time to retrieve the element is same, constant time complexity = O(1)
    public static void main(String[] args) {
        int[] intArray = new int[7];
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        for(int i=0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}

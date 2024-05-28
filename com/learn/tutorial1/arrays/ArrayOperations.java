package com.learn.tutorial1.arrays;

// Short notes: Loop around the array - O(n)
// have index to perform an operation - O(1)
public class ArrayOperations {

    public static void main(String[] args) {
        int[] intArray = new int[] {20, 35, -15, 7, 55, 1, -22};

        // if we know the element index in the array, no matter where it is in the array,
        // the time to retrieve the element is same, constant time complexity = O(1)
        for(int i=0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // Case 1: Get the number from the array without knowing the index (find the index)
        // Worst case time complexity: O(n)
        int index = -1;
        for(int i=0; i < intArray.length; i++) {
            if(intArray[i] == 7) {
                index = i;
                break;
            }
        }
        System.out.println("Number 7 is present at " + index + " position of array");

        // Case 2: Add an element to full array
        // Array is fixed length data structure and it cannot increase its size
        // so if the array is full,
            // we need to create another array with increased size to fit in the new element    - O(1)
            // copy all the elements from the existing array to the newly created array         - O(n)
            // then add the new element that has to be added                                    - O(1)
        // so the time complexity for adding an element to the full array is O(n)

        // Case 3: Add an element to the end of array, where array has space
        // assuming that we know the index, it is straight forward and no iteration is required
        // time complexity should be O(1)

        // Case 4: Insert or update element at specific index
        // we will have index, so it is straight forward to insert or update the element at O(1) time complexity

        // Case 5: Delete an element by setting it to null
        // we will have index, so it is straight forward to update the element value as null at O(1) time complexity

        // Case 6: Delete an element by shifting elements
        // For worst case complexity, we need to delete the element at 0th position, and shift all other elements
        // which will be at O(n) time complexity
    }
}

/*
|------------------------------------------------------------------------------------------------|
|   Operation                                                |   Time Complexity                 |
|------------------------------------------------------------------------------------------------|
|Retrieve with index                                         |   O(1)    Constant time           |
|Retrieve without index                                      |   O(n)    Linear time             |
|Add an element to full array                                |   O(n)    Linear time             |
|Add an element to the end of array, where array has space   |   O(1)    Constant time           |
|Insert or update element at specific index                  |   O(1)    Constant time           |
|Delete an element by setting it to null                     |   O(1)    Constant time           |
|Delete an element by shifting elements                      |   O(n)    Linear time             |
|------------------------------------------------------------------------------------------------|
 */
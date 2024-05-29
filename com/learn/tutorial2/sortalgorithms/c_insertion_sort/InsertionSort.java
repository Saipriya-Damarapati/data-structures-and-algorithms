package com.learn.tutorial2.sortalgorithms.c_insertion_sort;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = new int[] {20, 35, -15, 7, 55, 1, -22};

        System.out.print("Before Sorting : ");
        display(array);

        int newElement;

        for(int unsortedIndex = 1; unsortedIndex < array.length; unsortedIndex++) {
            newElement = array[unsortedIndex];
            int sortedIndex;
            for(sortedIndex = unsortedIndex; sortedIndex > 0; sortedIndex--) {
                if(array[sortedIndex - 1] > newElement) { // compare newElement to the previous value
                    array[sortedIndex] = array[sortedIndex - 1];
                } else { // until previous value is less than newElement or start of array is reached
                    break;
                }
            }
            array[sortedIndex] = newElement;
            display(array);
        }
    }

    private static void display(int[] a) {
        for (int ele : a) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}

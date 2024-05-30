package com.learn.tutorial2.challenges.challenge_02;

public class Solution {
    public static void main(String[] args) {

        int[] array = new int[] {20, 35, -15, 7, 55, 1, -22};

        System.out.print("Before Sorting : ");
        display(array);

        performInsertionSort(array, 1);

        System.out.print("After Sorting : ");
        display(array);
    }

    private static void performInsertionSort(int[] array, int unSortedIndex) {
        if(unSortedIndex == array.length) {
            return;
        }

        int newElement = array[unSortedIndex];
        int i;
        for(i = unSortedIndex; i > 0; i --) {
            if(array[i-1] > newElement) {
                array[i] = array[i-1];
            } else {
                break;
            }
        }
        array[i] = newElement;
        System.out.print("Result after unsortedIndex = " + unSortedIndex + " is processed ==>> ");
        display(array);
        performInsertionSort(array, ++unSortedIndex);
    }

    private static void display(int[] a) {
        for (int ele : a) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}

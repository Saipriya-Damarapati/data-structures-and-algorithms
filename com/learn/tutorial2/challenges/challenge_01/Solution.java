package com.learn.tutorial2.challenges.challenge_01;

public class Solution {

    public static void main(String[] args) {
        int[] array = new int[] {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Before Sorting : ");
        display(array);

        // end position is always endIndex + 1
        mergeSort(array, 0, array.length);

        System.out.println("After Sorting : ");
        display(array);
    }

    //{20, 35, -15, 7, 55, 1, -22}
    private static void mergeSort(int[] input, int start, int end) {
        if(end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        // end position is always endIndex + 1
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }


    //{20, 35, -15, 7, 55, 1, -22}
    // {35, 20, -15} {55, 7, 1, -22}
    // {55, 35, 20, 7, 1, -15
    private static void merge(int[] input, int start, int mid, int end) {

        if(input[mid - 1] >= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] tempArray = new int[end - start];

        while(i < mid && j < end) { // loop breaks when one of the sibling arrays is fully traversed
            tempArray[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
        }
        // if left array contains left over elements, they have to be manually copied
        // if right array contains left over elements, they are already in the right position

        System.arraycopy(input, i, input, start + tempIndex, mid - i); // copy untraversed elements of left array
        System.arraycopy(tempArray, 0, input, start, tempIndex);
    }

    private static void display(int[] a) {
        for (int ele : a) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
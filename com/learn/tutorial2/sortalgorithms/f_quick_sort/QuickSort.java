package com.learn.tutorial2.sortalgorithms.f_quick_sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[] {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Before Sorting : ");
        display(array);

        // end position is always endIndex + 1
        quickSort(array, 0, array.length);

        System.out.println("After Sorting : ");
        display(array);
    }

    private static void quickSort(int[] array, int start, int end) {

        if(end - start < 2) {
            return;
        }

        int pivotIndex = partition(array, start, end);

        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        // This is using the first element as the pivot
        int pivot = array[start];
        int i = start;
        int j = end;

        while (i < j) {

            // NOTE: This is an empty loop to traverse until an element greater than pivot is found
            while(i < j && array[--j] > pivot);
            // only assign if the loop has exited by finding an element greater than the pivot
            if(i < j) {
                array[i] = array[j];
            }
            // NOTE: This is an empty loop to traverse until an element less than pivot is found
            while (i < j && array[++i] < pivot);
            // only assign if the loop has exited by finding an element less than the pivot
            if(i < j) {
                array[j] = array[i];
            }

        }
        array[j] = pivot;
        return j;
    }

    private static void display(int[] a) {
        for (int ele : a) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}

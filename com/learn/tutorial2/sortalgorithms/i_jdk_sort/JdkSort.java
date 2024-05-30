package com.learn.tutorial2.sortalgorithms.i_jdk_sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JdkSort {

    public static void main(String[] args) {
        int[] array = new int[] {20, 35, -15, 7, 55, 1, -22};

        System.out.print("Before Sorting : ");
        display(array);

        // DualPivotQuicksort : This algorithm offers O(n log(n)) performance on all data sets,
        // and is typically faster than traditional (one-pivot) Quicksort implementations.
        Arrays.sort(array);

        // MergeSort with QuickSort
        // Arrays are split and quick sort is performed when the arrays reach minimum granularity
        // Uses ForkJoinPool of multi threading
        Arrays.parallelSort(array);

        System.out.print("After Sorting : ");
        display(array);
    }

    private static void display(int[] a) {
        for (int ele : a) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}

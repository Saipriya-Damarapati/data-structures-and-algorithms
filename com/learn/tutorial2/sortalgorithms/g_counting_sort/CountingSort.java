package com.learn.tutorial2.sortalgorithms.g_counting_sort;

public class CountingSort {
    public static void main(String[] args) {
        int[] array = new int[] {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Before Sorting : ");
        display(array);



        System.out.println("After Sorting : ");
        display(array);
    }

    private static void display(int[] a) {
        for (int ele : a) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}

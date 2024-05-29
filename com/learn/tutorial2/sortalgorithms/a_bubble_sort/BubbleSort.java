package com.learn.tutorial2.sortalgorithms.a_bubble_sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[] {20, 35, -15, 7, 55, 1, -22};

        System.out.print("Before Sorting : ");
        display(array);

        int i;
        int lastUnsortedIndex;

        // sort the array in ascending order
        // higher values are bubbled to the right
        for(lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i+1);
                }
            }
            display(array);
        }
    }

    /**
     *
     * @param a - is the array
     * @param i - index i whose value should be shifted to index j
     * @param j - index j whose value should be shifted to index i
     */
    private static void swap(int[] a, int i, int j) {
        if(i == j) {
            return;
        }
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void display(int[] a) {
        for (int ele : a) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}

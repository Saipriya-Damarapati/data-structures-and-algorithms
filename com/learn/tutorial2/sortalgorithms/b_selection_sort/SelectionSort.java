package com.learn.tutorial2.sortalgorithms.b_selection_sort;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[] {20, 35, -15, 7, 55, 1, -22};

        System.out.print("Before Sorting : ");
        display(array);

        int i;

        for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0; // index of the largest element
            for (i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largest]) {
                    largest = i;
                }
            }
            swap(array, lastUnsortedIndex, largest);
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

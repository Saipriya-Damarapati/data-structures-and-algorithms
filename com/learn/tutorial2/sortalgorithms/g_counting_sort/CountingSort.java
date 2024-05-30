package com.learn.tutorial2.sortalgorithms.g_counting_sort;

public class CountingSort {
    public static void main(String[] args) {
        int[] array = new int[] {2, 5, 9, 8, 2, 8, 7, 10, 4, 3, 0, 3, 0};

        System.out.println("Before Sorting : ");
        display(array);


        countingSort(array, findMin(array), findMax(array));

        System.out.println("After Sorting : ");
        display(array);
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private static void countingSort(int[] array, int min, int max) {
        int[] countingArray = new int[max - min + 1];

        // counting phase
        for(int i = 0; i < array.length; i++) {
            countingArray[array[i] - min]++;
        }

        System.out.println("Counting Array Values");
        for(int i = min; i <= max; i++) { // length of counting array
            System.out.println("count[" + i + "] = " + countingArray[i - min]);
        }

        int index = 0;
        for(int i = min; i <= max; i++) { // length of counting array
            for(int j = countingArray[i-min]; j > 0; j--) { // display only non-zero count of items
                array[index] = i;
                index++;
            }
        }
    }

    private static void display(int[] a) {
        for (int ele : a) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}

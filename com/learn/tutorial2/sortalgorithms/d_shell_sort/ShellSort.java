package com.learn.tutorial2.sortalgorithms.d_shell_sort;

public class ShellSort {

    public static void main(String[] args) {
        int[] array = new int[] {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Before Sorting : ");
        display(array);

        for(int gap = array.length / 2; gap > 0; gap = gap/2) {

            for(int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j;
                for(j = i; j >= gap && array[j - gap] > newElement; j = j-gap) {
                    array[j] = array[j - gap];
                }
                array[j] = newElement;
            }
            display(array);
        }
        display(array);
    }

    private static void display(int[] a) {
        for (int ele : a) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}

package com.learn.tutorial2.sortalgorithms.h_radix_sort;

public class RadixSort {

    public static void main(String[] args) {
        int[] array = new int[] {4725, 4586, 1330, 8792, 1594, 5729};

        System.out.println("Before Sorting : ");
        display(array);

        radixSort(array, 4, 10);

        System.out.println("After Sorting : ");
        display(array);
    }

    private static void radixSort(int[] array, int width, int radix) {
        for(int i = 1; i <= width; i++) {
            performRadixSort(array, i, radix); // to get 'i'th position from the right
            System.out.println("Sorted array based " + i + "th position from the right: ");
            display(array);
        }
    }

    private static void performRadixSort(int[] array, int position, int radix) {
        int[] countingArray = new int[radix];

        for(int i = 0; i < array.length; i++) {
            countingArray[getDigit(array[i], position)]++;
        }

        int[] adjustedCountingArray = new int[radix];
        int sum = 0;
        for(int i = 0; i < countingArray.length; i++) {
            sum = sum + countingArray[i];
            adjustedCountingArray[i] = sum;
        }

        int[] tmp = new int[array.length];
        for(int k = array.length - 1; k >= 0; k--) {
            tmp[--adjustedCountingArray[getDigit(array[k], position)]] = array[k];
        }
        System.arraycopy(tmp, 0, array, 0, array.length);
    }

    private static int getDigit(int number, int position) {

        if(position == 1) {
            return number % 10;
        }

        number = number / 10;
        return getDigit(number, --position);
    }

    private static void display(int[] a) {
        for (int ele : a) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}

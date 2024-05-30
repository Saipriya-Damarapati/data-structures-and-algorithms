package com.learn.tutorial2.challenges.challenge_03;

public class Solution {
    public static void main(String[] args) {
        String[] array = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        System.out.println("Before Sorting : ");
        display(array);

        radixSort(array, 5, 26);
        System.out.println("After Sorting : ");
        display(array);
    }

    private static void radixSort(String[] array, int width, int radix) {
        for(int i = 1; i <= width; i++) {
            performRadixSort(array, i, radix); // to get 'i'th position from the right
            System.out.print("Sorted array based " + i + "th position from the right: ");
            display(array);
        }
    }

    private static void performRadixSort(String[] array, int position, int radix) {
        int[] countingArray = new int[radix];

        for(String ele : array) {
            countingArray[getAlphabet(ele, position)]++;
        }

        int[] adjustedCountingArray = new int[radix];
        int sum = 0;
        for(int i = 0; i < countingArray.length; i++) {
            sum = sum + countingArray[i];
            adjustedCountingArray[i] = sum;
        }

        String[] tmp = new String[array.length];
        for(int k = array.length - 1; k >= 0; k--) {
            tmp[--adjustedCountingArray[getAlphabet(array[k], position)]] = array[k];
        }
        System.arraycopy(tmp, 0, array, 0, array.length);
    }

    private static int getAlphabet(String input, int position) {
        return input.charAt(input.length() - position) - 'a';
    }

    private static void display(String[] a) {
        for (String ele : a) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}

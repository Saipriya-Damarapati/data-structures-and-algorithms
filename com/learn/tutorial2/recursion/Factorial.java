package com.learn.tutorial2.recursion;

public class Factorial {

    public static void main(String[] args) {
        int i = 5;
        System.out.println("Factorial of " + i + " is " + factorial(i) );
    }

    private static int factorial(int i) {
        if(i == 0) {
            return 1;
        } else {
            return i * factorial(i - 1);
        }
    }
}

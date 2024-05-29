package com.learn.tutorial2.iterative;

public class Factorial {

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }

    private static int factorial(int num) {

        if(num == 0) {
            return 1;
        }

        int factorial = 1;
        for(int multiplier = 1; multiplier <= num; multiplier++) {
            factorial = multiplier * factorial;
        }
        return factorial;
    }
}

/*
Algorithm
----------
input = num
output = factorial

Step 1: If num = 0, factorial = 1, then stop, we have the result, otherwise
Step 2: Set multiplier = 1
Step 3: Set factorial = 1
Step 4: When multipier is less than or equal to number, do steps 5 & 6
Step 5: Multiply factorial by multiplier and assign result to factorial
Step 6: add 1 to factorial
Step 7: Stop, the result is factorial, after multiplier > num is reached
 */

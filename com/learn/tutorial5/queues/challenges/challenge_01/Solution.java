package com.learn.tutorial5.queues.challenges.challenge_01;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
        // should return false
        System.out.println(checkForPalindrome("saipriya"));
    }

    public static boolean checkForPalindrome(String string) {
        Deque<Character> stack = new ArrayDeque<>();
        Deque<Character> queue = new LinkedList<>();
        for(int i = 0; i < string.length(); i++) {
            char letter = string.toLowerCase().charAt(i);
            if(letter >= 'a' && letter <= 'z') {
                stack.push(letter);
                queue.add(letter);
            }
        }
        System.out.println("------------------------------------");
        System.out.print("Stored in stack as = ");
        stack.stream().forEach(System.out::print);
        System.out.println();
        System.out.print("Stored in queue as = ");
        queue.stream().forEach(System.out::print);
        System.out.println();
        while (!stack.isEmpty()){
            Character popFromStack = stack.pop();
            Character popFromQueue = queue.remove();
            if(!popFromQueue.equals(popFromStack)) {
                return false;
            }
        }
        return true;
    }
}

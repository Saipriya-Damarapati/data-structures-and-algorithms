package com.learn.tutorial4.challenges.challenge_01;

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
    }

    public static boolean checkForPalindrome(String string) {
        LinkedStack stack = new LinkedStack();
        StringBuilder original = new StringBuilder();
        for(int i = 0; i < string.length(); i++) {
            char letter = string.toLowerCase().charAt(i);
            if(letter >= 'a' && letter <= 'z') {
                stack.push(letter);
                original.append(letter);
            }
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            Character poppedChar = stack.pop();
            reversed.append(poppedChar);
        }
        if(original.compareTo(reversed) == 0) {
            return true;
        }
        return false;
    }
}

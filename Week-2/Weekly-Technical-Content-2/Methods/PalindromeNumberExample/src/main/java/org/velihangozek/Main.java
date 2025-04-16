package org.velihangozek;

public class Main {
    public static void main(String[] args) {

        // Palindrome - 121, 8998, 424...
        // Not Palindrome - 123 -> 321 - X

        int number = 923;

        if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome :)");
        } else {
            System.out.println(number + " is NOT a Palindrome :(");
        }
    }

    public static boolean isPalindrome(Integer number) {

        String numberString = number.toString();
        StringBuilder builder = new StringBuilder(numberString);
        String reversedNumberString = builder.reverse().toString();

        if (numberString.equals(reversedNumberString)) {
            return true;
        } else {
            return false;
        }

    }
}
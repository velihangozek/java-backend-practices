package org.velihangozek;

import java.util.Scanner;

public class DifferentApproach {
    public static void main(String[] args) {

        // Palindrome - 121, 8998, 424...
        // Not Palindrome - 123 -> 321 - X

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a limit: ");
        int limit = scanner.nextInt();

        for (int i = 1; i <= limit; i++) {
            boolean isPalindromeNumber = isPalindrome(i);

            if (isPalindromeNumber) {
                System.out.println(i + " is a palindrome number!");
            } else {
                System.out.println(i + " is NOT a palindrome number :(");
            }
        }

    }

    private static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            number /= 10; // number = number / 10;
        }

        return originalNumber == reversedNumber;
    }
}

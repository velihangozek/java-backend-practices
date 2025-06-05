package org.velihangozek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 123 -> 1 + 2 + 3 = 6

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number => ");
        int number = scanner.nextInt();

        int sumOfDigits = sumDigits(number);
        System.out.println("Sum of digits => " + sumOfDigits);

    }

    private static int sumDigits(int number) {
        if (number == number / 10) return (number/10);
        return (number % 10) + sumDigits(number / 10);
    }
}
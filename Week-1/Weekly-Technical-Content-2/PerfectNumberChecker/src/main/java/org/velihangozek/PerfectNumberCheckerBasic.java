package org.velihangozek;

import java.util.Scanner;

public class PerfectNumberCheckerBasic {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter a positive integer to determine if it is a perfect number: ");

            int number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Number must be positive!");
                return;
            }

            int sumOfMultiples = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sumOfMultiples += i;
                }
            }

            boolean isPerfect = false;

            if (sumOfMultiples == number) {
                isPerfect = true;
                System.out.println(number + " is a PERFECT number!");
            } else {
                System.out.println(number + " is NOT a perfect number :(");
            }
        }
    }
}
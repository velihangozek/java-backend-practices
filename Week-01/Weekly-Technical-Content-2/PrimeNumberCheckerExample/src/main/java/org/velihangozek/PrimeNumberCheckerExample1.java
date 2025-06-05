package org.velihangozek;

import java.util.Scanner;

public class PrimeNumberCheckerExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer to check whether it is a prime or not: ");

        int number = scanner.nextInt();
        boolean isPrime = false;

        if (number == 0 || number == 1) {
            isPrime = false;
        }

        if (number == 2) {
            isPrime = true;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
            isPrime = true;
        }

        if (isPrime) {
            System.out.println(number + " is PRIME");
        } else {
            System.out.println(number + " is NOT PRIME!");
        }

    }
}
package org.velihangozek;

import java.util.Scanner;

public class PrimeNumberCheckerExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer to check primeness until that number: ");

        int numberLimit = scanner.nextInt();

        for (int i = 0; i <= numberLimit; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is PRIME");
            } else {
                System.out.println(i + " is NOT PRIME");
            }
        }


    }

    private static boolean isPrime(int number) {
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
        return isPrime;
    }
}

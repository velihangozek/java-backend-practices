package org.velihangozek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            int number = readValidInt(scanner, "Enter an integer to check primeness: ");

            if (isPrimeNumber(number)) {
                System.out.println(number + " is a Prime Number :)");
            } else {
                System.out.println(number + " is NOT a Prime Number :(");
            }

        }

    }

    private static int readValidInt(Scanner scanner, String prompt) {
        System.out.println(prompt);

        while (!scanner.hasNextInt()) {
            System.out.println("Enter a valid integer number! => ");
            scanner.nextLine();
        }

        return scanner.nextInt();
    }

    /**
     * Public entry‑point: rules out ≤1, then starts recursion
     */
    private static boolean isPrimeNumber(int number) {

        if (number <= 1) return false; // 1, 0 and negatives are not prime.

        return isPrimeRecursive(number, number - 1); // testing divisors from number-1 down to 2
    }

    /**
     * Recursive helper that checks if `number` is divisible by any d ≥ 2.
     * Base case: if d reaches 1, we've found no divisors → it's prime.
     */
    private static boolean isPrimeRecursive(int number, int divisor) {

        if (divisor == 1) return true; // tested all the way down to 1 — no divisors found

        if (number % divisor == 0) return false; // found a divisor → not prime

        return isPrimeRecursive(number, divisor - 1); // // try the next smaller divisor

    }
}
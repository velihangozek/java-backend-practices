package org.velihangozek;

import java.util.Scanner;

public class PerfectNumberCheckerOptimized {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter a positive integer to determine if it is a perfect number: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid positive integer!!!");
                return;
            }

            int number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Please enter a positive integer!!!");
                return;
            }

            System.out.printf("%d %s%n", number, isPerfect(number) ? "is Perfect!" : "is NOT Perfect!");
        }
    }

    private static boolean isPerfect(int number) {
        if (number <= 1) return false;

        int sum = 1;
        int limit = (int) Math.sqrt(number);

        for (int i = 2; i <= limit; i++) {
            if (number % i == 0) {
                sum += i + (i != number / i ? number / i : 0);
            }
        }
        return sum == number;
    }
}
package org.velihangozek;

import java.util.Scanner;

public class FindEvenUntilInput {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println("Please enter a non-negative integer to find the even numbers until that limit: ");
            int limit = scanner.nextInt();
            scanner.nextLine();
            if (limit < 0) {
                System.out.println("Limit must be >= 0");
                return;
            }

            for (int i = 0; i <= limit; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                }
            }
        }
    }
}
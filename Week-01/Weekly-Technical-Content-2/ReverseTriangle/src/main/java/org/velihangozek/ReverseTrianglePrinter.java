package org.velihangozek;

import java.util.Scanner;

public class ReverseTrianglePrinter {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Please enter a number of steps to produce for reverse triangle: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid integer!");
                return;
            }

            int steps = scanner.nextInt();

            if (steps <= 0) {
                System.out.println("Please enter a positive integer!!!");
                return;
            }
            printReverseTriangle(steps);
        }
    }

    private static void printReverseTriangle(int steps) {
        for (int i = steps; i > 0; i--) {
            int stars = 2 * i - 1;
            System.out.print("*".repeat(stars));
            if (i > 1) {
                System.out.println();
            }
        }
    }
}
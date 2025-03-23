package org.velihangozek;

import java.util.Scanner;

public class FindAverageOfInputDividedByThreeAndFour {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);) {

            System.out.println("Please enter a non-negative integer limit to check until that number -> the average of the numbers which is divisible by 3 and 4: ");

            int limit = scanner.nextInt();

            if (limit < 0) {
                System.out.println("Please enter an integer >= 0");
                return;
            }

            int count = 0;
            double sum = 0.0;

            for (int i = 1; i <= limit; i++) {
                if (i % 3 == 0 && i % 4 == 0) {
                    sum += i;
                    count++;
                }
            }

            if (count == 0) {
                System.out.println("No numbers divisible by 3 and 4 up to " + limit);
            } else {
                System.out.printf("The average of the numbers divisible by 3 and 4 until the input = %d --> = %.2f%n", limit, (sum / count));
            }
        }
    }
}
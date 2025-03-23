package org.velihangozek;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class InputMinMaxFinder {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println("How many numbers do you want to enter to find their min and max?: ");
            int arraySize = scanner.nextInt();
            if (arraySize <= 0) {
                System.out.println("Must enter a positive count.");
                return;
            }
            double[] numbers = new double[arraySize];
            System.out.println("Now enter " + arraySize + " numbers: ");
            for (int i = 0; i < numbers.length; i++) numbers[i] = scanner.nextDouble();

            double min = numbers[0], max = numbers[0];
            for (double value : numbers) {
                if (value < min) min = value;
                if (value > max) max = value;
            }
            System.out.println("Entered numbers = " + Arrays.toString(numbers));
            System.out.println("Minimum number = " + min);
            System.out.println("Maximum number = " + max);
        }
    }
}
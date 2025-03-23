package org.velihangozek;

import java.util.Scanner;

public class FibonacciSeriesExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number for fibonacci series: ");

        int number = scanner.nextInt();

        // fibonacci --> 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...

        if (number < 1) {
            System.out.println("Please enter an integer of 1 or greater than 1 ");
            return;
        }

        int number1 = 0;
        int number2 = 1;

        System.out.print("0");
        while (number2 <= number) {
            System.out.print(", " + number2);
            int nextNumber = number1 + number2;
            number1 = number2;
            number2 = nextNumber;

        }
    }
}
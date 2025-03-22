package org.velihangozek;

import java.util.Scanner;

public class LoopAndIfExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number to calculate the factorial: ");

        int factorial = scanner.nextInt();

        int sum = 1;

        for (int i = 1; i <= factorial; i++) {
            sum *= i;
        }

        System.out.println("Factorial is " + sum);

    }
}

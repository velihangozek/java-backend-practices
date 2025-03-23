package org.velihangozek;

import java.util.Scanner;

public class OddEvenCheckerExample2WithWhile {
    public static void main(String[] args) {
        System.out.println("Please enter a number limit to check the evenness/oddness of the numbers until the input number limit: ");

        Scanner scanner = new Scanner(System.in);

        int numberLimit = scanner.nextInt();
        scanner.nextLine();

        int i = 0;

        while(i <= numberLimit) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
                i++;
            } else {
                System.out.println(i + " is odd");
                i++;
            }
        }
    }
}

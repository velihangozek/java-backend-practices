package org.velihangozek;

import java.util.Scanner;

public class LoopAndIfExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number to check : ");

        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + " is positive!");
        } else if (number < 0) {
            System.out.println(number + " is negative!");
        } else {
            System.out.println(number + " is ZERO (0)!");
        }
    }
}
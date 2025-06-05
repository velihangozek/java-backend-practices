package org.velihangozek;

import java.util.Arrays;
import java.util.Scanner;

public class CountNumberArrayExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the array size: ");

        int size = scanner.nextInt();

        int[] numbersToBeCounted = new int[size];

        System.out.println("Please enter the number to search: ");

        int search = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < numbersToBeCounted.length; i++) {
            System.out.println("Please enter " + i + ". value = ");
            numbersToBeCounted[i] = scanner.nextInt();
            if (search == numbersToBeCounted[i]) {
                count++;
            }
        }

        System.out.println("Array = " + Arrays.toString(numbersToBeCounted));
        System.out.println("Size = " + size + ", Number to search = " + search + ", Appearance = " + count);

    }
}
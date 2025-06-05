package org.velihangozek;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the desired size : ");

        int size = scanner.nextInt();

        int[] numbersToBeSorted = new int[size];

        System.out.println("Please enter " + size + " values => ");

        for (int i = 0; i < numbersToBeSorted.length; i++) {
            System.out.print("Please enter " + (i+1) + ". value = ");
            numbersToBeSorted[i] = scanner.nextInt();
        }

        Arrays.sort(numbersToBeSorted);

        System.out.println(Arrays.toString(numbersToBeSorted));
    }
}
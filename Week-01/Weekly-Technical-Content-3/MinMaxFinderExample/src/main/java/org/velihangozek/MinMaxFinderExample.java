package org.velihangozek;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxFinderExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter how many elements you want: ");
        
        int arraySize = scanner.nextInt();

        int[] inputArray = new int[arraySize];

        System.out.println(arraySize + " adet sayı giriniz => ");

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println((i+1) + ". sayıyı giriniz: ");
            inputArray[i] = scanner.nextInt();
        }

        int max = inputArray[0];
        int min = inputArray[0];

        for (int value : inputArray) {
            if (value > max) max = value;
            if (value < min) min = value;
        }

        System.out.println("The array = " + Arrays.toString(inputArray) + ", Minimum value = " + min + ", Maximum value = " + max);

    }
}
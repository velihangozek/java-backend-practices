package org.velihangozek;

public class Main {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6};

        System.out.println("\nOriginal array => \n");

        printArray(originalArray);

        int[] copyArray = new int[originalArray.length];

        for (int i = 0; i < copyArray.length; i++) {
            copyArray[i] = originalArray[i];
        }

        System.out.println("\nCopy array => \n");

        printArray(copyArray);

        System.out.print("\nAre copy array and original array the same object? " + (copyArray == originalArray));

        System.out.println();
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
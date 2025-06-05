package org.velihangozek;

public class ArrayClone {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6};

        System.out.println("\nOriginal array => \n");

        printArray(originalArray);

        int[] copyArray = new int[originalArray.length];

        copyArray = originalArray.clone();

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

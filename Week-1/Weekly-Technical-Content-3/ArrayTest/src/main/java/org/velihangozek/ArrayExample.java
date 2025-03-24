package org.velihangozek;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 9, 13, -5, 36, -267, 59};

        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("The array -> " + Arrays.toString(numbers) + ", Maximum number -> " + max);
    }

}

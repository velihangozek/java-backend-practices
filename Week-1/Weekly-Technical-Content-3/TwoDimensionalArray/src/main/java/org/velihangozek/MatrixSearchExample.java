package org.velihangozek;

import java.util.Scanner;

public class MatrixSearchExample {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.println("Please enter a value: ");

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        boolean isFound = false;

        outer:
        for (int i = 0; i < matrix.length; i++) {
            inner:
            for (int j = 0; j < matrix[i].length; j++) {
                if (input == matrix[i][j]) {
                    System.out.println("Number = " + input + " found in the matrix! Position --> " + i + ", " + j);
                    isFound = true;
                    break outer;
                }
            }
        }

        if (!isFound) {
            System.out.println("Number = " + input + " could NOT found...");
        }

    }
}

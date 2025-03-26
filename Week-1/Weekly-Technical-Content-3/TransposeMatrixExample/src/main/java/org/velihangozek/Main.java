package org.velihangozek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println("\nPlease enter the desired matrix sizes.\n");

            System.out.print("Please enter the row size => ");

            int rows = readPositiveValidInt(scanner);

            System.out.print("\nPlease enter the column size => ");

            int columns = readPositiveValidInt(scanner);

            int[][] matrix = new int[rows][columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.printf("\nFor the desired matrix => [%s][%s] , please enter the [%d][%d]. element => ", rows, columns, i, j);
                    matrix[i][j] = readValidInt(scanner);
                }
            }

            System.out.println("\nThe desired matrix => \n");

            printMatrix(matrix);

            System.out.println("\nThe transpose of the matrix => \n");

            printMatrix(MatrixUtils.transpose(matrix));
        }
    }

    private static int readPositiveValidInt(Scanner scanner) {
        while (true) {
            try {
                int value = scanner.nextInt();
                if (value > 0) return value;
                System.out.println("Must be > 0");
            } catch (InputMismatchException exception) {
                scanner.nextLine();
                System.out.println("Please enter a valid positive integer!");
            }
        }
    }

    private static int readValidInt(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException exception) {
                scanner.nextLine();
                System.out.println("Please enter a valid integer!");
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.printf("%4d", cell);
            }
            System.out.println();
        }
    }
}
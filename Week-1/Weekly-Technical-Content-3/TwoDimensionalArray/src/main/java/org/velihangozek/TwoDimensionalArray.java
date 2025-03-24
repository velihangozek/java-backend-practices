package org.velihangozek;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = new int[2][3];

        matrix[0][0] = 0;
        matrix[0][1] = 1;
        matrix[0][2] = 2;

        matrix[1][0] = 3;
        matrix[1][1] = 4;
        matrix[1][2] = 5;

        System.out.println("\nforeach : \n");

        for (int[] outer : matrix) {
            for (int inner : outer) {
                System.out.print(inner);
            }
            System.out.println();
        }

        System.out.println("\nfor : \n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf(" %d ", matrix[i][j]);
            }
            System.out.println();
        }

    }
}
package org.velihangozek;

public final class MatrixUtils {

    private MatrixUtils() {

    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposeMatrix = new int[columns][rows];
        for (int i = 0; i < columns; i++) {           //--> [0][0] -> [0][0], [0][1] -> [1][0], [0][2] -> [2][0]
            for (int j = 0; j < rows; j++) {          //--> [1][0] -> [0][1], [1][1] -> [1][1], [1][2] -> [2][1]
                transposeMatrix[i][j] = matrix[j][i]; // 1 2 3 -> 1 4
            }                                         // 4 5 6 -> 2 5
                                                      //       -> 3 6
        }
        return transposeMatrix;
    }
}

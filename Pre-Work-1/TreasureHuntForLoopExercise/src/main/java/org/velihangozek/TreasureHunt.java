package org.velihangozek;

import java.util.Random;

public class TreasureHunt {
    public static void main(String[] args) {

            int[][] treasureMap = new int[5][5];
            Random randomNumber = new Random();

            // Task 1: Fill the grid using a for loop
            for (int i = 0; i < treasureMap.length; i++) {
                for (int j = 0; j < treasureMap[i].length; j++) {
                    treasureMap[i][j] = randomNumber.nextInt(50) + 1; // numbers between 1 and 50
                }
            }

            // Task 2: Display the grid using a for-each loop
            System.out.println("\nTreasure Map: \n");
            for (int[] treasureRow : treasureMap) {
                for (int number : treasureRow) {
                    System.out.printf("%2d ", number); // Printing the numbers as 2 digits (decimal format) for padding and alignment.
                }
                System.out.println();
            }

            // Task 3: Find the treasure (12) using a labeled loop
            boolean treasure = false;
            search:
            for (int i = 0; i < treasureMap.length; i++) {
                inner:
                for (int j = 0; j < treasureMap[i].length; j++) {
                    if (treasureMap[i][j] == 12) {
                        System.out.println("\nTreasure is found!!! :) Coordinates are -> row: " + i + ", column: " + j);
                        treasure = true;
                        break search;
                    }
                }
            }
            if (!treasure) {
                System.out.println("\nTreasure not found! :(");
            }
        }
    }
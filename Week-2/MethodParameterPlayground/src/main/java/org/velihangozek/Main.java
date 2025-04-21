package org.velihangozek;

import java.util.Scanner;

public class Main {
    private static void printAverage(int firstNumber, int secondNumber, int thirdNumber) {
        double sum = firstNumber + secondNumber + thirdNumber;
        double average = sum / 3;
        System.out.println(average);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int thirdNumber = scanner.nextInt();
        System.out.println("The average = ");
        printAverage(firstNumber, secondNumber, thirdNumber);
    }
}
package org.velihangozek;
import java.util.Scanner;

public class SecondCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Another Approach
        System.out.println("\nPlease enter the first number to be operated: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("\nPlease enter the second number to be operated: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("\nPlease select an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println("\nResult: " + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("\nResult: " + (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println("\nResult: " + (firstNumber * secondNumber));
                break;
            case '/':
                if (secondNumber != 0) {
                    System.out.println("\nResult: " + (firstNumber / secondNumber));
                } else {
                    System.out.println("\nNumber cannot be divided by zero!");
                }
                break;
            default:
                System.out.println("\nInvalid operation!");
        }
    }
}

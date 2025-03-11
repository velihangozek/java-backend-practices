package org.velihangozek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Calculator Example
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n1 => Addition");
        System.out.println("2 => Subtraction");
        System.out.println("3 => Multiplication");
        System.out.println("4 => Division");

        System.out.print("\nPlease enter an integer from 1 to 4 to perform a mathematical operation: ");

        int mathematicalOperation = scanner.nextInt();

        if (mathematicalOperation != 1 && mathematicalOperation != 2 && mathematicalOperation != 3 && mathematicalOperation != 4) {
            System.out.println("Please enter a valid number to perform a mathematical operation");
        } else {
            switch (mathematicalOperation) {
                case 1:
                    System.out.println("First number: ");
                    int add1 = scanner.nextInt();
                    System.out.println("Second number: ");
                    int add2 = scanner.nextInt();
                    int sum = add1 + add2;
                    System.out.println("Sum is: " + sum);
                    break;
                case 2:
                    System.out.println("First number: ");
                    int subtract1 = scanner.nextInt();
                    System.out.println("Second number: ");
                    int subtract2 = scanner.nextInt();
                    int subtraction = subtract1 - subtract2;
                    System.out.println("Subtraction is: " + subtraction);
                    break;
                case 3:
                    System.out.println("First number: ");
                    int multiply1 = scanner.nextInt();
                    System.out.println("Second number: ");
                    int multiply2 = scanner.nextInt();
                    int multiplication = multiply1 * multiply2;
                    System.out.println("Multiplication is: " + multiplication);
                    break;
                case 4:
                    System.out.println("First number: ");
                    int divide1 = scanner.nextInt();
                    System.out.println("Second number: ");
                    int divide2 = scanner.nextInt();
                    if (divide2 == 0) {
                        System.out.println("Number cannot be divided by 0.");
                    } else {
                        int division = divide1 / divide2;
                        System.out.println("Division is: " + division);
                    }
                    break;
            }
        }
    }
}
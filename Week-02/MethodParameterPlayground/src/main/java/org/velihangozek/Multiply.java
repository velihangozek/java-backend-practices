package org.velihangozek;

public class Multiply {
    public static void main(String[] args) {
        int multiplication = multiply(4, 7);
        System.out.println("Multiplication = " + multiplication);
    }
    private static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}

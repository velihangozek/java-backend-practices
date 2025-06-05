package org.velihangozek;

public class AddNumbers {
    public static void main(String[] args) {
        int sum = addNumbers(4, 7);
        System.out.println("Sum is = " + sum);
    }
    private static int addNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}

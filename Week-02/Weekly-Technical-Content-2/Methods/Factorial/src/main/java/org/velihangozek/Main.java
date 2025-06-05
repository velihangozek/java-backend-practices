package org.velihangozek;

public class Main {
    public static void main(String[] args) {
        int number  = 6;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " => " + result);
    }

    // 5! = 5 * 4 * 3 * 2 * 1 = 120

    public static int factorial(int number) {
        if (number == 1 || number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
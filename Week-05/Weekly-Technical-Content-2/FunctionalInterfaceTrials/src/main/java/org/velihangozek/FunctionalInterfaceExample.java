package org.velihangozek;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MathOperation sum = (number1, number2) -> number1 + number2;
        MathOperation multiply = (a, b) -> a * b;

        // var multiply2 = (a, b) -> a * b;

        System.out.println("Summation => " + sum.operate(3, 6));
        System.out.println("Multiplication => " + multiply.operate(2, 7));


    }
}
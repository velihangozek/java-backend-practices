package org.velihangozek;

public class Main {

    public static void main(String[] args) {

        // addNumbers(3, 7);

        // double result = addNumbers(4.0, 7);
        // System.out.println("Double result => " + result);

        Calculation calculation = new Calculation();

        calculation.showTitle();

        int numberForSquare = 4;
        int squareResult = calculation.calculateSquare(numberForSquare);
        System.out.println("Square result of " + numberForSquare + " => " + squareResult);

        int number1 = 10;
        int number2 = 3;
        calculation.addNumbers(number1, number2);

        double returnedNumber = calculation.returnNumber();
        System.out.println("Returned number => " + returnedNumber);

        calculation.returnNumberEmpty();
    }
}
package org.velihangozek;

public class Calculation {

    double pi = 3.14;

    public void showTitle() {
        System.out.println("Welcome!!!");
    }

    public int calculateSquare(int number) {
        return number * number;
    }

    protected void addNumbers(int number1, int number2) {

        int result = number1 + number2;

        System.out.println("Integer sum => " + result);

    }

    private double addNumbers(double number1, double number2) {

        return number1 + number2;

    }

    double returnNumber() {
        double pi = 3;
        return 10.0 * pi;

    }

    protected void returnNumberEmpty() {

        System.out.println(10 * pi);
        // empty but valid method

    }
}

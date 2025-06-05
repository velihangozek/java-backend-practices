package org.velihangozek;

public class SecondLocalClass {
    public void calculate(int firstNumber, int secondNumber) {
        class LocalCalculation {
            public int sum() {
                return firstNumber + secondNumber;
            }
            public int subtract() {
                return firstNumber - secondNumber;
            }
        }

        LocalCalculation calculation = new LocalCalculation();
        System.out.println("Subtraction => " + firstNumber + " - " + secondNumber + " = " + calculation.subtract());
        System.out.println("Summation => " + firstNumber + " + " + secondNumber + " = " + calculation.sum());
    }
}

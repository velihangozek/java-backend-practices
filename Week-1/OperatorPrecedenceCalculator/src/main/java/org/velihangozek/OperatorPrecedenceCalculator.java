package org.velihangozek;

public class OperatorPrecedenceCalculator {
    private final double firstOperand;
    private final double secondOperand;
    private final double thirdOperand;

    public OperatorPrecedenceCalculator(double firstOperand, double secondOperand, double thirdOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.thirdOperand = thirdOperand;
    }

    public double operate() {
        return (firstOperand + secondOperand * thirdOperand - secondOperand);
    }
}
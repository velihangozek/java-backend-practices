package org.velihangozek;

public class InvestmentAccount extends Account{

    private double riskFactor;

    public InvestmentAccount(double balance) {
        super(balance);
    }

    public double getRiskFactor() {
        return riskFactor;
    }

    public void setRiskFactor(double riskFactor) {
        this.riskFactor = riskFactor;
    }
}

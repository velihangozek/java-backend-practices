package org.velihangozek;

public class AccountTest {

    public static void main(String[] args) {

        //Account account = new Account();

        SavingAccount savingAccount = new SavingAccount(100, 5000);
        // savingAccount.setInterestRate(5000);

        InvestmentAccount investmentAccount = new InvestmentAccount(15000);
        investmentAccount.setRiskFactor(8000);

    }

}

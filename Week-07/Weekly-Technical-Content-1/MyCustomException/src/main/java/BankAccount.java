public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. The amount: " + amount + " is more than the balance: " + balance);
        }

        balance -= amount;

        System.out.println(amount + " withdrawn from the account successfully! Remaining balance: " + balance);

    }
}
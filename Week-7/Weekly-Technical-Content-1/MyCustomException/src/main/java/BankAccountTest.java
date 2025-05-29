public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(1500);

        try {
            bankAccount.withdraw(3000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
            ;
        }

        System.out.println("Ongoing operations...");

    }
}
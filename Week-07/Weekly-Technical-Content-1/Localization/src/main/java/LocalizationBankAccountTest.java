import exceptions.InsufficientBalanceException;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationBankAccountTest {

    public static void main(String[] args) {

        Locale enLocale = Locale.ENGLISH;

        Locale deLocale = Locale.GERMANY;

        Locale trlocale = new Locale("tr", "TR");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", trlocale);

        BankAccount bankAccount = new BankAccount(100, resourceBundle);
        try {
            bankAccount.withdraw(150);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

    }

}
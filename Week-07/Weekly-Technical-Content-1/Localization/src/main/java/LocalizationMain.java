import jdk.jshell.execution.LoaderDelegate;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationMain {

    public static void main(String[] args) {

        Locale enLocale = Locale.ENGLISH;

        Locale deLocale = Locale.GERMANY;

        Locale trlocale = new Locale("tr", "TR");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", trlocale);

        System.out.println(resourceBundle.getString("hello"));

        ResourceBundle resourceBundle2 = ResourceBundle.getBundle("messages", enLocale);

        System.out.println(resourceBundle2.getString("hello"));

        ResourceBundle resourceBundle3 = ResourceBundle.getBundle("messages", deLocale);

        System.out.println(resourceBundle3.getString("hello"));

    }
}
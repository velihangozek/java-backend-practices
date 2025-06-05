import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        // System.out.println(numbers[5]); // UncheckedException

        //System.out.println(numbers[5]); // UncheckedException
        String name = null;
        //System.out.println(name.toUpperCase());
        try {
            readFile();
            // TODO - do some file modifications.
            // TODO - save the file to another destination.

            throw new IOException();
            //throw new SQLException();


            //} catch (FileNotFoundException e) {
            // throw new RuntimeException(e);
            // System.out.println("File not found");
            //} catch (IOException | SQLException e) {
            //throw new RuntimeException(e);
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("File not found");
        }

    }

    private static void readFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("text.txt"));
    }
}

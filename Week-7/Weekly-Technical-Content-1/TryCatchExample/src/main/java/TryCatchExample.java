import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchExample {
    public static void main(String[] args) {

        String[] numbers = {"1", "2"};
        String[] numbers2 = {"patika", "2"};

        try {

            // System.out.println(Integer.parseInt(numbers[0]));
            // System.out.println(Integer.parseInt(numbers2[0])); // NumberFormatException
            // System.out.println(Integer.parseInt(numbers2[3]));
            System.out.println(Integer.parseInt(numbers2[0]));
            // Protected Code
            method();
        } catch (ArrayIndexOutOfBoundsException | FileNotFoundException | NumberFormatException e) {
            System.out.println("Parsing error! -> " + e.getMessage());
            System.out.println("Error cause -> " + e.getCause());
        } catch (IOException e) {
            // Exception Handler
            // throw new RuntimeException(e);
            System.out.println(e.getMessage());
        } finally {
            // Always runs - Finally Block must be at the end!
            System.out.println("Always passed to finally block!");
        }

        try {
            System.out.println(5 / 0);
        } catch (Exception e) {
            System.out.println("RuntimeException occured! -> " + e.getMessage());
        }// catch (ArithmeticException e) {
        // System.out.println("An error occured! -> " + e.getMessage());
        // }
    }

    private static void method() throws IOException {
        throw new IOException("An error occurred!");
    }
}

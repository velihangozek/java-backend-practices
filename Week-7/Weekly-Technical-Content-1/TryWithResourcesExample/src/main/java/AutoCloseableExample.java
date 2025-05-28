import java.io.IOException;

public class AutoCloseableExample {
    public static void main(String[] args) {

        try (MyCustomFileReader myCustomFileReader = new MyCustomFileReader()) {

            System.out.println("Try Block");
            throw new IOException("Error occurred!");
        } catch (Exception e) {
            System.out.println("Catch Block Runs!");
        } finally {
            System.out.println("Finally Block ALWAYS Runs!");
        }
    }
}

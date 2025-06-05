import java.io.FileNotFoundException;

public class ThrowingExceptionExample {
    public static void main(String[] args) {

        try {
            throw new FileNotFoundException("File not found");
        } catch (Exception e) {
            System.out.println(e + "\n");
           // System.out.println(e.getCause());
            System.out.println(e.getMessage() + "\n");
            e.printStackTrace();
        }

        //throw new Exception();
        // throw new Exception("Oh my god! An error occurred!"); // does not compile if there are more than
        // one throw beforehand - means unreachable

        // throw RuntimeException(); -> does not compile because of non-existent "new" keyword.

        // method(); // does not compile because still an error being thrown.
    }

    private static void method() throws FileNotFoundException {
        throw new FileNotFoundException("File not found");
    }
}

import java.io.FileReader;

public class MyCustomFileReader implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closed Resources!");
    }
}

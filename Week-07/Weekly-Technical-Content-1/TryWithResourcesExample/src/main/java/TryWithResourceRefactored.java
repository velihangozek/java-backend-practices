import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourceRefactored {
    public static void main(String[] args) {

        String filePath = "text.txt";

        try (var in = new FileInputStream(filePath);
             var out = new FileOutputStream("output.txt")) {
            // Operations on the file
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        var in = new FileInputStream(filePath);
//        try (in) {
//            // Operations on the file
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

    }
}

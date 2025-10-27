import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {

    public static void main(String[] args) throws IOException {

        String content = "Hello FileWriter! - 3";

        try (FileWriter writer = new FileWriter("docs/written_file.txt", false)) { // FileWriter object is created with append mode active

            writer.write("\nHello Java World! - 3\n");
            writer.write(content);
            System.out.println("File written successfully!");

        }

    }

}
import java.io.*;

public class FileWriterReaderMain {

    public static void main(String[] args) throws IOException {

        var file = new File("docs/source.txt");

        try (
                FileReader reader = new FileReader(file);
                FileWriter writer = new FileWriter("docs/destination.txt")
        ){

            int character;

            while ((character = reader.read()) != -1) {

                writer.write((char) character);

            }

            System.out.println("File successfully copied!");

        }

    }

}
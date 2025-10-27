import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {

    public static void main(String[] args) throws IOException {

        var file = new File("c:/Users/velih/OneDrive/Masaüstü/Velo/Patika Plus Patika Dev Java Backend Bootcamp/Cohort Content/Week-08/ReaderWriter/docs/veriler.txt");

        try (FileReader reader = new FileReader(file)) {

            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

        }

    }

}
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamMain {

    public static void main(String[] args) throws IOException {

        File file = new File("c:/Users/velih/OneDrive/Masaüstü/Velo/Patika Plus Patika Dev Java Backend Bootcamp/Cohort Content/Week-08/Streams/docs/veriler.txt");
        System.out.println("size: " + file.length());

        FileInputStream fis = new FileInputStream(file);

        // 1 Byte = 8 Bits. Example => 10101010
        int bayt;

        while ((bayt = fis.read()) != -1) {

            System.out.println("Byte: " + bayt + " - Char: " + (char) bayt);

        }

    }

}
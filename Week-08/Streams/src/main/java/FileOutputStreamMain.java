import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMain {

    public static void main(String[] args) throws IOException {

        File file = new File("c:/Users/velih/OneDrive/Masaüstü/Velo/Patika Plus Patika Dev Java Backend Bootcamp/Cohort Content/Week-08/Streams/docs/output.txt");

        System.out.println("size: " + file.length());

        System.out.println("Does the file exist? => " + file.exists());

        FileOutputStream fos = new FileOutputStream(file);

        String data = "Hello IO Stream! Greetings from velihan :)";

        fos.write(data.getBytes());
        fos.close();

    }

}
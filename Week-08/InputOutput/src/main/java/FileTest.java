import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest {

    public static void main(String[] args) {

        System.out.println(System.getProperty("file.separator"));

        //C:\User\velo\Documents\java\firstcourse.txt

        // Unix -> /
        // Windows -> \

        Path path = Paths.get("java-courses/java1.txt");

        System.out.println("File Path => " + path);

        Path path1 = Paths.get("data/example.txt");

        System.out.println(path1.toAbsolutePath());

        File directory = new File("New folder");

        if (!directory.exists()) {
            boolean isCreated = directory.mkdir();

            System.out.println("Is the folder created? " + isCreated);

            System.out.println(directory.getAbsolutePath());
        } else {
            System.out.println("Directory already exists!");
        }

        System.out.println("--------------------------------");

        //var file = new File("C:/Users/velih/OneDrive/Masaüstü/Velo/Patika Plus Patika Dev Java Backend Bootcamp/Cohort Content/Week-08/InputOutput/New folder/test.txt");
        var file = new File("C:/Users/velih/OneDrive/Masaüstü/Velo/Patika Plus Patika Dev Java Backend Bootcamp/Cohort Content/Week-08/InputOutput/New folder");

        if (file.exists()) {

            System.out.println("Absolute Path => " + file.getAbsolutePath());
            System.out.println("Is it a directory? " + file.isDirectory());
            System.out.println("Parent Directory => " + file.getParent());

            if (file.isFile()) {
                System.out.println("File size => " + file.length());
                System.out.println("Last modified => " + file.lastModified());
            } else {
                for (File subFile : file.listFiles()) {
                    System.out.println("File name: " + subFile.getName());
                }
            }

        }

    }

}
import java.io.*;

public class BufferedInputStreamMain {

    public static void main(String[] args) {

        File file = new File("c:/Users/velih/OneDrive/Masaüstü/Velo/Patika Plus Patika Dev Java Backend Bootcamp/Cohort Content/Week-08/Streams/docs/veriler.txt");

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {

            int data;
            int counter = 0;

            while ((data = bis.read()) != -1) {
                counter++;
            }

            System.out.println("Total read bytes: " + counter);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
import java.io.*;

public class BufferedStreamsCopyFile {

    public static void main(String[] args) {

        var source = new File("c:/Users/velih/OneDrive/Masaüstü/Velo/Patika Plus Patika Dev Java Backend Bootcamp/Cohort Content/Week-08/Streams/docs/source.txt");
        var destination = new File("c:/Users/velih/OneDrive/Masaüstü/Velo/Patika Plus Patika Dev Java Backend Bootcamp/Cohort Content/Week-08/Streams/docs/destination.txt");

        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[1024];
            int read;

            while ((read = bis.read(buffer)) != -1) {

                bos.write(buffer, 0, read);

            }

            System.out.println("dosya başarıyla kopyalandı!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
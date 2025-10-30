import java.io.*;

public class ImageCopy {

    public static void main(String[] args) throws IOException {

        var originalImagePath = new File("C:\\Users\\velih\\OneDrive\\Masaüstü\\Velo\\Patika Plus Patika Dev Java Backend Bootcamp\\Cohort Content\\Week-08\\InputOutputTrials\\src\\main\\resources\\img.png");
        var copyImagePath = new File("C:\\Users\\velih\\OneDrive\\Masaüstü\\Velo\\Patika Plus Patika Dev Java Backend Bootcamp\\Cohort Content\\Week-08\\InputOutputTrials\\src\\main\\resources\\img_copy.png");

        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(originalImagePath));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(copyImagePath));)
        {

            byte[] buffer = new byte[1024]; // 1 KB
            int read;

            while ((read = bis.read(buffer)) != -1) {

                bos.write(buffer, 0, read);

            }

            System.out.println("Image copied successfully FROM: " + originalImagePath + "\nTO: " + copyImagePath);

        }

    }

}
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamMain {

    public static void main(String[] args) {

        String content = """
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                BufferedOutputStreamMain ile yazılan data. BufferedOutputStreamMain ile yazılan data.
                
                """;

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.dat"))) {

            bos.write(content.getBytes());
            bos.flush(); // buffer'daki veriyi diske yazar.
            bos.close(); // redundant in try with resources pattern.
            System.out.println("dosyaya yazıldı!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
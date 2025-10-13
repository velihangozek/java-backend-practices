import model.Person;

import java.io.*;

public class ObjectInputStreamMain {

    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {

            Person readPerson = (Person) ois.readObject();
            System.out.println(readPerson);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
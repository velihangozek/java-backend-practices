import model.Address;
import model.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class ObjectOutputStreamMain {

    public static void main(String[] args) {

        Address address = new Address("istanbul", "altntepsi", 34035);
        Person person = new Person("velihan", 27, address, List.of("5554443322", "5554443323"), "secretKey");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {

            oos.writeObject(person);
            System.out.println("person object successfully serialized/written");

        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);

        } catch (IOException e) {

            throw new RuntimeException(e);

        }

    }

}
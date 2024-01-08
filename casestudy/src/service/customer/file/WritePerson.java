package service.customer.file;

import model.Person;
import model.customer.Customer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WritePerson {
    public static void writeDataToFile(List<Person> personList) {
        try {
            FileOutputStream fos = new FileOutputStream(Customer.PERSON_TXT);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(personList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

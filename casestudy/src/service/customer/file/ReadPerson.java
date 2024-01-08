package service.customer.file;

import model.Person;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;


public class ReadPerson {

    public static List<Person> readDataFromFile() {
        List<Person> personList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(Person.PERSON_TXT);
            ObjectInputStream ois = new ObjectInputStream(fis);
            personList = (List<Person>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return personList;
    }
}

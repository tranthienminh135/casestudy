import model.Person;
import model.customer.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test<T> {
    public List<T> readDataFromFile(String path) {
        List<T> list = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (List<T>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public void writeDataToFile(List<T> list,String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



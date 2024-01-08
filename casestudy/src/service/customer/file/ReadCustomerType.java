package service.customer.file;

import model.customer.CustomerType;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;


public class ReadCustomerType {
    public static List<CustomerType> readCustomersFromFile() {
        List<CustomerType> customerTypes = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(CustomerType.CUSTOMER_TYPE_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            customerTypes = (List<CustomerType>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return customerTypes;
    }
}

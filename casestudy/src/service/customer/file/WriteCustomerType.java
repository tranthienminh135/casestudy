package service.customer.file;

import model.customer.CustomerType;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class WriteCustomerType {
    public static void writeDataToFile(List<CustomerType> customerTypes) {
        try {
            FileOutputStream fos = new FileOutputStream(CustomerType.CUSTOMER_TYPE_PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(customerTypes);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        List<CustomerType> customerTypes = Arrays.asList(new CustomerType(1, "Kim Cương"), new CustomerType(2, "Vàng"), new CustomerType(3, "Bạc"), new CustomerType(4, "Đồng"), new CustomerType(5, "Thành Viên"));
//        writeDataToFile(customerTypes);
//    }
}

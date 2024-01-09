package views.customer;

import common.exception.ExceptionHandler;
import controller.CustomerController;
import model.Person;
import model.customer.Customer;
import model.customer.CustomerType;
import repository.customer.ICustomerTypeRepository;
import repository.customer.impl.CustomerTypeRepository;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private final Scanner scanner = new Scanner(System.in);
    private final CustomerController customerController = new CustomerController();
    private final ICustomerTypeRepository customerTypeRepository = new CustomerTypeRepository();

    public void customerManagement() {
        while (true) {
            System.out.println("------------------");
            System.out.println("QUẢN LÝ KHÁCH HÀNG");
            System.out.println("------------------");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Chỉnh sửa");
            System.out.println("4. Xóa");
            System.out.println("0. Thoát");
            int choice = ExceptionHandler.checkForParseInt("lựa chọn của bạn");
            switch (choice) {
                case 1:
                    System.out.println("Danh sách khách hàng");
                    this.showCustomerList();
                    break;
                case 2:
                    createNewCustomer();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Giá trị không hợp lệ!");
                    break;
            }
        }
    }

    private void createNewCustomer() {
        System.out.println("Thêm mới khách hàng");
        System.out.print("Nhập tên khách hàng: ");
        String name = scanner.nextLine();
        System.out.print("Nhập số điện thoại khách hàng: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Nhập email khách hàng: ");
        String email = scanner.nextLine();
        System.out.println("Chọn loại khách hàng: ");
        List<CustomerType> customerTypes = this.customerTypeRepository.findAll();
        CustomerType customerType = choiceCustomerType(customerTypes);
        Person customer = new Customer(name, phoneNumber, email, customerType);
        this.customerController.save(customer);
    }

    private static CustomerType choiceCustomerType(List<CustomerType> customerTypes) {
        while (true) {
            for (CustomerType ct : customerTypes) {
                System.out.println(ct.getId() + ". " + ct.getName());
            }
            int choiceCustomerType = ExceptionHandler.checkForParseInt("lựa chọn của bạn");
            for (CustomerType ct : customerTypes) {
                if (choiceCustomerType == ct.getId()) {
                    return ct;
                }
            }
        }
    }

    private void showCustomerList() {
        List<Person> personList = this.customerController.findAll();
        if (personList.isEmpty()) {
            System.out.println("Không có dữ liệu trong bảng!");
        } else {
            StringBuilder str = new StringBuilder("" +
                    "+----+----------------+-----------------+------------------------+-----------------+\n" +
                    "| ID | Tên khách hàng |  Số điện thoại  |         Email          | Loại khách hàng |\n" +
                    "+----+----------------+-----------------+------------------------+-----------------+\n");
            for (Person person : personList) {
                if (person instanceof Customer)
                    str.append(person);
            }
            System.out.println(str);
        }
    }
}

package controller;

import model.Person;
import model.customer.Customer;
import service.customer.ICustomerService;
import service.customer.impl.CustomerService;

import java.util.List;

public class CustomerController {
    private final ICustomerService customerService = new CustomerService();
    public List<Person> findAll() {
        List<Person> personList = this.customerService.findAll();
        return personList;
    }

    public void save(Person customer) {
        this.customerService.save(customer);
    }

    public void delete(Customer customer) {
        this.customerService.delete(customer);
    }
}

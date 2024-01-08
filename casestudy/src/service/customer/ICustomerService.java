package service.customer;

import model.Person;
import model.customer.Customer;

import java.util.List;

public interface ICustomerService {
    List<Person> findAll();

    void save(Person customer);
}

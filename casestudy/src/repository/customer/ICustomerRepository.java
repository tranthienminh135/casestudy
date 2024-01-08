package repository.customer;

import model.Person;
import model.customer.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Person> findAll();

    void save(Person customer);
}

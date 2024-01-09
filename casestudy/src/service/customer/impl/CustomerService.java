package service.customer.impl;

import model.Person;
import model.customer.Customer;
import repository.customer.ICustomerRepository;
import repository.customer.impl.CustomerRepository;
import service.customer.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {

    private final ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<Person> findAll() {
        return this.customerRepository.findAll();
    }

    @Override
    public void save(Person customer) {
        this.customerRepository.save(autoIncrementId(customer));
    }

    @Override
    public void delete(Customer customer) {
        this.customerRepository.delete(customer);
    }

    private Person autoIncrementId(Person person) {
        List<Person> personList = this.customerRepository.findAll();
        if (personList.isEmpty()) {
            person.setId(1);
        } else {
            int maxId = personList.get(0).getId();
            for (Person c: personList) {
                if (c.getId() > maxId) {
                    maxId = c.getId();
                }
            }
            person.setId(maxId + 1);
        }
        return person;
    }
}

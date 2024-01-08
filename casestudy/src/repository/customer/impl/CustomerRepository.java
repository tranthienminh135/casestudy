package repository.customer.impl;

import model.Person;
import repository.customer.ICustomerRepository;
import service.customer.file.ReadPerson;
import service.customer.file.WritePerson;

import java.util.List;

public class CustomerRepository implements ICustomerRepository
{
    @Override
    public List<Person> findAll() {
        List<Person> personList = ReadPerson.readDataFromFile();
        return personList;
    }

    @Override
    public void save(Person customer) {
        List<Person> customers = ReadPerson.readDataFromFile();
        customers.add(customer);
        WritePerson.writeDataToFile(customers);
    }
}

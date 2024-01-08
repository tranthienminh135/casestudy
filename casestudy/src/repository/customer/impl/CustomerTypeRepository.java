package repository.customer.impl;

import model.customer.CustomerType;
import repository.customer.ICustomerTypeRepository;
import service.customer.file.ReadCustomerType;

import java.util.List;

public class CustomerTypeRepository implements ICustomerTypeRepository {

    @Override
    public List<CustomerType> findAll() {
        return ReadCustomerType.readCustomersFromFile();
    }
}

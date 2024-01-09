package model.customer;

import model.Person;

public class Customer extends Person {

    private CustomerType customerType;

    public Customer() {
    }

    public Customer(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Customer(Integer id, String name, String phoneNumber, String email, CustomerType customerType) {
        super(id, name, phoneNumber, email);
        this.customerType = customerType;
    }

    public Customer(String name, String phoneNumber, String email, CustomerType customerType) {
        super(name, phoneNumber, email);
        this.customerType = customerType;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return
                String.format("| %-2d | %-14s | %-15s | %-22s | %-15s |\n", super.getId(), super.getName(), super.getPhoneNumber(), super.getEmail(), this.customerType.getName()) +
                "+----+----------------+-----------------+------------------------+-----------------+\n";
    }
}

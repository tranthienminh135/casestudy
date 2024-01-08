package model.order;

import model.customer.Customer;
import model.employee.Employee;

public class Order {
    private Integer id;

    private String code;

    private Customer customer;

    private Employee employee;

    public Order() {
    }

    public Order(Integer id, String code, Customer customer, Employee employee) {
        this.id = id;
        this.code = code;
        this.customer = customer;
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}

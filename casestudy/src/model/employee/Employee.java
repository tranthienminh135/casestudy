package model.employee;

import model.Person;

public class Employee extends Person {
    private Double salary;

    private String address;

    private String idCard;

    private EmployeePosition employeePosition;

    public Employee() {
    }

    public Employee(Double salary, String address, String idCard, EmployeePosition employeePosition) {
        this.salary = salary;
        this.address = address;
        this.idCard = idCard;
        this.employeePosition = employeePosition;
    }

    public Employee(Integer id, String name, String phoneNumber, String email, Double salary, String address, String idCard, EmployeePosition employeePosition) {
        super(id, name, phoneNumber, email);
        this.salary = salary;
        this.address = address;
        this.idCard = idCard;
        this.employeePosition = employeePosition;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public EmployeePosition getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(EmployeePosition employeePosition) {
        this.employeePosition = employeePosition;
    }
}

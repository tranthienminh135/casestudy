package model;

import java.io.Serial;
import java.io.Serializable;

public abstract class Person  implements Serializable {

    public static final String PERSON_TXT = "src/data/person/person.txt";

    @Serial
    private static final long serialVersionUID = 9042L;

    private Integer id;

    private String name;

    private String phoneNumber;

    private String email;

    public Person() {
    }

    public Person(Integer id, String name, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Person(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

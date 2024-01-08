package model.customer;

import java.io.Serial;
import java.io.Serializable;

public class CustomerType implements Serializable {
    public static final String CUSTOMER_TYPE_PATH = "src/data/customer/type.txt";

    @Serial
    private static final long serialVersionUID = 9042L;

    private Integer id;

    private String name;

    public CustomerType() {
    }

    public CustomerType(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "CustomerType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

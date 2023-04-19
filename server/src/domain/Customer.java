package domain;

import java.util.Date;

public class Customer {

    private String id;
    private String name;
    private String lastNames;
    private String email;
    private Date birthDate;
    private customerType customerType;

    public Customer(String id, String name, String lastNames, String email, Date birthDate, domain.customerType customerType) {
        this.id = id;
        this.name = name;
        this.lastNames = lastNames;
        this.email = email;
        this.birthDate = birthDate;
        this.customerType = customerType;
    }

    public Customer() {
        this.id = "";
        this.name = "";
        this.lastNames = "";
        this.email = "";
        this.birthDate = new Date();
        this.customerType = null;
    }


    //getters ans setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public domain.customerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(domain.customerType customerType) {
        this.customerType = customerType;
    }
}

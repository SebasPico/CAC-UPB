package domain;

public class Appointment {

    private String id;
    private Customer customer;
    private Date date;
    private String description;

    public Appointment(String id, Customer customer, Date date, String description) {
        this.id = id;
        this.customer = customer;
        this.date = date;
        this.description = description;
    }

    public Appointment() {
        this.id = "id";
        this.customer = null;
        this.date = null;
        this.description = "";
    }

    //getter and setters


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
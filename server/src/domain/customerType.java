package domain;

public class customerType {

    private int id;
    private String descrption;

    public customerType(int id, String descrption) {
        this.id = id;
        this.descrption = descrption;
    }

    public customerType() {
        this.id = 0;
        this.descrption = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }
}

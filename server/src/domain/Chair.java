package domain;

public class Chair {

    private boolean status;
    private int id;


    public Chair(boolean status, int id) {
        this.status = status;
        this.id = id;
    }

    public Chair() {
        this.status = false;
        this.id = 0;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

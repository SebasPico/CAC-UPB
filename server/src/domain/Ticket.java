package domain;

public class Ticket {

    private int id;
    private Appointment appointmentId;

    public Ticket(int id, Appointment appointmentId) {
        this.id = id;
        this.appointmentId = appointmentId;
    }

    public Ticket() {
        this.id = 0;
        this.appointmentId = null;
    }

    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Appointment getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Appointment appointmentId) {
        this.appointmentId = appointmentId;
    }
}

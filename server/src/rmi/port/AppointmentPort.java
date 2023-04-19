package rmi.port;

import domain.Appointment;

public interface AppointmentPort {

    public Appointment openAppoinment();
    public boolean closeAppoinment(String id);
    public boolean cancelAppoinment(String id);
    public Appointment getAppoinmentById(String id);//obtener una cita por Id, para cancelarla.
    public Appointment[] getAppointmentAll();

}

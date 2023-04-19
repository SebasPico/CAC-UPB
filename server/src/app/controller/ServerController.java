package app.controller;

import domain.Appointment;
import domain.Customer;
import domain.Ticket;

import java.util.Date;

public class ServerController {

    public Appointment openAppointment(Customer customer, Date date, String depcription){
        return null;
    }

    public boolean closeAppoinment(String id){//Cuando se pasa del tiempo y cuando ya asistio a la cita
        return false;
    }

    public boolean cancelAppointment(){
        return false;
    }

    public Appointment getAppointmetsById(){
        return null;
    }

    public Appointment[] getAppointments(){
        return null;
    }

    public Ticket getTicket(String appointmentID){//Obtiene la el ticket de la cita abierta solamente
        return null;
    }



}

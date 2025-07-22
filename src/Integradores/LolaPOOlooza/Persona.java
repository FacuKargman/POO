package Integradores.LolaPOOlooza;

public class Persona {
    private Ticket ticket;

    public void ingresarRecital(Recital recital) {
        ticket.ingresar(recital);
        recital.agregarAsistente(this);
    }

    public void adquirirTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}

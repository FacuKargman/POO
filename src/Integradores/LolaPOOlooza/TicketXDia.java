package Integradores.LolaPOOlooza;

public class TicketXDia implements Ticket{

    private Fecha fechaAsignada;

    public TicketXDia(Fecha fechaAsignada) {
        this.fechaAsignada = fechaAsignada;
    }

    @Override
    public void ingresar(Recital recital) {}

    @Override
    public boolean puedeIngresar(Recital recital) {
        return fechaAsignada.getFecha().equals(recital.getFecha().getFecha());
    }
}

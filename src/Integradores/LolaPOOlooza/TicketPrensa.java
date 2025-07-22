package Integradores.LolaPOOlooza;

public class TicketPrensa implements Ticket{

    @Override
    public boolean puedeIngresar(Recital recital) {
        return recital.getEscenario().tieneLugarPrensa();
    }

    @Override
    public void ingresar(Recital recital) {}
}

package Integradores.LolaPOOlooza;

public class TicketPlus implements Ticket{

    @Override
    public boolean puedeIngresar(Recital recital) {
        return true;
    }

    @Override
    public void ingresar(Recital recital) {}
}

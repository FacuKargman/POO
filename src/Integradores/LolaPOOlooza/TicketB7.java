package Integradores.LolaPOOlooza;

public class TicketB7 implements Ticket{

    private int cantRecitalesDisponibles = 7;

    @Override
    public boolean puedeIngresar(Recital recital) {
        return cantRecitalesDisponibles>0;
    }

    @Override
    public void ingresar(Recital recital) {
        cantRecitalesDisponibles--;
    }
}

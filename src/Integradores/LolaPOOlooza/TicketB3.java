package Integradores.LolaPOOlooza;

public class TicketB3 implements Ticket{

    private int cantRecitalesDisponibles = 3;

    @Override
    public boolean puedeIngresar(Recital recital) {
        return cantRecitalesDisponibles>0;
    }

    @Override
    public void ingresar(Recital recital) {
        cantRecitalesDisponibles--;
    }
}

package Integradores.LolaPOOlooza;

import java.util.ArrayList;

public class TicketFan implements Ticket{

    private Artista artistaAsignado;

    public TicketFan(Artista artistaAsignado) {
        this.artistaAsignado = artistaAsignado;
    }

    @Override
    public boolean puedeIngresar(Recital recital) {
        return recital.getArtista().equals(artistaAsignado);
    }

    @Override
    public void ingresar(Recital recital) {}
}

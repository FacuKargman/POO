package Integradores.LolaPOOlooza;

import java.util.ArrayList;
import java.util.List;

public class TicketCustom implements Ticket{

    private List<Artista> artistas = new ArrayList<>();

    @Override
    public boolean puedeIngresar(Recital recital) {
        return artistas.contains(recital.getArtista());
    }

    @Override
    public void ingresar(Recital recital) {}

    public void agregarArtista(Artista artista) {
        artistas.add(artista);
    }


}

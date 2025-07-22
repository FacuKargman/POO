package Integradores.LolaPOOlooza;

import java.util.ArrayList;
import java.util.List;

public class Festival {
    private List<Recital> recitales = new ArrayList<>();

    public void agregarRecital(Recital nuevo) {
        boolean yaToca = recitales.stream()
                .anyMatch(r -> r.getArtista().equals(nuevo.getArtista()));

        if (yaToca) {
            throw new IllegalArgumentException("El artista ya tiene un recital asignado.");
        }

        recitales.add(nuevo);
    }

    public void venderTicket(Ticket ticket, Persona asistente) {
        asistente.adquirirTicket(ticket);
    }

    public int cantidadAsistentesDe(Artista artista) {
        return recitales.stream()
                .filter(r -> r.getArtista().equals(artista))
                .mapToInt(r -> r.getAsistentes().size())
                .sum();
    }

}


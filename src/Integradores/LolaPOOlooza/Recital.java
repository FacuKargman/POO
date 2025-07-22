package Integradores.LolaPOOlooza;

import java.util.ArrayList;
import java.util.List;

public class Recital {
    private Artista artista;
    private Escenario escenario;
    private Fecha fecha;
    private List<Persona> asistentes = new ArrayList<>();

    public Recital(Artista artista, Escenario escenario, Fecha fecha) {
        this.artista = artista;
        this.escenario = escenario;
        this.fecha = fecha;
    }

    public Artista getArtista() {
        return artista;
    }

    public Escenario getEscenario() {
        return escenario;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public List<Persona> getAsistentes() {
        return asistentes;
    }

    public void agregarAsistente(Persona asistente) {
        asistentes.add(asistente);
    }
}

package Integradores.SPOOtify;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Plataforma {
    private List<Cancion> canciones = new ArrayList<>();

    public void agregarCancion(Cancion cancion){
        canciones.add(cancion);
    }

    public Cancion getCancionPorID(String id){
        return canciones.stream()
                .filter(c -> c.getID().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Canción no encontrada con ID: " + id));
    }

    public Cancion getCancionMasReproducida(){
        return canciones.stream()
                .max(Comparator.comparingInt(Cancion::getCantidadReproducciones))
                .orElseThrow(() -> new RuntimeException("No hay canciones en el set"));
    }

    public Set<String> getArtistas(){
        return canciones.stream().map(Cancion::getArtista).collect(Collectors.toSet());
    }

    public boolean esExitosa(){
        return canciones.stream().allMatch(Cancion::conocida);
    }

    public Set<Cancion> getHits(){
        return canciones.stream().filter(Cancion::esHit).collect(Collectors.toSet());
    }
}

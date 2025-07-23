package Integradores.PapaNoel;

import java.util.ArrayList;
import java.util.List;

public class Ciudad {
    public String nombre;
    public List<Domicilio> domicilios = new ArrayList<>();

    public Ciudad(String nombre, List<Domicilio> domicilios) {
        this.nombre = nombre;
        this.domicilios = domicilios;
    }

    public String getNombre() {
        return nombre;
    }
}

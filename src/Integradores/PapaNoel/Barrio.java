package Integradores.PapaNoel;

import java.util.HashSet;
import java.util.Set;

public class Barrio {
    private String nombre;
    private Set<Domicilio> domicilios = new HashSet<Domicilio>();

    public Barrio(String nombre) {
        this.nombre = nombre;
    }
    public int cantidadHabitantes() {return domicilios.stream().mapToInt(Domicilio::cantidadHabitantes).sum();}

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Barrio b = (Barrio) obj;
        return this.nombre.equals(b.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
}

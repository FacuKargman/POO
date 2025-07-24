package Integradores.PapaNoel;

import java.util.HashSet;
import java.util.Set;

public abstract class Domicilio {
    protected String direccion;
    protected Barrio barrio;
    protected Set<Habitante> habitantes = new HashSet<Habitante>();

    public boolean habilitadoPapaNoel() {return false;}
    public boolean esAburrido() {return habitantes.stream().noneMatch(Habitante::mereceRegalo);}
    public int cantidadHabitantes(){return habitantes.size();}
    public Set<Habitante> habitantes() {return habitantes;}
    public Barrio getBarrio() {return barrio;}

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Domicilio d)) return false;
        return this.direccion.equals(d.direccion);
    }

    @Override
    public int hashCode() {
        return direccion.hashCode();
    }
}

package Integradores.PapaNoel;

import java.util.ArrayList;
import java.util.List;

public abstract class Domicilio {
    protected boolean ventanasAbiertas;
    protected boolean tieneChimenea;
    protected List<Habitante> habitantes = new ArrayList<>();

    public boolean habilitacionNoel(){return false;}
    public void eliminarHabitante(Habitante habitante){
        habitantes.remove(habitante);
    }

    public List<Habitante> getHabitantes() {
        return habitantes;
    }
}

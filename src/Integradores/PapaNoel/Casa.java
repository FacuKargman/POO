package Integradores.PapaNoel;

import java.util.HashSet;
import java.util.Set;

public class Casa extends Domicilio{
    private boolean tieneChimenea;

    public Casa(String direccion, Barrio barrio) {
        this.direccion = direccion;
        this.barrio = barrio;
    }
    public boolean habilitadoPapaNoel(){return tieneChimenea;};
    public boolean esAburrido(){return false;};
    public void agregarHabitante(Habitante hab){
        habitantes.add(hab);
    }

}

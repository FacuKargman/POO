package Integradores.PapaNoel;

import java.util.HashMap;
import java.util.Map;

public class PapaNoel {
    private Map<Domicilio, String> domicilios = new HashMap<>();
    private Map<Domicilio, String> habitantes = new HashMap<>();

    public void agregarDomicilio(Domicilio domicilio){
        habitantes.put(domicilio, "Por Visitar");
    }

    public void visitarDomicilio(Domicilio domicilio){
        if(domicilio.habilitacionNoel()){
            habitantes.put(domicilio, "Visitado");
        }else{
            habitantes.put(domicilio, "Bloqueado");
        }
    }

    private void regalarEnDomicilio(Domicilio domicilio){
        regalarHabitante(domicilio);
        domicilio.getHabitantes().stream()
                .forEach(habitante -> {regalarAMascotas(habitante.getMascotas());});
    }

    private void regalarHabitante(Domicilio domicilio){
        domicilio.getHabitantes().stream()
                .filter(Habitante::mereceRegalo)
                .forEach(Habitante::setTieneRegalo);
    }

    private void regalarAMascotas(Map mascotas){
        mascotas.replaceAll((k,v)-> true);
    }

}

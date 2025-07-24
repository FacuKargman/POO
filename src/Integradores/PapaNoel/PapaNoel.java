package Integradores.PapaNoel;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class PapaNoel {
    private Set<Habitante> habitantesRegalado = new HashSet<>();
    private List<Domicilio> domiciliosPendientes = new ArrayList<>();
    private List<Domicilio> domiciliosVisitados = new ArrayList<>();
    private List<Domicilio> domiciliosBloqueados = new ArrayList<>();


    private boolean domicilioEstaPendiente(Domicilio domicilio){return domiciliosPendientes.contains(domicilio);}
    private boolean domicilioEstaVisitado(Domicilio domicilio){return domiciliosPendientes.contains(domicilio);}
    private boolean domicilioEstaBloqueado(Domicilio domicilio){return domiciliosPendientes.contains(domicilio);}

    private boolean registrarDomicilioBloqueado(Domicilio domicilio){
        if(!domiciliosBloqueados.contains(domicilio)){
            domiciliosBloqueados.add(domicilio);
            return true;
        }else return false;
    }

    private boolean registrarDomicilioVisitado(Domicilio domicilio){
        if(!domiciliosPendientes.contains(domicilio)){
            domiciliosPendientes.add(domicilio);
            return true;
        }else return false;
    }

    private void regalarAHabitantes(Domicilio domicilio){
        domicilio.habitantes().stream()
                .filter(Habitante::mereceRegalo)
                .forEach(this::regalar);
    }

    private void regalar(Habitante habitante){habitantesRegalado.add(habitante);}
    private boolean domicilioHabilitado(Domicilio domicilio){return domicilio.habilitadoPapaNoel();}

    private void visitarDomicilio(Domicilio domicilio){
        if(!domicilioHabilitado(domicilio)) {
            registrarDomicilioBloqueado(domicilio);
            return;
        }
        if(domicilioEstaVisitado(domicilio)){
            throw new RuntimeException("El domicilio ya esta visitado");
        }
        if(domicilioEstaPendiente(domicilio)){
            domiciliosPendientes.remove(domicilio);
        }
        if(domicilioEstaBloqueado(domicilio)){
            domiciliosBloqueados.remove(domicilio);
        }

        regalarAHabitantes(domicilio);
        registrarDomicilioVisitado(domicilio);
    }

    //---------------Publicas--------------------------------

    public void registrarDomicilioPendiente(Domicilio domicilio){
        if(domiciliosPendientes.contains(domicilio)){
            throw new RuntimeException("El domicilio ya esta registrado como pendiente");
        }
        if(domiciliosVisitados.contains(domicilio)){
            throw new RuntimeException("El domicilio ya esta registrado como visitado");
        }
        if(domiciliosBloqueados.contains(domicilio)){
            throw new RuntimeException("El domicilio ya esta registrado como bloqueado");
        }
        domiciliosPendientes.add(domicilio);
    }

    public void visitarPrimerDomicilioPendiente(){
        visitarDomicilio(domiciliosPendientes.getFirst());
    }

    public void visitarPrimerDomicilioBloqueado(){
        visitarDomicilio(domiciliosBloqueados.getFirst());
    }

    public Habitante regaladoMasViejo(){
        return habitantesRegalado.stream()
                .max(Comparator.comparingInt(Habitante::getEdad))
                .orElse(null);
    }

    public List<Domicilio> domiciliosAburridosVisitados(){
        return domiciliosVisitados.stream()
                .filter(Domicilio::esAburrido)
                .toList();
    }

    public List<Domicilio> domiciliosAburridosPendientes(){
        return domiciliosPendientes.stream()
                .filter(Domicilio::esAburrido)
                .toList();
    }

    public List<Barrio> barriosMasVisitados(){
        return domiciliosVisitados.stream()
                .map(Domicilio::getBarrio)
                .collect(Collectors.groupingBy(
                        Function.identity(),       // Agrupa por objeto Barrio
                        Collectors.counting()
                ))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public int cantHabitantesBarrioUltimoDomicilioBloqueado(){
        return domiciliosBloqueados.getLast().barrio.cantidadHabitantes();
    }

}

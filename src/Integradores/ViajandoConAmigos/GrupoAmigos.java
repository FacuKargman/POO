package Integradores.ViajandoConAmigos;

import java.util.HashSet;
import java.util.Set;

public class GrupoAmigos {
    private Set<Persona> amigos = new HashSet<>();
    private Double presupuesto;

    public GrupoAmigos(Double presupuesto) {this.presupuesto = presupuesto;}
    public Set<Persona> getAmigos() {return amigos;}
    public void agregarAmigo(Persona amigo) {amigos.add(amigo);}
    public void sacarAmigo(Persona amigo) {amigos.remove(amigo);}
    public void modificarPresupuesto(Double presupuesto) {this.presupuesto = presupuesto;}
    public Double getPresupuesto() {return presupuesto;}
}

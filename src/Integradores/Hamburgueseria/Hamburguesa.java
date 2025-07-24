package Integradores.Hamburgueseria;

import java.util.ArrayList;
import java.util.List;

public class Hamburguesa {
    private List<Ingrediente> medallones = new ArrayList<>();
    private List<Ingrediente> ingredientes = new ArrayList<>();
    private Ingrediente pan;

    public Hamburguesa(List<Ingrediente> medallones, List<Ingrediente> ingredientes, Ingrediente pan) {
        this.medallones = medallones;
        this.ingredientes = ingredientes;
        this.pan = pan;
    }

    public Hamburguesa() {}

    public void agregarMedallon(Ingrediente ingrediente){
        medallones.add(ingrediente);
    }

    public void agregarIngrediente(Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }

    public void agregarPan(Ingrediente ingrediente){
        pan = ingrediente;
    }

    public boolean puedoFacturar(){
        return ingredientes.size() <= medallones.size() && pan != null;
    }

    public Double calcularPrecio(){
        return medallones.stream().mapToDouble(Ingrediente::getPrecio).sum()
        + ingredientes.stream().mapToDouble(Ingrediente::getPrecio).sum()
                + pan.getPrecio();
    }

}

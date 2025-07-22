package Integradores.Hamburgueseria;

import java.util.ArrayList;
import java.util.List;

public class Hamburguesa {
    private List<Medallon> medallones = new ArrayList<>();
    private List<IngredienteExtra> ingredientesExtra = new ArrayList<>();
    private Pan tipoPan;

    public void agregarMedallon(Medallon medallon) {
        medallones.add(medallon);
    }

    public void eliminarMedallon(Medallon medallon) {
        medallones.remove(medallon);
    }

    public void agregarIngrediente(IngredienteExtra ingredienteExtra) {
        ingredientesExtra.add(ingredienteExtra);
    }

    public void eliminarIngrediente(IngredienteExtra ingredienteExtra) {
        //ingredientesExtra.remove(ingredienteExtra); asi es lo ideal
        ingredientesExtra.removeFirst();
    }

    public void agregarPan(Pan pan) {
        tipoPan = pan;
    }

    public boolean puedeSerFacturada() {
        return  (!medallones.isEmpty() && medallones.size() >= ingredientesExtra.size() && tipoPan != null);
    }

    private double calcularPrecioMedallones(){
        double total = 0;
        for (Medallon m : medallones) {
            total += m.getPrecio();
        }
        return total;
    }

    private double calcularPrecioExtras(){
        double total = 0;
        for (IngredienteExtra e : ingredientesExtra) {
            total += e.getPrecio();
        }
        return total;
    }

    private double calcularPrecioHamburguesa(){
        double total = 0;
        total += calcularPrecioMedallones();
        total += calcularPrecioExtras();
        total += tipoPan.getPrecio();
        return total;
    }

    public double calcularPrecioTotal(){
        if (!puedeSerFacturada()) {
            throw new RuntimeException("La hamburguesa no puede ser facturada");
        }
        return calcularPrecioHamburguesa();
    }



}

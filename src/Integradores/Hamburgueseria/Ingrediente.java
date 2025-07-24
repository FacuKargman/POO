package Integradores.Hamburgueseria;

public class Ingrediente {
    public String descripcion;
    public Double precio;

    public Ingrediente(String descripcion, Double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getPrecio() {
        return precio;
    }
}

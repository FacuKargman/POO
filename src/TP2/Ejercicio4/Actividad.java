package TP2.Ejercicio4;

public class Actividad {
    private String nombre;
    private String tipo;
    private String descripcion;

    public Actividad(String nombre, String tipo, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

}

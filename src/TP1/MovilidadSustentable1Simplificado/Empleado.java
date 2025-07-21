package TP1.MovilidadSustentable1Simplificado;

public class Empleado {
    private String nombre;
    private Movilidad medioMasUtilizado;

    public Empleado(String nombre, Movilidad medioMasUtilizado) {
        this.nombre = nombre;
        this.medioMasUtilizado = medioMasUtilizado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Movilidad getMedioMasUtilizado() {
        return medioMasUtilizado;
    }
}

package TP2.Ejercicio4;

public class Persona {
    private String nombre;
    private float DNI;
    private Membresia membresia;


    public Persona(String nombre, float DNI, Membresia membresia) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.membresia = membresia;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void realizarActividad(Actividad actividad){
        membresia.realizarActividad(actividad);
    }
}

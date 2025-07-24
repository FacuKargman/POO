package Integradores.PapaNoel;

public class Persona extends Habitante{

    public Persona(String nombre, int edad, Domicilio domicilio) {
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = domicilio;
    }

    @Override
    public boolean mereceRegalo() {
        return edad<=12;
    }
}

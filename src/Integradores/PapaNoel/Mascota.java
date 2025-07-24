package Integradores.PapaNoel;

public class Mascota extends Habitante{

    public Mascota(String nombre, int edad, Domicilio domicilio) {
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = domicilio;
    }

    @Override
    public boolean mereceRegalo() {
        return true;
    }
}

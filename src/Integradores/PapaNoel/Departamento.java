package Integradores.PapaNoel;

public class Departamento extends Domicilio{
    private boolean tieneVentanasAbiertas;

    public Departamento(String direccion, Barrio barrio) {
        this.direccion = direccion;
        this.barrio = barrio;
    }
    public boolean habilitadoPapaNoel(){return tieneVentanasAbiertas;};
    public boolean esAburrido(){return false;};

}

package Integradores.PapaNoel;

public abstract class Habitante {
    protected String nombre;
    protected int edad;
    protected Domicilio domicilio;

    public boolean mereceRegalo(){return false;};
    public int getEdad(){
        return edad;
    }
}

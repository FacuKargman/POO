package Integradores.MatrizEnergetica;

public abstract class CentralProductora {
    protected Propietario propietario;
    protected int capacidadMaxima;

    public int getProduccion(){return 0;};
    public int getEmision(){return 0;};
    public Propietario getPropietario(){return propietario;}
    public boolean estaExigida(){return getProduccion()>=capacidadMaxima;}

}

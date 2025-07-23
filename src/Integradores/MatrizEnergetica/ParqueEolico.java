package Integradores.MatrizEnergetica;

public class ParqueEolico extends CentralProductora{
    private int cantidadGeneradores;

    public ParqueEolico(Propietario propietario, int capacidadMaxima, int cantidadGeneradores){
        this.propietario = propietario;
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadGeneradores = cantidadGeneradores;
    }

    @Override
    public int getProduccion(){return cantidadGeneradores*13;};

    public void agregarGenerador(){
        cantidadGeneradores++;
    };

}

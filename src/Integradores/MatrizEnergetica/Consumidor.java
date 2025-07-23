package Integradores.MatrizEnergetica;

public class Consumidor {
    private String nombre;
    private int consumo;

    public Consumidor(String nombre, int consumo){
        this.nombre = nombre;
        this.consumo = consumo;
    }

    public int getConsumo() {
        return consumo;
    }
}

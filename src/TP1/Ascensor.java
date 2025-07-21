package TP1;

public class Ascensor {
    private int capacidadTotal = 150;
    private boolean enServicio = true;
    private int pesoActual = 0;
    private boolean puertasCerradas = false;
    private int pisoActual = 0;


    public void usar(int piso){
        if (!enServicio){
            throw new RuntimeException("El ascensor no está en servicio");
        }
        if (pesoActual < capacidadTotal){
            throw new RuntimeException("Capacidad Total Superada");
        }
        puertasCerradas = true;
        pisoActual = piso;
    }

    public void subirse(int peso){
        pesoActual += peso;
    }

    public void bajarse(int peso){
        pesoActual -= peso;
    }
}

package TP1;

public class Monopatin {
    private String color;
    private int añoFabricacion;
    private int peso;
    private int velocidadActual = 0;

    public Monopatin(String color, int añoFabricacion, int peso) {
        this.color = color;
        this.añoFabricacion = añoFabricacion;
        this.peso = peso;
    }
    public void acelerar(int velocidad){
        velocidadActual += velocidad;
    }

    public void frenar(){
        velocidadActual = 0;
    }
}

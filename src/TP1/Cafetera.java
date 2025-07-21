package TP1;

public class Cafetera {
    private String modelo;
    private int capacidadTanque;
    private int cantidadAguaActual;
    private boolean encendida = false;

    public void encender(){
        encendida = true;
    }

    public void hacerCafe(){
        if (!encendida){
            throw new RuntimeException("Se debe primero prender la cafetera");
        }
        if(cantidadAguaActual <= 0){
            throw new RuntimeException("Falta agua para preparar el cafe");
        }
    }

    public void cargarAgua (int agua){
        if (agua + cantidadAguaActual > capacidadTanque){
            cantidadAguaActual = capacidadTanque;
        } else {
            cantidadAguaActual += agua;
        }
    }
}

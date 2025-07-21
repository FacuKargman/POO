package TP1;

public class Impresora {
    private String modelo;
    private boolean aColor;
    private int cargaTinta = 100;

    public void cargarTinta(int tinta){
        tinta=+cargaTinta;
    }

    public void imprimir(int hojas){
        if(hojas*10>cargaTinta){
            throw new RuntimeException("No hay sufuciente tinta para esa cantidad de hojas");
        }
    }

}

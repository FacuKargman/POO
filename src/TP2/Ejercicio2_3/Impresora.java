package TP2.Ejercicio2_3;

public abstract class Impresora {
    protected int contadorHojasImpresas = 0;
    protected int contadorDocumentos = 0;
    protected int cantidadCian;
    protected int cantidadAmarillo;
    protected int cantidadMagenta;
    protected int cantidadNegro;

    public Impresora(int cantidadCian, int cantidadAmarillo, int cantidadMagenta, int cantidadNegro) {
        this.cantidadCian = cantidadCian;
        this.cantidadAmarillo = cantidadAmarillo;
        this.cantidadMagenta = cantidadMagenta;
        this.cantidadNegro = cantidadNegro;
    }

    public Impresora(int cantidadNegro) {
        this.cantidadNegro = cantidadNegro;
    }

    public Impresora() {}

    public abstract boolean podesImprimir(Documento documento);

    public abstract Documento imprimi(Documento documento);

    public int cuantoDeMagentaTeQueda(){
        return cantidadMagenta;
    }

    public int cuantoDeAmarilloTeQueda(){
        return cantidadAmarillo;
    }
    public int cuantoDeCianTeQueda(){
        return cantidadCian;
    }
    public int cuantoDeNegroTeQueda(){
        return cantidadNegro;
    }
}

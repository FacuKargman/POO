package TP2.Ejercicio2_3;

public class Documento {
    private int cantidadHojas;
    private int cianRequerido;
    private int magentaRequerido;
    private int amarilloRequerido;
    private int negroRequerido;
    private boolean fueImpreso = false;

    public Documento(int cantidadHojas, int cianRequerido, int magentaRequerido, int amarilloRequerido, int negroRequerido) {
        this.cantidadHojas = cantidadHojas;
        this.cianRequerido = cianRequerido;
        this.magentaRequerido = magentaRequerido;
        this.amarilloRequerido = amarilloRequerido;
        this.negroRequerido = negroRequerido;
    }

    public int getCantidadHojas() {
        return cantidadHojas;
    }

    public void setCantidadHojas(int cantidadHojas) {
        this.cantidadHojas = cantidadHojas;
    }

    public int getCianRequerido() {
        return cianRequerido;
    }

    public void setCianRequerido(int cianRequerido) {
        this.cianRequerido = cianRequerido;
    }

    public int getMagentaRequerido() {
        return magentaRequerido;
    }

    public void setMagentaRequerido(int magentaRequerido) {
        this.magentaRequerido = magentaRequerido;
    }

    public int getAmarilloRequerido() {
        return amarilloRequerido;
    }

    public void setAmarilloRequerido(int amarilloRequerido) {
        this.amarilloRequerido = amarilloRequerido;
    }

    public int getNegroRequerido() {
        return negroRequerido;
    }

    public void setNegroRequerido(int negroRequerido) {
        this.negroRequerido = negroRequerido;
    }

    public boolean isFueImpreso() {
        return fueImpreso;
    }

    public void setFueImpreso(boolean fueImpreso) {
        this.fueImpreso = fueImpreso;
    }
}

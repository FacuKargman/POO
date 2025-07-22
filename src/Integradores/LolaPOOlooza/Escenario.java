package Integradores.LolaPOOlooza;

public class Escenario {
    private String nombre;
    private boolean lugarPrensa;

    public Escenario(String nombre, boolean lugarPrensa) {
        this.nombre = nombre;
        this.lugarPrensa = lugarPrensa;
    }

    public boolean tieneLugarPrensa() {
        return lugarPrensa;
    }
}

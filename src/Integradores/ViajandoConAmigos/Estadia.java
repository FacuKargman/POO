package Integradores.ViajandoConAmigos;

public class Estadia {
    private Ciudad ciudad;
    private int dias;

    public Estadia(Ciudad ciudad, int dias) {
        this.ciudad = ciudad;
        this.dias = dias;
    }

    public Ciudad getCiudad() {return ciudad;}
    public int getDias() {return dias;}
    public Double precioTotalCiudad(){return ciudad.getTasaTuristica() * dias;}
}

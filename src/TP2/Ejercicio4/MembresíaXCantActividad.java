package TP2.Ejercicio4;

public class MembresíaXCantActividad implements Membresia{

    private int cantidadActividades;

    public MembresíaXCantActividad(int cantidadActividades) {
        this.cantidadActividades = cantidadActividades;
    }

    public void sumarCantidadActividades(int cantidad){
        cantidadActividades += cantidad;
    }

    @Override
    public boolean puedoRealizarActividad(Actividad actividad) {
        return cantidadActividades>0;
    }

    @Override
    public void realizarActividad(Actividad actividad) {
        cantidadActividades--;
    }
}

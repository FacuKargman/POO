package TP2.Ejercicio4;

public class MembresíaPrueba implements Membresia{

    private boolean pruebaActiva = true;

    public MembresíaPrueba() {}


    @Override
    public boolean puedoRealizarActividad(Actividad actividad) {
        return pruebaActiva;
    }

    @Override
    public void realizarActividad(Actividad actividad) {
        pruebaActiva = false;
    }
}

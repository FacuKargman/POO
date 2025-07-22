package TP2.Ejercicio4;

public class MembresíaXTipoActividad implements Membresia{

    private Actividad actividadAsignada;

    public MembresíaXTipoActividad(Actividad actividad){
        actividadAsignada = actividad;
    }



    @Override
    public boolean puedoRealizarActividad(Actividad actividad) {
        return actividadAsignada.getTipo().equals(actividad.getTipo());
    }

    @Override
    public void realizarActividad(Actividad actividad) {}
}

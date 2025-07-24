package Integradores.ViajandoConAmigos;

public class ActividadPrivada extends Actividad{
    private int cantidadMaximaPersonas;

    public ActividadPrivada(Double precioBase, Ciudad ciudad, int cantidadMaximaPersonas) {
        this.precioBase = precioBase;
        this.ciudad = ciudad;
        this.cantidadMaximaPersonas =  cantidadMaximaPersonas;
    }

    @Override
    public Double precioActividad(GrupoAmigos amigos) {return precioBase;}

    @Override
    public boolean aptaParaGrupo(GrupoAmigos grupo) {return grupo.getAmigos().size() <= cantidadMaximaPersonas;}



}

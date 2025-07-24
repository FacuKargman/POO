package Integradores.ViajandoConAmigos;

public abstract class Actividad {
    protected Ciudad ciudad;
    protected Double precioBase;

    public Double precioActividad(GrupoAmigos grupo){return 0.0;};
    public boolean aptaParaGrupo(GrupoAmigos grupo){return false;}
}

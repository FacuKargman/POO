package Integradores.ViajandoConAmigos;

public class ActividadGrupal extends Actividad {
    private int edadMinima;

    public ActividadGrupal(Double precioBase, Ciudad ciudad, int edadMinima) {
        this.precioBase = precioBase;
        this.ciudad = ciudad;
        this.edadMinima = edadMinima;
    }

    @Override
    public Double precioActividad(GrupoAmigos grupo) {
        return precioBase * grupo.getAmigos().size();
    }

    @Override
    public boolean aptaParaGrupo(GrupoAmigos grupo) {
        return grupo.getAmigos().stream().allMatch(p -> p.getEdad() > edadMinima);
    }


}

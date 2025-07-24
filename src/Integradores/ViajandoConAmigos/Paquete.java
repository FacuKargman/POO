package Integradores.ViajandoConAmigos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Paquete {
    private GrupoAmigos grupoAmigos;
    private List<Actividad> actividades = new ArrayList<>();
    private List<Estadia> estadias = new ArrayList<>();
    private Double precioHospedaje = 36.0;

    private Double precioTotalHospedaje(GrupoAmigos grupo) {
        int cantidadDias = estadias.stream().mapToInt(Estadia::getDias).sum();
        return cantidadDias * grupo.getAmigos().size() * precioHospedaje;
    }

    private Double precioTotalActividades(GrupoAmigos grupo) {
        return actividades.stream().mapToDouble(a->a.precioActividad(grupo)).sum();
    }

    private Double precioTotalCiudades(GrupoAmigos grupo) {
        return estadias.stream().mapToDouble(Estadia::precioTotalCiudad).sum() * grupo.getAmigos().size();
    }

    //--------------------PUBLICAS-----------------------------------------------------------

    public Paquete(GrupoAmigos grupoAmigos){this.grupoAmigos = grupoAmigos;}

    public void agregarEstadia(Estadia estadia){estadias.add(estadia);}

    public void agregarActividad(Actividad actividad){
        if(actividades.stream().anyMatch(a -> a.ciudad.equals(actividad.ciudad))){
            actividades.add(actividad);
        }
    }

    public Double calcularPrecioTotal(GrupoAmigos grupo){
        return precioTotalActividades(grupo) + precioTotalHospedaje(grupo) +  precioTotalCiudades(grupo);
    }

    public boolean dentroDelPresupuesto(GrupoAmigos grupoAmigos) {
        return calcularPrecioTotal(grupoAmigos) <= grupoAmigos.getPresupuesto();
    }




}

package Integradores.ViajandoConAmigos;

import java.util.*;
import java.util.stream.Collectors;

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

    public Ciudad ciudadDondeSeGastaMasEnActividades(){
        return actividades.stream()
                .collect(Collectors.groupingBy(
                        Actividad::getCiudad,
                        Collectors.summingDouble(a -> a.precioActividad(grupoAmigos))))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public boolean dentroDelPresupuesto(GrupoAmigos grupoAmigos) {
        return calcularPrecioTotal(grupoAmigos) <= grupoAmigos.getPresupuesto();
    }

    public void eliminarActividadesMasCaras(List<Actividad> actividades, GrupoAmigos grupoAmigos) {
        // Paso 1: obtener el precio máximo
        double precioMaximo = actividades.stream()
                .mapToDouble(a -> a.precioActividad(grupoAmigos))
                .max()
                .orElse(Double.NaN); // o 0.0 si preferís

        // Paso 2: eliminar todas las actividades con ese precio
        actividades.removeIf(a -> a.precioActividad(grupoAmigos) == precioMaximo);
    }



}

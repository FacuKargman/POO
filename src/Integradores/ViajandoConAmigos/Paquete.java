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

    public void agregarActividad(Actividad actividad) {
        if (actividad.aptaParaGrupo(grupoAmigos)) {
            for (Estadia estadia : estadias) {
                if (actividad.ciudad.equals(estadia.getCiudad())) {
                    actividades.add(actividad);
                    return;
                }
            }
        }
    }

    public Double calcularPrecioTotal(){
        return precioTotalActividades(grupoAmigos) + precioTotalHospedaje(grupoAmigos) +  precioTotalCiudades(grupoAmigos);
    }

    public Ciudad ciudadDondeSeGastaMasEnActividades(){
//        return actividades.stream()
//                .collect(Collectors.groupingBy(
//                        Actividad::getCiudad,
//                        Collectors.summingDouble(a -> a.precioActividad(grupoAmigos))))
//                .entrySet().stream()
//                .max(Map.Entry.comparingByValue())
//                .map(Map.Entry::getKey)
//                .orElse(null);
        Map<Ciudad,Double> ciudadCosto = new HashMap<>();

        for  (Actividad actividad : actividades) {
            if(ciudadCosto.containsKey(actividad.getCiudad())){
                ciudadCosto.put(actividad.getCiudad(),ciudadCosto.get(actividad.getCiudad()) + actividad.precioActividad(grupoAmigos));
            }else{
                ciudadCosto.put(actividad.getCiudad(),actividad.precioActividad(grupoAmigos));
            }
        }

        Ciudad ciudadCara = null;
        Double costo = 0.0;
        for(Map.Entry<Ciudad,Double> entry : ciudadCosto.entrySet()){
            if(entry.getValue() > costo){ciudadCara = entry.getKey(); costo = entry.getValue();}
        }

        return ciudadCara;
    }

    public boolean dentroDelPresupuesto() {return calcularPrecioTotal() <= grupoAmigos.getPresupuesto();}

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

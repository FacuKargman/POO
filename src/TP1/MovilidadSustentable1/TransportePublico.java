package TP1.MovilidadSustentable1;

public class TransportePublico implements Movilidad{
    public void obtenerPremio(Empleado empleado){
        empleado.getSube().cargarSube(80000);
    }
    public String descripcionPremio(){
        return "Carga de Sube por $80.000";
    }
}

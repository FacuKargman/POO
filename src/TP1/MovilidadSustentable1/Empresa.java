package TP1.MovilidadSustentable1;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados = new ArrayList<>();;

    public void contratar(Empleado empleado){
        empleados.add(empleado);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void enviarRegalos(){
        for(Empleado empleado : empleados){
            empleado.getMedioMasUtilizado().obtenerPremio(empleado);
        }
    }
}

package TP1.MovilidadSustentable1;

public class Bicicleta implements Movilidad{
    public void obtenerPremio(Empleado empleado){
        KitSeguridad kitSeguridad = new KitSeguridad();
        kitSeguridad.agregarElemento("Casco");
        kitSeguridad.agregarElemento("Chaleco");
        empleado.agregarElementoSeguridad(kitSeguridad);
    }
    public String descripcionPremio(){
        return "Kit de Seguridad: Casco + Chaleco";
    }
}

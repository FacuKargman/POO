package TP1.MovilidadSustentable1;

public class Auto implements Movilidad{
    public void obtenerPremio(Empleado empleado){
        empleado.agregarVoucher(new Voucher("Voucher de $50.000 en Estaciones de Servicio"));
    }
    public String descripcionPremio(){
        return "Voucher de 50.000 en Estaciones de Servicio";
    }
}

package TP1.MovilidadSustentable1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empleado {
    private String nombre;
    private Movilidad medioMasUtilizado;
    private SUBE sube;
    private List<Voucher> vouchers = new ArrayList<>();
    private KitSeguridad elementosSeguridad;

    public Empleado(String nombre, Movilidad medioMasUtilizado) {
        this.nombre = nombre;
        this.medioMasUtilizado = medioMasUtilizado;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarElementoSeguridad(KitSeguridad kitSeguridad) {
        this.elementosSeguridad = kitSeguridad;
    }

    public void setMedioMasUtilizado(Movilidad medioMasUtilizado) {
        this.medioMasUtilizado = medioMasUtilizado;
    }

    public Movilidad getMovilidad() {
        return medioMasUtilizado;
    }

    public Movilidad getMedioMasUtilizado() {
        return medioMasUtilizado;
    }

    public void agregarVoucher(Voucher voucher){
        this.vouchers.add(voucher);
    }

    public SUBE getSube() {
        return sube;
    }
}

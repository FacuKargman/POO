package Integradores.PapaNoel;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Habitante {
    private String DNI;
    private int edad;
    private Domicilio domicilio;
    private Map<String, Boolean> mascotas = new HashMap<>();
    private boolean tieneRegalo;

    public Habitante(String DNI,int edad, Domicilio domicilio) {
        this.DNI = DNI;
        this.edad = edad;
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void cambiarDomicilio(Domicilio nuevoDomicilio) {
        domicilio.eliminarHabitante(this);
        domicilio = domicilio;
    }

    public boolean mereceRegalo(){return edad<=12;};

    public void agregarMascota(String mascota){
        mascotas.put(mascota,false);

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Habitante habitante))
            return false;
        return Objects.equals(this.DNI, habitante.DNI);
    }

    @Override
    public int hashCode() {
        return DNI.toUpperCase().hashCode();
    }

    public void setTieneRegalo(){
        this.tieneRegalo = true;
    }

    public Map getMascotas(){
        return mascotas;
    }
}

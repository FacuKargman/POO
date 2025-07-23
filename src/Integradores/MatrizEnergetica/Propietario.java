package Integradores.MatrizEnergetica;

import java.util.Objects;

public class Propietario {
    private String nombre;
    private String CUIT;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Propietario propietario = (Propietario) o;
        return Objects.equals(nombre, propietario.nombre) && Objects.equals(CUIT, propietario.CUIT);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nombre, CUIT);
    }
}

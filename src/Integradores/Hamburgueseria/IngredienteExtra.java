package Integradores.Hamburgueseria;

public abstract class IngredienteExtra {
    public String descripcion;
    public double precio;

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IngredienteExtra)) return false;
        IngredienteExtra a = (IngredienteExtra) o;
        return this.descripcion.equalsIgnoreCase(a.descripcion);
    }

    @Override
    public int hashCode() {
        return descripcion.toLowerCase().hashCode();
    }

}

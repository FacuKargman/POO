package Integradores.ViajandoConAmigos;

public class Ciudad {
    private String nombre;
    private Double tasaTuristica;

    public Ciudad(String nombre,  Double tasaTuristica){
        this.nombre = nombre;
        this.tasaTuristica = tasaTuristica;
    }

    public Double getTasaTuristica() {return tasaTuristica;}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        return ((Ciudad) obj).nombre.equals(this.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
}

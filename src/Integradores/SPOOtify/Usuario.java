package Integradores.SPOOtify;

public class Usuario {
    private String ID;
    private String nombre;

    public Usuario(String ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Usuario usuario = (Usuario) obj;
        return this.ID.equals(usuario.ID);
    }

    @Override
    public int hashCode() {
        return ID.hashCode();
    }
}

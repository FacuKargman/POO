package Integradores.LolaPOOlooza;

public class Artista {
    private String nombre;

    public Artista(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista(){
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artista)) return false;
        Artista a = (Artista) o;
        return this.nombre.equalsIgnoreCase(a.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.toLowerCase().hashCode();
    }

}

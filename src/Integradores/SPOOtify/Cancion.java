package Integradores.SPOOtify;

import java.util.HashSet;
import java.util.Set;

public class Cancion {
    private String ID;
    private String artista;
    private String titulo;
    private int cantidadReproducciones;
    private Set<Usuario> likes = new HashSet<>();
    private Set<Usuario> usuarios = new HashSet<>();

    public Cancion(String ID, String artista, String titulo) {
        this.ID = ID;
        this.artista = artista;
        this.titulo = titulo;
    }

    public String getID() {
        return ID;
    }

    public String getArtista() {
        return artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCantidadReproducciones() {
        return cantidadReproducciones;
    }

    public int getCantidadLikes() {
        return likes.size();
    }

    public void reproducir(Usuario usuario) {
        usuarios.add(usuario);
        cantidadReproducciones++;
    }

    public void darLike(Usuario usuario) {
        if (this.usuarios.contains(usuario)) {
            if(!likes.add(usuario)){
                throw new RuntimeException("El usuario ya likeó la canción");
            }
        }else{
            throw new RuntimeException("Usuario no escuchó canción antes de dar Like");
        }
    }

    private boolean usuarioReprodució(Usuario usuario) {
        return usuarios.contains(usuario);
    }

    public String toString(){
        return ID + " - " + artista + " - " + titulo;
    }

    public boolean conocida(){
        return cantidadReproducciones>=1;
    }

    public boolean esHit(){
        if(cantidadReproducciones<1){return false;}
        return cantidadReproducciones*0.8<=likes.size();
    }


}

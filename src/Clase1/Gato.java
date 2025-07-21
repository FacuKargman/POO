package Clase1;

public class Gato {
    private String nombre;
    private Gato AmigoDe;
    private int energia = 100;

    public Gato(String nombre) {
        this.nombre = nombre;
    }

    public void correr(int metros){
        energia = energia - metros;
    }

    public Gato quienEsTuAmigo() {
        return AmigoDe;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEnergia() {
        return energia;
    }
    public void hacerAmigoDe(Gato gato) {
        this.AmigoDe = gato;
        energia = energia + gato.energia;
    }

    public void perseguir(Object perseguido){
        System.out.print(this.nombre.concat(" está persiguiendo a ").concat(perseguido.toString()));
    }

}

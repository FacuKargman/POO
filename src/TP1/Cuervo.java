package TP1;

public class Cuervo {
    private String nombre;
    private int edad;
    private int energia = 100;

    public Cuervo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void volar (int metros) {
        energia = energia - metros;
    }

    public void comer(int comida){
        energia = energia + comida;
    }

}

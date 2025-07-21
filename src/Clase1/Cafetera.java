package Clase1;

public class Cafetera {
    private int temperatura;
    private boolean encendido;

    public boolean estaEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void calentarAgua(){
        this.temperatura = 30;
    }

    public void prepararCafe(CapsulaCafe cafe){
        System.out.println("Preparando Cafe sabor: ".concat(cafe.toString()));
    }
}

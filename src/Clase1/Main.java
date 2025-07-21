package Clase1;

public class Main {
    public static void main(String[] args) {
        Gato otto =  new Gato("Otto");
        Gato pino =  new Gato("Pino");

        otto.hacerAmigoDe(pino);
        System.out.println("El amigo de otto es: " + otto.quienEsTuAmigo().toString());
        System.out.println();

        Mosquito mosquito = new Mosquito();
        mosquito.picarA(otto);
        System.out.println("El último picado por EL MOSQUITO fue: " + mosquito.getUltimoPicado().toString());
        System.out.println();

        mosquito.picarA(pino);
        System.out.print("Pero luego... picó a: " + mosquito.getUltimoPicado().toString());

        Cafetera cafetera = new Cafetera();
        cafetera.prepararCafe(new  CapsulaCafe());


    }
}

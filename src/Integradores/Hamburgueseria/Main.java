package Integradores.Hamburgueseria;

public class Main {
    public static void main(String[] args) {
       Ingrediente panCampo = new Ingrediente("Pan de Campo",5500.0);
       Ingrediente panPapa = new Ingrediente("Pan de Papa",4500.0);

       Ingrediente medallonCarne = new Ingrediente("Medallon de Carne",2900.0);
       Ingrediente medallonPollo = new Ingrediente("Medallon de Pollo",1500.0);
       Ingrediente medallonVeggie = new Ingrediente("Medallon Vegguie",1890.0);

       Ingrediente cheddar = new Ingrediente("Cheddar",600.0);
       Ingrediente berenjena = new Ingrediente("Berenjena",350.0);

        Hamburguesa hamburguesa1 = new Hamburguesa();
        hamburguesa1.agregarPan(panPapa);
        hamburguesa1.agregarMedallon(medallonPollo);
        hamburguesa1.agregarMedallon(medallonCarne);
        hamburguesa1.agregarIngrediente(cheddar);
        hamburguesa1.agregarIngrediente(berenjena);

        Hamburguesa hamburguesa2 = new Hamburguesa();
        hamburguesa2.agregarPan(panCampo);
        hamburguesa2.agregarMedallon(medallonVeggie);
        hamburguesa2.agregarIngrediente(cheddar);
        hamburguesa2.agregarIngrediente(berenjena);

        System.out.println("La hamburguesa 1 puede ser facturada?: " + hamburguesa1.puedoFacturar());
        System.out.println("Cual sería su precio?: " + hamburguesa1.calcularPrecio());

        System.out.println();

        System.out.println("La hamburguesa 2 puede ser facturada?: " + hamburguesa2.puedoFacturar());



    }
}

package Integradores.Hamburgueseria;

public class Main {
    public static void main(String[] args) {

        Hamburguesa hamburguesa1 = new Hamburguesa();
        hamburguesa1.agregarPan(new PanPapa());
        hamburguesa1.agregarMedallon(new MedallonCarne());
        hamburguesa1.agregarMedallon(new MedallonPollo());
        hamburguesa1.agregarIngrediente(new HuevoFrito());
        hamburguesa1.agregarIngrediente(new Lechuga());

        Hamburguesa hamburguesa2 = new Hamburguesa();
        hamburguesa2.agregarPan(new PanCampo());
        hamburguesa2.agregarMedallon(new MedallonCarne());
        hamburguesa2.agregarIngrediente(new HuevoFrito());
        hamburguesa2.agregarIngrediente(new Lechuga());

        System.out.println("Hamburguesa 1 - Se puede facturar?: "+hamburguesa1.puedeSerFacturada());
        System.out.println("Hamburguesa 1 - Precio Total: "+hamburguesa1.calcularPrecioTotal());

        System.out.println();

        System.out.println("Hamburguesa 2 - Se puede facturar?: "+hamburguesa2.puedeSerFacturada());
        System.out.println("Hamburguesa 2 - Y si le saco un ingrediente?");
        hamburguesa2.eliminarIngrediente(new  HuevoFrito());
        System.out.println("Hamburguesa 2 - Precio Total: "+hamburguesa2.calcularPrecioTotal());

    }
}

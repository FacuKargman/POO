package TP2.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Actividad yoga = new Actividad("Yoga","Yoga","Yoga");
        Actividad pileta = new Actividad("Pileta","Pileta","Pileta");
        Actividad pilates = new  Actividad("Pilates","Pilates","Pilates");
        Actividad spinning = new Actividad("Spinning","Spinning","Spinning");

        Membresia membresiaFull = new MembresíaFull();
        Membresia membresiaPrueba = new MembresíaPrueba();
        Membresia membresíaYoga = new MembresíaXTipoActividad(yoga);
        MembresíaXCantActividad membresiaXCant = new MembresíaXCantActividad(1);


        Persona facu = new Persona("Facu",40511287,membresiaFull);
        Persona ariana = new Persona("Ariana",40112310,membresiaXCant);
        Persona raul = new Persona("Raul",29000122,membresiaPrueba);
        Persona paula = new Persona("Paula",39012312, membresíaYoga);

        System.out.println("Bienvenidos!!");
        System.out.println();

        System.out.println("Facu tiene una membresía Full.. podrá hacer las siguientes actividades?");
        System.out.println("Yoga?: " + facu.getMembresia().puedoRealizarActividad(yoga));
        System.out.println("Pileta?: " + facu.getMembresia().puedoRealizarActividad(pileta));
        System.out.println("Pilates?: " + facu.getMembresia().puedoRealizarActividad(pilates));
        System.out.println("Spinning?: " + facu.getMembresia().puedoRealizarActividad(spinning));
        System.out.println();

        System.out.println("Fantastico! Ariana tiene membresía x 1 actividad.");
        System.out.println("Podrá hacer yoga?: " + ariana.getMembresia().puedoRealizarActividad(yoga));
        ariana.realizarActividad(yoga);
        System.out.println("Bueno. Ariana fue a hacer Yoga. Ahora... podrá hacer pilates?: " + ariana.getMembresia().puedoRealizarActividad(pilates));
        System.out.println("Okey Ari. Como siempre me gustaste, te voy a dar 10 actividades más <3");
        membresiaXCant.sumarCantidadActividades(10);
        System.out.println("Listo!! Ahora podes hacer pilates?: " + ariana.getMembresia().puedoRealizarActividad(pilates));
        System.out.println();

        System.out.println("Vamos con Paula. La tipaza sacó una membresía solo para yoga. Podrá hacer Pilates?: " + paula.getMembresia().puedoRealizarActividad(pilates));
        System.out.println("Tiene sentido.. pero Yoga si podes hacer, no?: " + paula.getMembresia().puedoRealizarActividad(yoga));
        System.out.println();

        System.out.println("Finalmente, el ratoncito de Raul sacó membrecía de Prueba... entonces preguntó si puede hacer Spinnning: "+raul.getMembresia().puedoRealizarActividad(spinning));
        raul.realizarActividad(spinning);
        System.out.println("La pasó bomba el tipo... pero ya que fue a una clase, podrá ir, por ejemplo, a yoga?: " + raul.getMembresia().puedoRealizarActividad(yoga));



    }
}

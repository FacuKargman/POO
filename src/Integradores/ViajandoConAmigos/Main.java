package Integradores.ViajandoConAmigos;

public class Main {
    public static void main(String[] args) {
        Ciudad bsas = new Ciudad("Buenos Aires", 0.0);
        Ciudad mendoza = new Ciudad("Mendoza", 7.0);
        Ciudad bariloche = new Ciudad("Bariloche", 0.0);
        Ciudad mdq = new Ciudad("Mdq", 8.0);

        Actividad cataMendoza = new ActividadGrupal(245.0, mendoza, 18);
        Actividad parapenteMdq = new ActividadGrupal(245.0, mdq, 18);
        Actividad paseoVeleroBsas = new ActividadPrivada(720.0, bsas, 6);
        Actividad paseoVeleroBsas2 = new ActividadPrivada(720.0, bsas, 6);


        Persona matias = new Persona(19);
        Persona martin = new Persona(19);
        Persona nico = new Persona(19);

        GrupoAmigos grupo1 = new GrupoAmigos(2200.0);
        grupo1.agregarAmigo(matias);
        grupo1.agregarAmigo(martin);
        grupo1.agregarAmigo(nico);
        Paquete paquete = new Paquete(grupo1);
        paquete.agregarEstadia(new Estadia(bsas,2));
        paquete.agregarEstadia(new Estadia(mendoza,2));
        paquete.agregarEstadia(new Estadia(bariloche,3));
        paquete.agregarActividad(cataMendoza);
        paquete.agregarActividad(parapenteMdq);
        paquete.agregarActividad(paseoVeleroBsas);


        Double calculoTotal = paquete.calcularPrecioTotal();
        boolean bool = paquete.dentroDelPresupuesto();
        Ciudad ciudadCara = paquete.ciudadDondeSeGastaMasEnActividades();


    }
}

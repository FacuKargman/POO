package Integradores.LolaPOOlooza;

public class Main {
    public static void main(String[] args) {
        Festival festival = new Festival();
        Escenario escenarioPerry = new Escenario("Perry",true);
        Escenario escenarioFlow = new Escenario("Flow",true);
        Escenario escenarioSamsung = new Escenario("Samsung",false);
        Fecha fecha1 = new Fecha(23,06,2025);
        Fecha fecha2 = new Fecha(24,06,2025);
        Fecha fecha3 = new Fecha(25,06,2025);
        festival.agregarRecital(new Recital(new Artista("RHCP"),escenarioPerry,fecha1));
        festival.agregarRecital(new Recital(new Artista("Justin"),escenarioFlow,fecha1));
        festival.agregarRecital(new Recital(new Artista("Selena"),escenarioSamsung,fecha1));
        festival.agregarRecital(new Recital(new Artista("Pearl Jam"),escenarioPerry,fecha2));
        festival.agregarRecital(new Recital(new Artista("Gorillaz"),escenarioFlow,fecha2));
        festival.agregarRecital(new Recital(new Artista("Bruno Mars"),escenarioSamsung,fecha2));
        festival.agregarRecital(new Recital(new Artista("Metalica"),escenarioPerry,fecha3));
        festival.agregarRecital(new Recital(new Artista("Demi Lovato"),escenarioFlow,fecha3));
        festival.agregarRecital(new Recital(new Artista("Katy Perry"),escenarioSamsung,fecha3));

        Persona facu = new Persona();
        Persona ari =  new Persona();
        Persona fede =  new Persona();
        Persona german =  new Persona();
        Persona melina =  new Persona();

    }
}


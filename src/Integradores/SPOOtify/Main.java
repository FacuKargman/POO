package Integradores.SPOOtify;

public class Main {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();
        plataforma.agregarCancion(new Cancion("1", "Red Hot Chili Peppers", "Californication"));
        plataforma.agregarCancion(new Cancion("2", "Queen", "Bohemian Rhapsody"));
        plataforma.agregarCancion(new Cancion("3", "The Beatles", "Hey Jude"));
        plataforma.agregarCancion(new Cancion("4", "Nirvana", "Smells Like Teen Spirit"));
        plataforma.agregarCancion(new Cancion("5", "Radiohead", "Creep"));
        plataforma.agregarCancion(new Cancion("6", "Pink Floyd", "Wish You Were Here"));
        plataforma.agregarCancion(new Cancion("7", "Coldplay", "Fix You"));
        plataforma.agregarCancion(new Cancion("8", "The Rolling Stones", "(I Can't Get No) Satisfaction"));
        plataforma.agregarCancion(new Cancion("9", "Muse", "Starlight"));
        plataforma.agregarCancion(new Cancion("10", "Arctic Monkeys", "Do I Wanna Know?"));

        Usuario facu = new Usuario("1","Facu");
        Usuario ari = new Usuario("2","Ariana");


        plataforma.getCancionPorID("1").reproducir(facu);
        plataforma.getCancionPorID("1").darLike(facu);
        System.out.println("Vino Facu y reprodució y le dió like a la canción: " + plataforma.getCancionPorID("1").toString());
        plataforma.getCancionPorID("1").reproducir(ari);
        System.out.println("Despues vino Ari y solo la reprodució... dicha canción es HIT?: " + plataforma.getCancionPorID("1").esHit());
        plataforma.getCancionPorID("1").darLike(ari);
        System.out.println("Despues le dió like. Ahora es HIT?: " + plataforma.getCancionPorID("1").esHit());

        System.out.println();

        System.out.println("Cuantas reproducciones tiene esa canción?: " + plataforma.getCancionPorID("1").getCantidadReproducciones());
        System.out.println("Cuantos likes tiene esa canción?: " + plataforma.getCancionPorID("1").getCantidadLikes());
        System.out.println("Cual es su artista?: " + plataforma.getCancionPorID("1").getArtista());

        System.out.println();

        System.out.println("Me listas los artistas que tenes en tu plataforma?:");
        plataforma.getArtistas().forEach(System.out::println);

        System.out.println();
        System.out.println("Cual es la canción más escuchada?: " + plataforma.getCancionMasReproducida().toString());

        System.out.println();
        System.out.println("SPOOtify es un éxito?: " + plataforma.esExitosa());
        plataforma.getCancionPorID("2").reproducir(facu);
        plataforma.getCancionPorID("3").reproducir(facu);
        plataforma.getCancionPorID("4").reproducir(facu);
        plataforma.getCancionPorID("5").reproducir(facu);
        plataforma.getCancionPorID("6").reproducir(facu);
        plataforma.getCancionPorID("7").reproducir(facu);
        plataforma.getCancionPorID("8").reproducir(facu);
        plataforma.getCancionPorID("9").reproducir(facu);
        plataforma.getCancionPorID("10").reproducir(facu);
        System.out.println("Vino Facu y escuchó todo... ahora es un exito?: "+ plataforma.esExitosa());

        plataforma.getCancionPorID("10").darLike(facu);
        System.out.println("A Facu le pintó likear la de los monos... cuales canciones son un HIT entonces?: ");
        plataforma.getHits().forEach(System.out::println);

    }
}

package TP2.Ejercicio2_3;

public class Main {
    public static void main(String[] args) {
        ImpresoraColor impresoraColor = new ImpresoraColor(10,10,10,10);
        ImpresoraEco impresoraEco = new ImpresoraEco(10,10,10,10);
        ImpresoraByN impresoraByN = new ImpresoraByN(10);
        ImpresoraPDF impresoraPDF = new ImpresoraPDF();


        Documento docRegular = new Documento(10,6,6,6,6);
        Documento docChico = new Documento(5,1,1,1,1);
        Documento docGrandeColor = new Documento(10,5,5,5,5);
        Documento docGrandeHojas = new Documento(100000,1,1,1,1);

        System.out.println("Arranquemos con las Impresiones");

        System.out.println();

        System.out.println("El DocRegular lo puedo imprimir en la color?: " + impresoraColor.podesImprimir(docRegular));
        System.out.println("Entonces Imprimi: " + impresoraColor.imprimi(docRegular));
        System.out.println("Y si lo quiero volver a imprimir?: " + impresoraColor.podesImprimir(docRegular));

        System.out.println();

        System.out.println("Okey... pasemos a la Eco");
        System.out.println("Puedo imprimir el docChico?: " + impresoraEco.podesImprimir(docChico));
        System.out.println("Bueno, imprimilo: " + impresoraEco.imprimi(docChico));
        System.out.println("Podes imprimir el docChico de nuevo?: " + impresoraEco.podesImprimir(docChico));
        System.out.println("Bueno, imprimilo: " + impresoraEco.imprimi(docChico));
        System.out.println("Finalmente, podrías imprimir el docRegular?: " + impresoraEco.podesImprimir(docRegular));

        System.out.println();

        System.out.println("Pasemos a la Blanco y Negro");
        System.out.println("Podes imprimir el docRegular?: " + impresoraByN.podesImprimir(docRegular));
        System.out.println("Okey... pero el docChico si, no?: " + impresoraByN.podesImprimir(docChico));
        System.out.println("Bueno, imprimilo nomas: " + impresoraByN.imprimi(docChico));

        System.out.println();

        System.out.println("Terminamos con la PDF");
        System.out.println("Entiendo que podrías imprimir el docChico: "+impresoraPDF.podesImprimir(docChico)+ " y también el docRegular: "+impresoraPDF.podesImprimir(docRegular));
        System.out.println("Pero te dá la nafta (licencia) para el docGrandeHojas? :"+impresoraPDF.podesImprimir(docGrandeHojas));
        System.out.println("A ver? Imprimilo: " + impresoraPDF.imprimi(docGrandeHojas));
        System.out.println("Me cagaste... pero ahora podrías imprimir el docChico? :" + impresoraPDF.podesImprimir(docChico));



    }
}

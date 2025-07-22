package TP2.Ejercicio2_3;

public class ImpresoraByN extends Impresora{

    public ImpresoraByN(int negro) {
        super(negro); // llama al constructor de la abstracta
    }

    @Override
    public boolean podesImprimir(Documento documento) {
        if (
                documento.getAmarilloRequerido() +
                        documento.getMagentaRequerido() +
                        documento.getCianRequerido() +
                        documento.getNegroRequerido() <= cantidadNegro
        ){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Documento imprimi(Documento documento) {
        documento.setFueImpreso(true);
        contadorDocumentos++;
        contadorHojasImpresas =+ documento.getCantidadHojas();
        cantidadNegro = cantidadNegro - documento.getNegroRequerido()
        + documento.getCianRequerido()
        + documento.getMagentaRequerido()
        + documento.getAmarilloRequerido();
        return documento;
    }
}

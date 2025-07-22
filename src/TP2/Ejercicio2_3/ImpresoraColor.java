package TP2.Ejercicio2_3;

public class ImpresoraColor extends Impresora{

    public ImpresoraColor(int cian, int amarillo, int magenta, int negro) {
        super(cian, amarillo, magenta, negro); // llama al constructor de la abstracta
    }

    @Override
    public boolean podesImprimir(Documento documento) {
        if (
                documento.getAmarilloRequerido() <= cantidadAmarillo &&
                        documento.getMagentaRequerido() <= cantidadMagenta &&
                        documento.getCianRequerido() <= cantidadCian &&
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
        cantidadNegro = cantidadNegro - documento.getNegroRequerido();
        cantidadCian = cantidadCian - documento.getCianRequerido();
        cantidadMagenta = cantidadMagenta - documento.getMagentaRequerido();
        cantidadAmarillo = cantidadAmarillo - documento.getAmarilloRequerido();
        return documento;
    }
}

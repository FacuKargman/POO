package TP2.Ejercicio2_3;

public class ImpresoraPDF extends Impresora{

    public ImpresoraPDF() {
        super(); // llama al constructor de la abstracta
    }

    public boolean licenciaActiva = true;

    @Override
    public boolean podesImprimir(Documento documento) {
        return licenciaActiva;
    }

    @Override
    public Documento imprimi(Documento documento) {
        documento.setFueImpreso(true);
        contadorDocumentos++;
        contadorHojasImpresas =+ documento.getCantidadHojas();
        if(contadorHojasImpresas>10000 || contadorDocumentos>500){
            licenciaActiva = false;
        }
        return documento;
    }
}

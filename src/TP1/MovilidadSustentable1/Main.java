package TP1.MovilidadSustentable1;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Empleado facu = new Empleado("Facu",new Auto());
        Empleado maria = new Empleado("Maria",new Moto());
        Empleado fran = new Empleado("Fran",new Auto());
        Empleado agus = new Empleado("Agus",new Bicicleta());
        Empleado mauro = new Empleado("Mauro",new TransportePublico());

        Empresa empresa = new Empresa();
        empresa.contratar(facu);
        empresa.contratar(maria);
        empresa.contratar(fran);
        empresa.contratar(agus);
        empresa.contratar(mauro);

        // Agrupar por premio
        Map<String, List<String>> agrupadoPorPremio = new HashMap<>();

        for (Empleado e : empresa.getEmpleados()) {
            String premio = e.getMovilidad().descripcionPremio();
            agrupadoPorPremio
                    .computeIfAbsent(premio, k -> new ArrayList<>())
                    .add(e.getNombre());
        }

        // Imprimir resultado
        for (Map.Entry<String, List<String>> entry : agrupadoPorPremio.entrySet()) {
            String premio = entry.getKey();
            String nombres = String.join(", ", entry.getValue());
            System.out.println(premio + ": " + nombres);
        }
    }



}

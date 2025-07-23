package Integradores.MatrizEnergetica;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ciudad {
    private List<Consumidor> consumidores =  new ArrayList<Consumidor>();
    private List<CentralProductora> centrales = new ArrayList<>();

    public int consumoTotal(){
        return consumidores.stream()
                .mapToInt(Consumidor::getConsumo)
                .sum();
    }

    public List<CentralProductora> centralesContaminantes(){
        return centrales.stream()
                .filter(central -> central.getEmision()>=70)
                .collect(Collectors.toList());
    }

    public boolean esEficiente(){
        return centrales.stream().allMatch(central -> central.getEmision()<82);
    }

    public List<Propietario> getPropietarios(){
        return centrales.stream()
                .map(CentralProductora::getPropietario)
                .distinct()
                .collect(Collectors.toList());
    }

    public boolean esSustentable(){
        return centrales.stream().mapToInt(CentralProductora::getProduccion).sum()
                > consumoTotal();
    }

    public boolean esPotencialmentePeligrosa(){
        return centrales.stream()
                .anyMatch(CentralProductora::estaExigida);
    }


}

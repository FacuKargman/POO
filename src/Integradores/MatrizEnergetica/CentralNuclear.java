package Integradores.MatrizEnergetica;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CentralNuclear extends CentralProductora{
    private List<Reactor> reactores = new ArrayList<Reactor>();

    public int getProduccion(){
       return reactores.stream().mapToInt(reactor -> reactor.getPotencia() - 5).sum();
    };

    public int getEmision(){return reactores.size()*41;};

    public void agregarReactor(Reactor reactor) {
        if (reactores.size() < 5) {
            reactores.add(reactor);
        }
    }

}

package TP1.MovilidadSustentable1;

import java.util.ArrayList;
import java.util.UUID;

public class SUBE {
    private String numero;
    private float balance;

    public SUBE(){
        numero = UUID.randomUUID().toString();
        balance = 0;
    }

    public void cargarSube(int carga){
        balance =+ carga;
    }
}


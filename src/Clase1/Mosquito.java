package Clase1;

public class Mosquito {
    private String nombre;
    private Object ultimoPicado;
    private Boolean picó = false;


    public void picarA(Object picado){
        ultimoPicado = picado;
        picó = true;
    }

    public Object getUltimoPicado(){
        return ultimoPicado;
    }

    public Boolean yaPicó() {
        return picó;
    }
}

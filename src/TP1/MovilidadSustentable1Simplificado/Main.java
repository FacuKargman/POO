package TP1.MovilidadSustentable1Simplificado;

public class Main {
    public static void main(String[] args) {

        Movilidad moto = new Movilidad("Moto","Voucher $50.000");
        Movilidad auto = new Movilidad("Auto","Voucher $50.000");
        Movilidad bici = new Movilidad("Bicicleta","Kit de Seguridad");
        Movilidad transportePublico = new Movilidad("TransportePublico","Carga SUBE por $80.000");

        Empleado facu = new Empleado("Facu",moto);
        Empleado maria = new Empleado("Maria",auto);
        Empleado fran = new Empleado("Fran",bici);
        Empleado agus = new Empleado("Agus",transportePublico);
        Empleado mauro = new Empleado("Mauro",transportePublico);

        Empresa empresa = new Empresa();
        empresa.contratar(facu);
        empresa.contratar(maria);
        empresa.contratar(fran);
        empresa.contratar(agus);
        empresa.contratar(mauro);

        for(Empleado e: empresa.getEmpleados()){
            System.out.println("El empleado " + e.getNombre() + " obtendrá el premio: " + e.getMedioMasUtilizado().getPremio());
        }
    }
}

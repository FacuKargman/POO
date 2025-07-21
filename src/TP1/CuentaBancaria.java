package TP1;

public class CuentaBancaria {
    private int numeroCuenta;
    private String tipoCuenta;
    private int saldo;

    public void cargarSaldo(int saldo){
        this.saldo =+ saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void restarSaldo(int saldo) {
        this.saldo =- saldo;
    }
}

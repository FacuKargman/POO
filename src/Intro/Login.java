package Intro;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws InterruptedException {

        String user = "fkargman";
        String pass = "123";
        boolean ingresoUsuario = false;
        boolean ingresoPass = false;
        int reintentos = 0;
        boolean volver = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido!");
        Thread.sleep(3000);

        while (!ingresoUsuario && !ingresoPass) {

            while (!ingresoUsuario) {
                System.out.print("Ingrese su usuario:");
                String a = sc.nextLine();
                if (a.equals(user)) {
                    ingresoUsuario = true;
                    Thread.sleep(2000);

                } else {
                    System.out.println("Usuario incorrecto...");
                    Thread.sleep(3000);
                    continue;
                }
            }


            while (!ingresoPass && !volver) {
                System.out.print("Ingrese su contraseña:");
                String b = sc.nextLine();
                if (b.equals(pass)) {
                    ingresoPass = true;
                    Thread.sleep(2000);
                } else {
                    if (reintentos == 2) {
                        System.out.println("Password incorrecto! 3 reintentos utilizados. Vuelva a ingresar las credenciales");
                        ingresoUsuario = false;
                        volver = true;
                    }else {
                        System.out.println("Password incorrecto! Vuelva a intentarlo");
                        reintentos++;
                    }
                }
            }

            if (volver) {
                volver = false;
                continue;
            } else {
                System.out.println("Bienvenido!");
            }
        }


        sc.close();
    }
}

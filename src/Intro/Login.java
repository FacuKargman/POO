package Intro;

import java.util.Scanner;

public class Login {

    public static void esperarRespuesta(int segundos) throws InterruptedException {
        for (int i = 0; i<segundos; i++){
            System.out.print(".");
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        String user = "fkargman";
        String pass = "123";
        boolean ingresoUsuario = false;
        boolean ingresoPass = false;
        int reintentos = 0;
        boolean volver = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido!");
        esperarRespuesta(3);

        while (!ingresoUsuario && !ingresoPass) {

            while (!ingresoUsuario) {
                System.out.print("Ingrese su usuario: ");
                String a = sc.nextLine();
                if (a.equals(user)) {
                    esperarRespuesta(2);
                    ingresoUsuario = true;
                } else {
                    esperarRespuesta(3);
                    System.out.print("Usuario incorrecto");
                    System.out.println();
                }
            }

            System.out.println();
            System.out.println();


            while (!ingresoPass && !volver) {
                System.out.print("Ingrese su contraseña: ");
                String b = sc.nextLine();
                esperarRespuesta(2);
                if (b.equals(pass)) {
                    ingresoPass = true;
                } else {
                    if (reintentos == 2) {
                        System.out.println("Password incorrecto! 3 reintentos utilizados. Vuelva a ingresar las credenciales");
                        ingresoUsuario = false;
                        volver = true;
                    }else {
                        System.out.println("Password incorrecto! Vuelva a intentarlo");
                        System.out.println();
                        reintentos++;
                    }
                }
            }

            if (volver) {
                volver = false;
            } else {
                System.out.println("Bienvenido!");
            }
            System.out.println();
            System.out.println();
        }


        sc.close();
    }
}

package c.operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String username = "wolfgang";
        String password = "1234";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese usuario: ");
        String u = scanner.next();

        System.out.print("Ingrese el password: ");
        String p = scanner.next();

        boolean esAutenticado = false;

        if(username.equals(u) && password.equals(p)){
            esAutenticado = true;
        } else {
            System.out.println("Usuari o password incorrectos.");
        }

        if(esAutenticado){
            System.out.println("Bienvenido usuario: " + u + ".");
        } else {
            System.out.println("Requiere autenticacion.");
        }
    }
}

package k.arreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarString {

    public static void main(String[] args) {

        String[] a = new String[4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){
            System.out.print("Ingrese un nombre: ");
            a[i] = scanner.next();
        }
        System.out.print("\r\nIngrese un nombre a buscar: ");
        String nombre = scanner.next();
        int i = 0;
        while(i < a.length && !a[i].equalsIgnoreCase(nombre)){
            i++;
        }
        if (i == a.length){
            System.out.println("Nombre no encontrado.");
        } else if (a[i].equalsIgnoreCase(nombre)){
            System.out.println("Encontrado en la posicion " + i);
        }
    }
}

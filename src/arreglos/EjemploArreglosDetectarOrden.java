package arreglos;

import java.util.Scanner;

public class EjemploArreglosDetectarOrden {

    public static void main(String[] args) {

        int[] a = new int[7];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese 7 numeros: ");
        for (int i = 0; i < a.length; i++){
            a[i] = scanner.nextInt();
        }

        boolean ascendente = false;
        boolean descendente = false;
        for (int i = 0; i < a.length - 1; i++){
            if (a[i] > a[i + 1]){
                descendente = true;
            }

            if (a[i] < a[i + 1]){
                ascendente = true;
            }
        }

        if (descendente == true && ascendente == true){
            System.out.println("Arreglo = desordenado");
        }
        if (ascendente == false && descendente == false){
            System.out.println("Arreglo = todos son iguales");
        }
        if (ascendente == true && descendente == false){
            System.out.println("Arreglo = ascendente");
        }
        if (ascendente == false && descendente == true){
            System.out.println("Arreglo = descendente");
        }
    }
}

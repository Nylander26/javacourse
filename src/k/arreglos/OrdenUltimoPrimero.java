package k.arreglos;

import java.util.Scanner;

public class OrdenUltimoPrimero {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length - i; i++) {
            System.out.print(numeros[numeros.length - 1 - i] + " - ");
            System.out.println(numeros[i]);
        }
    }
}

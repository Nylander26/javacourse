package d.flujosdecontrol;

import java.util.Scanner;

public class NumeroMenorMultiplesValores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cantidadNumeros = 10;

        int minimo = Integer.MAX_VALUE;

        for (int i = 1; i <= cantidadNumeros; i++){
            System.out.print("Ingrese un numero entero: ");
            int numero = scanner.nextInt();

            if (numero < minimo){
                minimo = numero;
            }

        }

        System.out.println("El minimo es = " + minimo);

        if (minimo < 10) {
            System.out.println("El numero es menor a 10.");
        } else if (minimo == 10){
            System.out.println("El numero es igual a 10.");
        } else {
            System.out.println("El numero es mayor a 10.");
        }
    }
}

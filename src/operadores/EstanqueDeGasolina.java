package operadores;

import java.util.Scanner;

public class EstanqueDeGasolina {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Indique la medida actual de gasolina: ");
        double capacidad = scanner.nextDouble();

        if (capacidad > 70 || capacidad < 1){
            System.out.println("Por favor indique un numero menor a 70 o mayor a 1.");
            main(args);
            System.exit(0);
        } else if (capacidad == 70) {
            System.out.println("Estanque lleno");
        } else if (capacidad < 70 && capacidad >= 60) {
            System.out.print("Estanque casi lleno");
        } else if (capacidad < 60 && capacidad >= 40) {
            System.out.println("Estanque 3/4");
        } else if (capacidad < 40 && capacidad >= 20) {
            System.out.println("Suficiente");
        } else {
            System.out.println("Insuficiente");
        }
    }
}

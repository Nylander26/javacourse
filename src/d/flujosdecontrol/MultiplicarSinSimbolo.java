package d.flujosdecontrol;

import java.util.Scanner;

public class MultiplicarSinSimbolo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int resultado = 0;

        System.out.print("Ingrese un numero: ");
        num1 = scanner.nextInt();

        System.out.print("Ingrese un segundo numero: ");
        num2 = scanner.nextInt();

        int factor = (num2 < 0) ? -1 : 1;
        for (int i = 0; i < Math.abs(num2); i++){
            resultado += num1 * factor;
        }

        System.out.println("El resultado de " + num1 + " por " + num2 + " es: " + resultado);
    }
}

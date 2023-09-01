package c.operadores;

import java.util.Scanner;

public class NumerosDeMayorAMenor {
    public static void main(String[] args) {

        int num1, num2, max;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num1 = scanner.nextInt();

        System.out.print("Ingrese un segundo numero: ");
        num2 = scanner.nextInt();

        max = num1 > num2 ? num1 : num2;
        System.out.println("El numero mayor es " + max);
    }
}

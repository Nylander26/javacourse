package clasemath;

import java.util.Scanner;

public class CalculoAreaDelCirculo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del circulo: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * (Math.pow(radio, 2));
        System.out.println("El area del circulo es = " + area);
    }
}

package arreglos;

import java.util.Scanner;

public class NumeroMaximo {

    public static void main(String[] args) {

        int[] a = new int[7];
        int max = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){
            System.out.print("Ingrese un numero: ");
            a[i] = scanner.nextInt();
            max = Math.max(max, a[i]);
        }

        System.out.println("max = " + max);
    }
}

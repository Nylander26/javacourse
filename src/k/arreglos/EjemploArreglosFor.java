package k.arreglos;

import java.util.Arrays;

public class EjemploArreglosFor {

    public static void main(String[] args) {

        String[] productos = new String[7];
        int count = productos.length;

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung";
        productos[2] = "HDD";
        productos[3] = "PC";
        productos[4] = "MAC";
        productos[5] = "ChromeCast";
        productos[6] = "SmartWatch";

        Arrays.sort(productos);
        System.out.println("=== Usando for ===");
        for (int i = 0; i < count; i++){
            System.out.println("Para indice " + i + ": " + productos[i]);
        }

        System.out.println("=== Usando foreach ===");
        for (String prod: productos){
            System.out.println("prod = " + prod);
        }

        System.out.println("=== Usando while ===");
        int i = 0;
        while (i < count){
            System.out.println("Para indice " + i + ": " + productos[i]);
            i++;
        }

        System.out.println("=== Usando do while ===");
        int j = 0;
        do {
            System.out.println("Para indice " + j + ": " + productos[j]);
            j++;
        } while (j < count);

        int[] numeros = new int[10];

        int totalNumeros = numeros.length;
        for (int k = 0; k < totalNumeros; k++){
            numeros[k] = k * 3;
        }

        for (int k = 0; k < totalNumeros; k++){
            System.out.println("numeros " + k + " = " + numeros[k]);
        }
    }
}

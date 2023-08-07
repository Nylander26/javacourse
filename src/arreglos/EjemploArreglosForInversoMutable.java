package arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

    public static void arregloInverso(String[] arreglo) {
        int count2 = arreglo.length;
        int count = arreglo.length;
        for (int i = 0; i < count2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[count - 1 - i];
            arreglo[i] = inverso;
            arreglo[count - 1 - i] = actual;
            count2--;
        }
    }
    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB", "Samsung", "HDD", "PC", "MAC", "ChromeCast", "SmartWatch"};
        int count = productos.length;

        Arrays.sort(productos);
        arregloInverso(productos);

        Collections.reverse(Arrays.asList(productos)); // Metodo para ordenar a la inversa y transformar un array a una lista

        System.out.println("=== Usando for ===");
        for (int i = 0; i < count; i++){
            System.out.println("Para indice " + i + ": " + productos[i]);
        }
    }
}

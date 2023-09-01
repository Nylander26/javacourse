package k.arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja {

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
        int contador = 0;

        for (int i = 0; i < count; i++){
            for (int j = 0; j < count; j++){
                if (productos[i].compareTo(productos[j]) < 0){
                    String aux = productos[i];
                    productos[i] = productos[j];
                    productos[j] = aux;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
        //Arrays.sort(productos);
        //arregloInverso(productos);
        
        System.out.println("=== Usando for ===");
        for (int i = 0; i < count; i++){
            System.out.println("Para indice " + i + ": " + productos[i]);
        }
    }
}

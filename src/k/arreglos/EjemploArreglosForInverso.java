package k.arreglos;

import java.util.Arrays;

public class EjemploArreglosForInverso {

    public static void main(String[] args) {

//        String[] productos = new String[7];
        String[] productos = {"Kingston Pendrive 64GB", "Samsung", "HDD", "PC", "MAC", "ChromeCast", "SmartWatch"};
        int count = productos.length;

//        productos[0] = "Kingston Pendrive 64GB";
//        productos[1] = "Samsung";
//        productos[2] = "HDD";
//        productos[3] = "PC";
//        productos[4] = "MAC";
//        productos[5] = "ChromeCast";
//        productos[6] = "SmartWatch";

        Arrays.sort(productos);
        System.out.println("=== Usando for ===");
        for (int i = 0; i < count; i++){
            System.out.println("Para indice " + i + ": " + productos[i]);
        }

        System.out.println("=== Usando for inverso ===");
        for (int i = 0; i < count; i++) {
            System.out.println("Para i = " + (count - 1 - i) + " valor: " + productos[count - 1 - i]);
        }

        System.out.println("=== Usando for inverso 2 ===");
        for (int i = count - 1; i >= 0; i--){
            System.out.println("Para indice " + i + ": " + productos[i]);
        }
    }
}

package arreglos;

public class EjemploArreglosForOrdenamientoBurbujaOptimizado {

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

        for (int i = 0; i < count - 1; i++){
            for (int j = 0; j < count - 1 - i; j++){
                if (productos[j + 1].compareTo(productos[j]) < 0){
                    String aux = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = aux;
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

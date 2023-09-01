package k.arreglos;

public class EjemploArreglosForOrdenamientoBurbujaOptimizadoEnteros {

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

    public static void sortBurbuja(Object[] arreglo){

        int contador = 0;
        int total = arreglo.length;

        for (int i = 0; i < total - 1; i++){
            for (int j = 0; j < total - 1 - i; j++){
                if (((Comparable)arreglo[j + 1]).compareTo(arreglo[j]) < 0){ // En caso de cambiar el orden de ascendente a descendente, solo se cambia el signo de "menor que" a "mayor que"
                    Object aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }
    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB", "Samsung", "HDD", "PC", "MAC", "ChromeCast", "SmartWatch"};
        int count = productos.length;

        sortBurbuja(productos);
        System.out.println("=== Usando for ===");
        for (int i = 0; i < count; i++){
            System.out.println("Para indice " + i + ": " + productos[i]);
        }

        Integer[] numeros = new Integer[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;

        sortBurbuja(numeros);

        for (int i = 0; i < numeros.length; i++){
            System.out.println("i = " + numeros[i]);
        }
    }
}

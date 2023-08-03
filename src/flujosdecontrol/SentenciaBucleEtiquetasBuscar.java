package flujosdecontrol;

public class SentenciaBucleEtiquetasBuscar {

    public static void main(String[] args) {

        String frase = "tres tistres tigres tragan trigo en un trigal";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() -  maxPalabra;
        int cantidad = 0;

        buscar:
        for (int i = 0; i <= maxFrase;) {
            int k = i; // Se usa otra variable para recorrer la palabra de forma independiente a la i
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }
        System.out.println("Encontrado " + cantidad + " veces la palabra " + palabra + " en la frase");
    }
}

package matrices;

public class EjemploMatricesSimetricas {

    public static void main(String[] args) {
        boolean simetrica = true;

        int[][] matriz = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7}
        };

        int i;
        int j;
        i = 0;
        salir: while(i < matriz.length && simetrica) {
            j = 0;
            while(j < i && simetrica) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break salir;
                }
                j++;
            }
            i++;
        }

        if (simetrica) {
            System.out.println("La matriz es simetrica");
        } else {
            System.out.println("La matriz no es simetrica");
        }
    }
}

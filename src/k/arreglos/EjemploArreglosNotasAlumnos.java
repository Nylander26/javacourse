package k.arreglos;

import java.util.Scanner;

public class EjemploArreglosNotasAlumnos {

    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 7 notas de estudiantes para matematicas: ");
        for (int i = 0; i < claseMatematicas.length; i++){
            claseMatematicas[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para historia: ");
        for (int i = 0; i < claseHistoria.length; i++){
            claseHistoria[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para lenguaje: ");
        for (int i = 0; i < claseLenguaje.length; i++){
            claseLenguaje[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 7; i++){
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }

        double promedioMatematicas = sumNotasMatematicas/claseMatematicas.length;
        double promedioHistoria = sumNotasHistoria/claseHistoria.length;
        double promedioLenguaje = sumNotasLenguaje/claseLenguaje.length;
        System.out.println("Promedio clase matematicas: " + promedioMatematicas);
        System.out.println("Promedio clase historia: " + promedioHistoria);
        System.out.println("Promedio clase lenguaje: " + promedioLenguaje);
        System.out.println("Promedio total del curso: " + (promedioMatematicas + promedioHistoria + promedioLenguaje) / 3);

        System.out.println("Ingrese el identificador del alumno (de 0 - 6): ");
        int id = scanner.nextInt();
        double promedioAlumno = (claseMatematicas[id] + claseLenguaje[id] + claseLenguaje[id]) / 3;
        System.out.println("Promedio alumno Nro " + id + ": " + promedioAlumno);
    }
}

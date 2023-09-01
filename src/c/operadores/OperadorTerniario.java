package c.operadores;

import java.util.Scanner;

public class OperadorTerniario {
    public static void main(String[] args) {

        // variable = condicion ? si_es verdadero: si_es falso

        String var = 7 == 5 ? "si es verdadero" : "si es falso";
        System.out.println("var = " + var);

        String estado = "";
        double promedio = 6.2;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese la nota de matematicas entre 2.0 a 7.0: ");
        matematicas = s.nextDouble();

        System.out.print("Ingrese la nota de ciencias entre 2.0 a 7.0: ");
        ciencias = s.nextDouble();

        System.out.print("Ingrese la nota de historia entre 2.0 a 7.0: ");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;

        estado = promedio >= 5.49 ? "Aprobado" : "Reprobado";
        System.out.println("estado = " + estado + " " + promedio);
    }
}

package string;

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String separador = ".";
        
        System.out.print("Ingrese el nombre de un familiar: ");
        String familiar1 = scanner.nextLine();

        System.out.print("Ingrese el nombre de un segundo familiar: ");
        String familiar2 = scanner.nextLine();

        System.out.print("Ingrese el nombre de un tercer familiar: ");
        String familiar3 = scanner.nextLine();
        
        String segundoIndiceFamiliar1 = familiar1.substring(1, 2).toUpperCase();
        String ultimosDosIndicesFamiliar1 = familiar1.substring(familiar1.length() - 2);
        String familiar1Formateado = segundoIndiceFamiliar1.concat(separador).concat(ultimosDosIndicesFamiliar1);
        
        String segundoIndiceFamiliar2 = familiar2.substring(1, 2).toUpperCase();
        String ultimosDosIndicesFamiliar2 = familiar2.substring(familiar2.length() - 2);
        String familiar2Formateado = segundoIndiceFamiliar2.concat(separador).concat(ultimosDosIndicesFamiliar2);
        
        String tercerIndiceFamiliar3 = familiar3.substring(1, 2).toUpperCase();
        String ultimosDosIndicesFamiliar3 = familiar3.substring(familiar3.length() - 2);
        String familiar3Formateado = tercerIndiceFamiliar3.concat(separador).concat(ultimosDosIndicesFamiliar3);
        
        String resultado = familiar1Formateado + "_" + familiar2Formateado + "_" + familiar3Formateado;
        System.out.println("resultado = " + resultado);
    }
}

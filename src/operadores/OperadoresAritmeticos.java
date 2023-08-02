package operadores;

import javax.swing.JOptionPane;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;
        System.out.println("suma = " + suma);

        System.out.println("(i + j) = " + (i + j));
        
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (i - j));
        
        int multiplicacion = i * j;
        System.out.println("multiplicacion = " + multiplicacion);
        
        int division = i / j;
        float division2 = (float) i / j; // casting para forzar el resultado en float o double
        System.out.println("division = " + division);
        System.out.println("division = " + division2);
        
        int resto = i % j;
        System.out.println("resto = " + resto);
        
        resto = 8 % 5;
        System.out.println("resto = " + resto);
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        if(numero % 2 == 0){
            System.out.println("numero par = " + numero);
        } else {
            System.out.println("numero impar = " + numero);
        }
    }
}

package operadores;

import javax.swing.JOptionPane;

public class NombreMasLargo {
    public static void main(String[] args) {

        String mensaje = "Ingrese un nombre y apellido: ";
        String input1 = JOptionPane.showInputDialog(null, mensaje);
        String input2 = JOptionPane.showInputDialog(null, mensaje);
        String input3 = JOptionPane.showInputDialog(null, mensaje);

        String nombre1 = input1.split(" ")[0];
        String nombre2 = input2.split(" ")[0];
        String nombre3 = input3.split(" ")[0];

        int longitud1 = nombre1.length();
        int longitud2 = nombre2.length();
        int longitud3 = nombre3.length();

        int max = Math.max(longitud1, Math.max(longitud2, longitud3));

        if (max == longitud1) {
            System.out.print(nombre1 + " tiene el nombre más largo.");
        } else if (max == longitud2) {
            System.out.print(nombre2 + " tiene el nombre más largo.");
        } else {
            System.out.print(nombre3 + " tiene el nombre más largo.");
        }
    }
}

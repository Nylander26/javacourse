package a.variables;

public class PrimitivosCaracteres {
    public static void main(String[] args) {
        
        var caracter = '\u0040';
        var decimal = 64;
        System.out.println("Caracter = " + caracter);
        System.out.println("Decimal = " + decimal);
        System.out.println("Decimal = Caracter: " + (decimal == caracter));
        
        char simbolo = '@';
        System.out.println("Simbolo = " + simbolo);
        System.out.printf("Simbolo = Caracter: " + (simbolo + caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("Char corresponde en byte = " + System.lineSeparator() + Character.BYTES);
        System.out.println("Char corresponde en bites = " + Character.SIZE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
    }
}

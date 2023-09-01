package c.operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        // Pre incremento = Incrementa en uno y luego devuelve el valor.
        int i = 1;
        int j = ++i; // i = i + 1

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post incremento = Devuelve el valor y luego incrementa en uno.
        i = 2;
        System.out.println("inicial de i =  = " + i );
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        // Pre decremento = Decrementa en uno y luego devuelve el valor.
        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        // Post decremento = Devuelve el valor y luego decrementa en uno.
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + j);
    }
}

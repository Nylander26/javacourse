package c.operadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {
        
        String texto = "Objeto";
        Integer num = 7;
        
        boolean b1 = texto instanceof String;
        System.out.println("Texto es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es del tipo Object = " + b1);

        b1 = num instanceof Integer;
        System.out.println("Num es del tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("Num es del tipo Number = " + b1);
    }
}

package operadores;

public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {
        
        Object texto = "Objeto";
        Number num = 7;
        
        boolean b1 = texto instanceof String;
        System.out.println("Texto es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es del tipo Object = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("Texto es del tipo Integer = " + b1);

        b1 = num instanceof Integer;
        System.out.println("Num es del tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("Num es del tipo Number = " + b1);

        b1 = num instanceof Long;
        System.out.println("Num es del tipo Long = " + b1);
    }
}

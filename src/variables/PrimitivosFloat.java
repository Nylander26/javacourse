package variables;

public class PrimitivosFloat {
    public static void main(String[] args) {

        float realFloat = 0.000000000015f; // 1.5e-10f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Float corresponde en byte a = " + Float.BYTES);
        System.out.println("Float corresponde en bites a = " + Float.SIZE);
        System.out.println("Maximo valor para float = " + Float.MAX_VALUE);
        System.out.println("Minimo valor para float = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realFloat = " + realDouble);
        System.out.println("Double corresponde en byte a = " + Double.BYTES);
        System.out.println("Double corresponde en bites a = " + Double.SIZE);
        System.out.println("Maximo valor para double = " + Double.MAX_VALUE);
        System.out.println("Minimo valor para double = " + Double.MIN_VALUE);
        
        float varFlotante = 3.1416f; // valor de PI
        System.out.println("varFlotante = " + varFlotante);
    }
}

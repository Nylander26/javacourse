package j.lineacomando;

public class ArgumentosLineaComandoCalculadora {

    public static void main(String[] args) { // Como segunda opcion, se modifican las variables del programa en la opcion "Edit Configurations"
        // en la seccion superior, que debe mostrar el nombre del archivo a compilar "ArgumentosLineaComandoCalculadora"

        if (args.length != 3){
            System.out.println("Por favor ingresa una operacion (suma, resta, multi o div) y dos enteros.");
            System.exit(-1);
        }
        String operacion = args[0];
        int a = 0;
        double b = 0;
        double resultado;

        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.err.println("A y B deben se enteros, vuelve a intentar.");
            System.exit(-1);
        }
        switch (operacion) {
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multi":
                resultado = a * b;
                break;
            case "div":
                if (b == 0){
                    System.out.println("No se puede dividir entre cero.");
                    System.exit(-1);
                }
                resultado = a / b;
                break;
            default:
                resultado = a + b;
        }

        System.out.println("Resultado de la operacion '" + operacion + "' es: " + resultado);
    }
}

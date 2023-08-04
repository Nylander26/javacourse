package lineacomando;

public class ArgumentosLineaComandos {

    public static void main(String[] args) { // Se trabaja con consola, compila con "javac <Nombre del archivo>.java" y se ejecuta con

        if (args.length == 0){
            System.out.println("Debe ingresar argumentos!");
            System.exit(-1);
        }
        for (int i = 0; i < args.length; i++){
            System.out.println("Argumentos nro = " + i + ": " + args[i]);
        }
    }
}

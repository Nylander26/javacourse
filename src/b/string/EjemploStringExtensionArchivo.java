package b.string;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {

        String archivo = "imagen.jpeg";
        int i = archivo.lastIndexOf('.');
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring( i + 1 ) = " + archivo.substring( i + 1 ));
    }
}
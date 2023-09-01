package b.string;

public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Wolfgang";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Wolfgang\") = " + nombre.equals("Wolfgang"));
        System.out.println("nombre.equals(\"wolfgang\") = " + nombre.equals("wolfgang")); // Minusuculas
        System.out.println("nombre.equalsIgnoreCase(\"wolfgang\") = " + nombre.equalsIgnoreCase("wolfgang")); // Ignora mayusculas
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres")); // Comparacion lexicografica de la tabla unicode, devuelve un int
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); // Posicion del caracter
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(nombre.length() - 1 ) = " + nombre.charAt(nombre.length() - 1 )); // Ultima posicion del caracter de manera dinamica

        System.out.println("nombre.substring(1) = " + nombre.substring(1)); // Secciona el string, iniciando por el parametro inclusive
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4)); // Secciona el string entre las posiciones de los chars, excluyendo el ultimo
        System.out.println("nombre.substring(6, 8) = " + nombre.substring(6, 8));
        System.out.println("nombre.substring(7) = " + nombre.substring(7));
        System.out.println("nombre.substring(nombre.length() - 1 ) = " + nombre.substring(nombre.length() - 1 ));
        System.out.println("nombre.substring(nombre.length() - 2 ) = " + nombre.substring(nombre.length() - 2 )); // Posicion de los dos ultimos chars dinamicamente
        
        // ---------------------- Segundo Video ------------------------------- // 
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('t'));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));
        System.out.println("   trabalenguas     ");
        System.out.println("   trabalenguas     ".trim());
    }
}

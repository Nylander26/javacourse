package clasesystem;

import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistemaManejoErrores {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/clasesystem/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "Mi valor");

            System.setProperties(p);
            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(\"mi.propiedad.personalizada\") = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("otra"));

            ps.list(System.out);

            System.gc(); // Acelera el proceso del Garbage Collector para optimizar la memoria limpiando las referencias innecesarias a los objetos
        } catch (Exception e) {
            System.err.println("No existe el archivo = " + e.getMessage());
            //System.err.println("No existe el archivo = " + e);
            System.exit(1);
        }

    }
}

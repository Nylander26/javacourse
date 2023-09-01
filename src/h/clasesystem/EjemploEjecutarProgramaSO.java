package h.clasesystem;

import java.io.IOException;

public class EjemploEjecutarProgramaSO {

    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process process;
        String osName = "os.name";

        try {
            if (System.getProperty(osName).toLowerCase().startsWith("windows")) {
                process = rt.exec("notepad");
            } else if (System.getProperty(osName).toLowerCase().startsWith("mac")) {
                process = rt.exec("open/Applications/TextEdit.app");
            } else if (System.getProperty(osName).toLowerCase().contains("nux") ||
                    System.getProperty(osName).toLowerCase().contains("nix")) {
                process = rt.exec("gedit");
            } else {
                process = rt.exec("gedit");
            }
            process.waitFor();
        } catch (Exception e) {
            System.err.println("El comando es desconocido " + e.getMessage());
        }
        System.out.println("Se ha cerrado el editor.");
        System.exit(0);
    }
}

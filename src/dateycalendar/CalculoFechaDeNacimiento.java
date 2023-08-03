package dateycalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalculoFechaDeNacimiento {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long tiempoDiferencia;
        double edad;
        int edadCalculada;

        System.out.print("Ingresa tu fecha de nacimiento (dd/MM/yyyy): ");
        String fechaDeNacimientoStr = scanner.nextLine();

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaDeNacimiento = sdf.parse(fechaDeNacimientoStr);

            Date fechaActual = new Date();

            tiempoDiferencia = fechaActual.getTime() - fechaDeNacimiento.getTime();

            edad = tiempoDiferencia / 3.15576e10;

            edadCalculada = (int)Math.floor(edad);

            System.out.println("Tu edad es: " + edadCalculada + " años.");

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

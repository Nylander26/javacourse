package dateycalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.print("Ingrese una fecha con formato 'yyyy-MM-dd': ");

        try {
            Date fecha = format.parse(scanner.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();

            if (fecha.after(fecha2)){
                System.out.println("fecha1 (del usuario) es despues que fecha2 (actual)");
            } else if (fecha.before(fecha2)) {
                System.out.println("fecha1 (del usuario) es anterior que fecha2 (actual)");
            } else if (fecha.equals(fecha2)) {
                System.out.println("fecha1 es igual que fecha2");
            }

            if (fecha.compareTo(fecha2) > 0){
                System.out.println("fecha1 (del usuario) es despues que fecha2 (actual)");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("fecha1 (del usuario) es anterior que fecha2 (actual)");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("fecha es igual a fecha2");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

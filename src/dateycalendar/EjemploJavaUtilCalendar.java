package dateycalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {

    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        //calendario.set(2020, Calendar.JANUARY,25, 19, 20, 10);
        calendario.set(Calendar.YEAR, 2024);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);

        //calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha = calendario.getTime();
        System.out.println("Fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("Fecha con formato = " + fechaConFormato);

        Calendar calActual = Calendar.getInstance();
        Date fecha2 = calActual.getTime();

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
    }
}

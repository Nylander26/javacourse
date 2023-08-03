package dateycalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {

    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        //SimpleDateFormat df = new SimpleDateFormat("'fecha: 'yyyy.MM.dd G 'hora' HH:mm:ss z");
        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");
        String fechaStr = df.format(fecha);

        long j = 0;
        for (int i = 0; i < 10000000; i++) {
            j += i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido en el for = " + tiempoFinal);
        System.out.println("fechaStr = " + fechaStr);
    }
}

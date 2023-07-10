package ClasesDate_y_Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemplojavaUtilCalendar {
    public static void main(String[] args) {
        /**
         * LA CLASE CALENDAR ES ABSTRACTA, POR LO QUE NO PODEMOS INSTANCIARLA DIRECTAMENTE
         * DEBEMOS HACERLO MEDIANTE SU MÉTODO .getInstance()
         * **/

        /** Creamos instancia de Calendar, como es un método estático, no hace falta operador new */
        Calendar calendario = Calendar.getInstance();

        /** Inicializamos instancia de Date con Calendar.getTime()
         * por defecto nos va a tomar la fecha actual
         * para poner una fecha en concreto, debemos usar el método Calendar.set() */
        calendario.set(2023, 0, 23, 20,13, 05); // los meses empiezan en 0
        Date fecha = calendario.getTime();
        System.out.println("fecha1 sin formato = " + fecha);

        /** Para evitar confusiones podemos usar métodos estáticos de Calendar, para los valores */
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1997);
        cal.set(Calendar.MONTH,Calendar.APRIL);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
        cal.set(Calendar.DAY_OF_MONTH, 15);
        cal.set(Calendar.HOUR_OF_DAY, 23); // para 24H
        cal.set(Calendar.HOUR,11); // para am/pm y se debe agregar 'a' o 'p' en el formato (Hora estática)
        cal.set(Calendar.AM_PM, Calendar.PM); // TAMBIÉN INDICARLO CON UN MÉTODO ESTÁTICO
        cal.set(Calendar.MINUTE, 07);
        cal.set(Calendar.SECOND, 47);
        Date date = cal.getTime();
        System.out.println("fecha2 sin formato = " + date);

        /** Creamos una instancia de SimpleDateFormat para dar formato a la fecha
         * y pasamos el formato deseado como argumento */
        SimpleDateFormat formato1 = new SimpleDateFormat("dd-MMMM-yy hh:mm:ss:SSS"); // SSS --> milisegundos
        /** Instancia String para contener la fecha con formato
         * método format() del objeto
         * Objeto Date por argumento */
        String fechaConFormato1 = formato1.format(fecha);
        System.out.println("fecha1 con formato1 = " + fechaConFormato1);

        /** lo mismo con el otro objeto Date */
        SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        String fechaConFormato2 = formato2.format(date);
        System.out.println("fecha2 con formato2 = " + fechaConFormato2);

    }

}

package ClasesDate_y_Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DelStringAlDate {
    public static void main(String[] args) {

        /**
         * IMAGINEMOS QUE VAMOS A TOMAR DATOS DE ENTRADA DE UN FORMULARIO
         * Y OBTENEMOS UN STRING COMO ENTRADA Y LO QUEREMOS CONVERTIR A DATE
         * **/

        /** Creamos un objeto de SimpleDateFormat y elegimos el formato que deberá respetarse en el input */
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");

        /** Objeto de Date inicializado con SimpleDateFormat.parse() que toma como argumento un String */
        try { // Debe manejarse este error de manera obligatoria
            Date fecha = formatoFecha.parse("28-10-1984"); // Se debe respetar el formato de formatoFecha
            System.out.println("fecha sin formato  = " + fecha);
            System.out.println("fecha con formatoFecha = " + formatoFecha.format(fecha));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        /**
         * SE SUGIERE EJERCICIO PARA PRACTICAR CON SCANNER O SWING
         * */



    }
}

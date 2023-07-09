package ClasesDate_y_Calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        /**
         * LO PRIMERO PARA TRABAJAR CON FECHAS ES
         * IMPORTAR java.util.Date
         * */

        /** Creamos una instancia de Date */
        Date fecha = new Date();

        /** Un objeto Date por defecto crea un currentTimeStamp */
        System.out.println("fecha = " + fecha); // Sun Jul 09 23:45:41 CEST 2023

        /** Para personalizarla debemos crear una instancia de
         * SimpleDateFormat
         * --> importar java.text.SimpleDateFormat
         * el formato deseado se lo pasamos por argumento */

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        /**
         * Entonces, para obtener la fecha personalizada debemos:
         *
         * --> Crear un string inicializado con
         * --> Objeto de SimpleDateFormat
         * --> que llama al método format
         * --> Objeto Date como argumento
         *
         * --> Ver los formatos de fecha/hora soportados
         *      Google --> simpleDateFormat java _versión_*/

        /** ejemplo de String de fecha actual con formato **/
        String currenTime = df.format(fecha);
        System.out.println("currenTime = " + currenTime);

    }
}

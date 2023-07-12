package EjerciciosFALTAN_9_Y_10.DeFecha;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjercicioPracticaFeacha {
    public static void main(String[] args) {

        /**
         * DATE y SIMPLEDATEFORMAT
         * **/

        /** Creamos una fecha con una instancia de Date */
        Date fecha1 = new Date();
        // imprime fechaHora actual
        System.out.println("DateFecha1 en Date = " + fecha1);

       /*** Si queremos dar formato a la fecha instanciamos SimpleDateFormat */
        SimpleDateFormat FormatoFecha1 = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss:SSS");

        /*** SimpleDateFormat devuelve un String */
        String strFormatoFecha1 = FormatoFecha1.format(fecha1);
        System.out.println("FormatoFecha1 en String = " + strFormatoFecha1);

        Date fecha2 = new Date();
        SimpleDateFormat formato2 = new SimpleDateFormat("yyyy/MM");
        String strFecha2Formato2 = formato2.format(fecha2);
        System.out.println("strFecha2Formato2 = " + strFecha2Formato2);


        /**
         * CALENDAR
         * **/

        /** Creamos instancia de Calendar (mediante método .getInstance)*/

        Calendar cal1 = Calendar.getInstance();

        /** Creamos fecha estática mediante set() */
        cal1.set(2020, Calendar.AUGUST, 01);

        /** Creamos instancia Date para almacenar la fecha estática */
        Date refAniversario = cal1.getTime();
        System.out.println("refAniversario sin Formato= " + refAniversario);

        /** Usamos el formato acorde a la fecha del calendario */
        SimpleDateFormat formato3 = new SimpleDateFormat("yy-MM-dd");
        String refAniversarioFormato = formato3.format(refAniversario);
        System.out.println("refAniversarioFormato con formato = " + refAniversarioFormato);


    }
}

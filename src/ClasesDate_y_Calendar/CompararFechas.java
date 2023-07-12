package ClasesDate_y_Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Vamos a comparar las fechas
 * **/

public class CompararFechas {
    public static void main(String[] args) {

        try {
            Scanner inputFecha = new Scanner(System.in);

            System.out.println("Ingrese fecha con formato mm-aa");
            SimpleDateFormat fCaducidad = new SimpleDateFormat("MM-yy");
            Date dCaducidad = fCaducidad.parse(inputFecha.next());

            System.out.println("Ingrese fecha con formato dd-mm-aa");
            SimpleDateFormat fNacimiemto = new SimpleDateFormat("dd-MM-yy");
            Date dNacimieto = fNacimiemto.parse(inputFecha.next());

            Date actual = new Date();

            /** con el método after/before de Date */

            if (dCaducidad.before(actual)){
                System.out.println("El producto está caducado");
            } else if (dCaducidad.after(actual)) {
                System.out.println("El producto es apto para consumo");
            } else if (dCaducidad.equals(actual)) {
                System.out.println("El producto debe retirarse hoy");
            }

            /** Con el método compareTo de Date */
            if (dCaducidad.compareTo(actual) < 0){ // retorna num negativo
                System.out.println("El producto está caducado2");
            } else if (dCaducidad.compareTo(actual) > 0) { // retorna num positivo
                System.out.println("El producto es apto para consumo2");
            } else if (dCaducidad.compareTo(actual) == 0) { // retorna cero
                System.out.println("El producto debe retirarse hoy2");
            }

            /**
             * ESTOS MÉTODOS TAMBIÉN SON COMPATIBLES CON OBJETOS CALENDAR
             * **/

         System.out.println("fCaducidad = " + fNacimiemto.format(dNacimieto));

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}

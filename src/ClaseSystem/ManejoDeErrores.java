package ClaseSystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ManejoDeErrores {
    public static void main(String[] args) {
        /**
         * LA CLASE SYSTEM ESTA DISEÑADA PARA QUE NO SE PUEDA
         * HEREDAR DE ELLA
         * INSTANCIAR UN OBJETO
         *
         * SI LO ESTÁ PARA QUE
         * SE PUEDAN USAR DIRECTAMENTE SUS MÉTODOS ESTÁTICOS
         * ENTRE OTRAS COSAS
         * PODEMOS MANEJAR ERRORES --> System.err
         * **/

        /** PARA ESTE EJEMPLO TOMAREMOS EL CÓDIGO DE COMPARAR FECHAS **/
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
            // comentamos la parte original y lo manejamos con System
            // throw new RuntimeException(e);
            System.err.println("Las fechas introducidas no tienen el formato adecuado "+e.getMessage()); // getMesage OPCIONAL
            System.err.println("Revise los formatos de las fechas cuando se solicitan y cíñase a el mismo ");
            // PODEMOS SALIR DEL PROGRAMA CON System.exit(1); (OPCIONAL)
            System.exit(1); // código 1 para cuando se lanza una excepción
            // IGUALMENTE PODEMOS VOLVER A LLAMAR AL MAIN (OPCIONAL)
            main(args);
        }

    }
}

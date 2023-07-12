package EjerciciosFALTAN_9_Y_10.DeFecha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/***
 * Vamos a pedir Fechas de Tipo String por Scanner
 * y las vamos a convertir a Date
 * 1. Pediremos una fecha para caducidad de productos
 * 2. Pediremos una fecha para fecha_nacimiento
 *
 * */

public class FechaStringScanner {
    public static void main(String[] args) {
        try {
            Scanner inputFecha = new Scanner(System.in);
            // 1.
            System.out.println("Ingrese fecha con formato mm-aa");
            SimpleDateFormat fCaducidad = new SimpleDateFormat("MM-yy");
            Date dCaducidad = fCaducidad.parse(inputFecha.next());
            // 2.
            System.out.println("Ingrese fecha con formato dd-mm-aa");
            SimpleDateFormat fNacimiemto = new SimpleDateFormat("dd-MM-yy");
            Date dNacimieto = fNacimiemto.parse(inputFecha.next());
            // IMPRIMIMOS POR CONSOLA LOS RESULTADOS
            System.out.println("dCaducidad sin formato = " + dCaducidad);
            System.out.println("fCaducidad con formato = " + fCaducidad.format(dCaducidad));

            System.out.println("dNacimieto sin formato = " + dNacimieto);
            System.out.println("fNacimiemto con formato = " + fNacimiemto.format(dNacimieto));

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}

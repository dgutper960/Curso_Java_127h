package EjerciciosFALTAN_9_Y_10.ej11_Calcular_Edad;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Para esta tarea se pide ingresar una fecha de nacimiento en formato string,
 * convertirla a una fecha del tipo java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.
 *
 * Intentar usar solo lo visto hasta el momento,
 * no el api de java 8 que lo veremos más adelante, también se pueden apoyar de google que hay varios ejemplos.
 * **/

public class Main {
    public static void main(String[] args) {

        // Creamos bloque try/catch para el manejo de errores
        try {
            // Creamos instancias necesarias
            Scanner inputFecha = new Scanner(System.in);
            SimpleDateFormat ddMMyyyy = new SimpleDateFormat("yyyy-MM-dd");
            Date actual = new Date();
            // Pedimos la fecha al usuario y la almacenamos en otra instancia date
            System.out.println("Ingrese su fecha de nacimiento (formato AAAA-MM-DD)");
            String fNacimiento = inputFecha.next();
            Date fechaUsuario = ddMMyyyy.parse(fNacimiento);

            //CREAMOS ESTE NUEVO FORMATO PARA ELIMINAR LOS GUIONES
            ddMMyyyy = new SimpleDateFormat("yyyyMMdd");

            // pasamos las fechas a int, las restamos y dividimos entre 1000
            int fUsuario = Integer.parseInt(ddMMyyyy.format(fechaUsuario));
            int fActual = Integer.parseInt(ddMMyyyy.format(actual));

            int edad = (fActual-fUsuario) / 10000;
            // imprimimos el resultado
            System.out.println("Su edad es "+ edad);

        } catch (Exception e){
            System.out.println("ERROR AL INGRESAR LAS FECHAS");
            main(args);
        }

    }
}

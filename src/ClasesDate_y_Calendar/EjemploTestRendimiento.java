package ClasesDate_y_Calendar;

import java.util.Date;

public class EjemploTestRendimiento {
    public static void main(String[] args) {

        /**
         * VAMOS A CALCULAR EL TIEMPO QUE TARDA UN PROCESO EN MILISEGUNDOS
         * */

        /** Creamos instancias de Date para el inicio y el fin */
        Date fecha1 = new Date();

        /** inicializamos variable y llamamos al método .getTime() */
        long inicio = fecha1.getTime(); // .getTime() retorna fecha actual en Milisegundos

        /** CREAMOS EL PROCESO QUE QUEREMOS TESTEAR */
        long j = 0;
        for(int i = 0; i<10000000; i++){
            j*=i; // 6 milisegundos
            // System.out.println("j = " + j); // 17 segundos
        }
        Date fecha2 = new Date();
        /** Creamos Date pata recoger el getTime() después del proceso
         * y almacenamos la resta de la fecha2 menos la fecha1 */
        long resultado = fecha2.getTime() - fecha1.getTime();

        /** Sacamos el resultado por consola */
        System.out.println("resultado = " + resultado);
    }

}

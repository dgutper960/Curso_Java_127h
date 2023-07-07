package Condicionales;

/**
 * Vamos a usar un if para evaluar los días que tiene el mes (representado por un int)
 * Debemos tener en cuenta los años bisiestos
 * */

public class IF_ClacularDiasMes {
    public static void main(String[] args) {

        // declaramos variables para el mes de entrada y para devolver el número de días
        int mes = 20;
        int anyo = 1996;
        //Un año es bisiesto si es divisible por 4 y no lo es por 100 o si es divisible por 400
        boolean esBisiesto = anyo%4==0 && anyo%100!=0 || anyo%400==0; /** RECORDEMOS LAS PRIORIDADES */

        int numDias = 0;

        /** creamos condición para los meses con 31 días */
       if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
            //sentencia para este bloque
            numDias = 31;
           System.out.println("El número de días del mes "+mes+" es "+numDias);
            /** creamos condición para meses con 30 días */
        } else if (mes==4 || mes==6 || mes==9 || mes==11) {
            numDias = 30;
           System.out.println("El número de días del mes "+mes+" es "+numDias);
        } else if (mes==2 && esBisiesto) {
            System.out.println("Evaluando si el año es bisiesto...");
            numDias = 29;
           System.out.println("El número de días del mes "+mes+" es "+numDias);
        } else if (mes==2 && !esBisiesto) {
           System.out.println("Evaluando si el año es bisiesto...");
           numDias = 28;
           System.out.println("El número de días del mes "+mes+" es "+numDias);
        }else {
            System.out.println("El mes introducido no es correcto, solo números del 1 al 12");
        } /* OJO COMO NO TENEMOS UN INPUT REAL, SI LLAMAMOS A main(args) tenemos un bucle infinito */

    }
}

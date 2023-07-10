package EjerciciosFALTAN_9_Y_10_deFechaPracticar;

import java.util.Scanner;

/**
 * VAMOS A OBTENER POR CONSOLA 3 NÚMEROS
 * VAMOS A DEVOLVER EL MAYOR
 * SE DEBE USAR EL OPERADOR TERNARIO Y LA CLASE SCANNER
 * */

public class OperadorTernarioNumMayor {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.println("INSERTADOS 3 NÚMEROS, SE DEVOLVERÁ EL MAYOR" +
                "\n\nInserte el 1er número");
        int a = num.nextInt();
        System.out.println("Inserte el 2º número");
        int b = num.nextInt();
        System.out.println("Inserte el 3er número");
        int c = num.nextInt();

        /** implementamos el operador ternario */
        // inicializamos con el mayor entre a y b
        int maximo = a > b ? a : b;
        // comparamos el mayor con c
        maximo = maximo > c ? maximo : c;

        System.out.println("\nEl número mayor es el "+maximo);
    }
}
